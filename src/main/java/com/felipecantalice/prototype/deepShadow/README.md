# Problema: Deep shadow

Existe casos em que objetos, possuem objetos aninhados.

<br>

Exemplo:
* User(String name,int age, Address address)
* Address(String street, int number)

<br><br>

## Problema

Como posso criar um clone de um objeto, e atribuir novos valores a objetos aninhados de forma independente?

```java
User user = new User("Clone", 25, new Address("ABC Street", 1000));


System.out.println(user);

		
User cloneUser = user.clone();
cloneUser.name = "Clone x2";
cloneUser.address.street = "Double Street";


System.out.println(user);
System.out.println(cloneUser);


> [name=Clone, age=25, address=Address [street=ABC Street, number=1000]]
> [name=Clone, age=25, address=Address [street=Double Street, number=1000]]
> [name=Clone x2, age=25, address=Address [street=Double Street, number=1000]]
```

<br>

1. O objeto user foi clonado;
2. Ao modificarmos o nosso clone, vemos que o original também foi alterado;

<br>

### Linha problematica, Classe User

<br>

```java
@Override
public User clone() throws CloneNotSupportedException {
	return (User) super.clone();
}
```

<br><br>

## Solução 

No objeto User, precisamor fazer uma cópia rasa;
```java
@Override
public User clone() throws CloneNotSupportedException {

	User cloneUser = (User) super.clone();
	cloneUser.address = (Address) cloneUser.address.clone();
	return cloneUser;
}
```

1. Chamamos o super para atribuir o clone;
2. Então chamamos o método clone() da classe aninhada 