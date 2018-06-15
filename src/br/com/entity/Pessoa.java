package br.com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Pessoa")
public class Pessoa {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	@Column(name="id", unique=true, nullable=false)
	private Integer id;
	@Column(name="nome", unique=false, nullable=false)
	private String nome;
	@ManyToMany(fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinTable(name="Pessoa_Curso", joinColumns={@JoinColumn(name="id_pessoa", nullable=false, updatable=false)},
		inverseJoinColumns={@JoinColumn(name="id_curso", nullable=false, updatable=false)})
	private List<Curso> cursos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
}
