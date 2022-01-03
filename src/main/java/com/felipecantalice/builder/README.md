# Builder

É um padrão criacional que permite a você construir objetos complexos passo a posso. O padrão permite que você produza diferentes tipos e representações de um objeto usando o mesmo código de construção.

"Separa  construação de um objeto complexo de sua representação para que o mesmo processo de construção possa criar representações diferentes" - GOF

## Problema

* Como uma classe pode criar diferentes representações de um mesmo objeto complexo(vários atributos)?

## Solução

* Delegar a criação do objeto para um Builder ao inves de instanciar o objeto concreto diretamente;
* Dividir a criação do objeto em partes;
* Encapsular a criação e montagem dessas partes em um Builder separado(outra classe que implementa o Builder).

