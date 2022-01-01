# Functional Clone Builder

Essa é uma mistura do pradrão Prototype e Builder;

Criação de usuário com Endereço;

Delegamos o método clone para Usuário e Endereço, para permitir a clonagem;

Adicionamos a classe Builder para ambas as entidades, para permitir alterar as informações em uma entidade clonada, com isso conseguimos trocar uma informação específica do objeto.


<img src="../../../../../../../diagramas\prototype\cloneBuilder.jpg">


## Exemplo de Builder em uma entidade


```java

public class User implements Cloneable {
	
    { ... }
	
	public Builder cloneBuilder() {
		return new Builder(name, age, address);
	}
	
	public static class Builder {
		private String name;
		private Integer age;
		private Address address;
		
		private Builder(String name, Integer age, Address address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}
		
		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public Builder withAddress(Address address) {
			this.address = address;
			return this;
		}
		
		public User now() {
			return new User(name, age, address);
		}
	}
```

### Utilizando

```java

    User user = new User("ToClone", 25, new Address("ABC Street", 1000));
	
	User cloneUser = user
            .cloneBuilder()
            .withName("Cloned++")
            .now();
		
	User anotherUser = cloneUser.cloneBuilder()
			.withAge(100)
			.withAddress(new Address("A Street", 500))
			.now();

```