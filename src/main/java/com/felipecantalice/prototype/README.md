# Prototype

É um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código ficar dependente de suas classes.

"Especificar os tipos de objetos a serem criados usando uma instancia como protótipo(já instanciado) e criar novos objetos ao copiar este protótipo." -GOF

<br>

## Problema

Como posso criar um objeto novo, aproveitando o estado previamente existente de outro objeto?

<br>

## Solução

Definir um prototype que retorn a cópia de si mesmo.

<br>

## Prós

* Você pode clonar objetos sem acoplá-los a suas classes concretas.
* Você pode se livrar de códigos de inicialização repetidos em troca de clonar protótipos pré-construídos.
* Você pode produzir objetos complexos mais convenientemente.
* Você tem uma alternativa para herança quando lidar com configurações pré determinadas para objetos complexos.

<br>

## Contras

* Clonar objetos complexos que têm referências circulares pode ser bem complicado.