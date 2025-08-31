Projeto: Veículos em Java com o Padrão de Design Strategy

Este projeto é um exemplo prático de como aplicar o Strategy Pattern (Padrão Estratégia) em Java, e faz parte do desafio do bootcamp DIO. O objetivo é simular diferentes tipos de veículos (Carro e Moto) e seus comportamentos, como ligar, acelerar e frear, de forma flexível e organizada.

->O Padrão de Design Strategy

O Padrão Estratégia é usado para definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Em vez de uma classe implementar a lógica de um comportamento diretamente, ela delega essa responsabilidade a um objeto separado, que é a "estratégia".

Neste projeto, o comportamento de aceleração varia entre um Carro e uma Moto. Para resolver isso de forma elegante, a lógica de aceleração é separada da classe Veiculo principal:


1.Interfaces: As interfaces ComportamentoAceleracao e ComportamentoFrenagem definem os métodos que todas as estratégias devem seguir.


2.Estratégias Concretas: Classes como AceleracaoSuave e AceleracaoPotente implementam a interface, cada uma com sua própria lógica.


3.Composição: A classe Veiculo contém uma referência para a interface de comportamento. Quando o método acelerar() é chamado, o veículo apenas delega a ação para sua estratégia interna.


Essa abordagem permite que o comportamento de aceleração seja facilmente trocado em tempo de execução, sem a necessidade de modificar as classes dos veículos.


->Como Funciona

A classe principal (MainVeiculoComStrategy) demonstra a aplicação do padrão:

1.Instancia um Carro e uma Moto, cada um criado com sua estratégia de aceleração específica.

2.Chama os métodos ligar(), acelerar() e frear() em cada veículo, mostrando como o mesmo método produz saídas diferentes graças às estratégias que cada objeto possui.
