# JPA [@ManyToMany](https://docs.oracle.com/javaee/6/api/javax/persistence/ManyToMany.html)
Exemplo simple de JPA [@annotation](http://www.oracle.com/technetwork/middleware/ias/toplink-jpa-annotations-096251.html) [@ManyToMany](https://docs.oracle.com/javaee/6/api/javax/persistence/ManyToMany.html)

## Dependência
O projeto executa em banco MySQL 5.1, modificar em pom.xml

### persistence.xml
Alterar o [Persistence Connection](#), caso necessário
```
properties
```

## Executar Testes
Executar main
```
App.class 
```

### Pessoa.class | Curso.class
Descomentar o trecho 
```
@GeneratedValue(strategy = GenerationType.IDENTITY)
```
Caso não vá utilizar App.class
