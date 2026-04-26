# Projeto Final BootCamp AWS Java

Projeto didático em Java para estudo de padrões de projeto GoF.

## Sobre o projeto

Este repositório demonstra, de forma simples, a implementação e o uso de:

- Singleton
- Strategy
- Facade

O ponto de entrada da aplicação é `dio.gof.TestandoPadroes`, que executa exemplos dos três padrões no console.

## Tecnologias

- Java 20
- Projeto Java puro, sem Maven ou Gradle
- Estrutura compatível com Eclipse

## Estrutura

- `src/dio/gof/singletons` - exemplos de Singleton
- `src/dio/gof/strategy` - exemplos de Strategy
- `src/dio/gof/facade` - implementação da Facade
- `src/subsistemas` - classes de apoio simulando serviços externos

## Como executar

### Pelo terminal

1. Compile os arquivos:

```bash
javac -d bin $(find src -name "*.java")
```

2. Execute a classe principal:

```bash
java -cp bin dio.gof.TestandoPadroes
```

### Pelo Eclipse

1. Importe o projeto como projeto Java existente.
2. Verifique se o JRE está configurado para Java 20.
3. Execute `dio.gof.TestandoPadroes`.

## O que o exemplo faz

- Cria instâncias das variações de Singleton e mostra que elas reutilizam a mesma instância.
- Troca comportamentos de movimento de um robô usando Strategy.
- Usa Facade para simplificar a interação entre consulta de CEP e gravação de cliente.

## Saída esperada

A execução imprime mensagens no console mostrando:

- referências dos objetos Singleton
- ações do robô (`Se movendo`, `Atacando`, `Se protegendo`)
- mensagem de cadastro do cliente via Facade

## Observações

- `CepApi` e `CrmServices` são simulações, sem acesso real a serviços externos.
- O projeto foi montado para fins de estudo e prática de design patterns.
