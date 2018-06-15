package br.com.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.entity.Curso;
import br.com.entity.Pessoa;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenciaJPA");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			
			Curso curso1 = new Curso();
			curso1.setId(1);
			curso1.setNome("Teste Curso 1");
			Curso curso2 = new Curso();
			curso2.setId(2);
			curso2.setNome("Teste Curso 2");
			
			List<Curso> lCursos = new ArrayList<>();
			lCursos.add(curso1);
			lCursos.add(curso2);
			
			Pessoa pessoa = new Pessoa();
			pessoa.setId(1);
			pessoa.setNome("Pessoa1");
			pessoa.setCursos(lCursos);
			
			em.persist(pessoa);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			emf.close();
		}
	}
}
