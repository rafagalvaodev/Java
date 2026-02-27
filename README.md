# Repositório de Aprendizado e Projetos Java

## Visão Geral

Este repositório serve como uma coleção pessoal e em constante evolução de exercícios de programação em Java, trechos de código e pequenos projetos completos. Ele está meticulosamente organizado para documentar vários caminhos de aprendizado e aplicações práticas da linguagem Java, variando de conceitos fundamentais a tópicos mais avançados.

## Destaques do Conteúdo

O repositório está estruturado para fornecer exemplos claros e implementações práticas em diferentes aspectos do desenvolvimento Java:

- **Fundamentos do Java**: Explore a sintaxe básica, tipos de dados, variáveis, operadores e estruturas de controle de fluxo.
    
- **Programação Orientada a Objetos (POO)**: Aprofunde-se nos princípios centrais da POO, como classes, objetos, construtores, herança, polimorfismo, abstração e encapsulamento por meio de exemplos práticos.
    
- **APIs Core do Java**: Entenda e utilize recursos essenciais da Biblioteca Padrão do Java, incluindo o Collections Framework, operações de E/S (I/O), tratamento de exceções e muito mais.
    
- **Implementações de Pequenos Projetos**: Descubra aplicações Java completas, embora compactas, que demonstram como diferentes conceitos podem ser integrados para resolver problemas do mundo real.
    
- **Resolução de Problemas e Algoritmos**: Possível inclusão de estruturas de dados e algoritmos comuns implementados em Java.
    

## Stack Tecnológica

Este repositório foca principalmente na linguagem Java. Projetos individuais dentro dos subdiretórios podem introduzir bibliotecas ou frameworks adicionais.

## Primeiros Passos

Para explorar e executar os exemplos de código e projetos neste repositório, você precisará do Java Development Kit (JDK) instalado em seu sistema.

### Pré-requisitos

- **Java Development Kit (JDK)**: A versão 8 ou superior é recomendada para total compatibilidade com os exemplos de código.

### Instalação e Configuração

1. **Clonar o repositório** Comece clonando todo o repositório para sua máquina local:
    
    Bash
    
    ```
    git clone https://github.com/rafagalvaodev/Java.git
    cd Java
    ```
    
2. **Navegar para um projeto ou estudo específico** O repositório está organizado em `Estudos` e `Projetos`. Cada subdiretório dentro dessas pastas é tipicamente um módulo independente. Navegue até a área específica que deseja explorar:
    
    Bash
    
    ```
    # Para explorar um módulo de aprendizado:
    cd Estudos/NomeDaPasta
    
    # Para trabalhar em um projeto específico:
    cd Projetos/NomeDoProjeto
    ```
    
3. **Compilar e Executar (para arquivos `.java` avulsos)** Para arquivos Java simples que não utilizam um sistema de build (como Maven ou Gradle), você pode compilá-los e executá-los diretamente do terminal:
    
    Bash
    
    ```
    # Compilar o arquivo fonte Java
    javac SeuPrograma.java
    
    # Executar a classe Java compilada
    java SeuPrograma
    ```
    
4. **Abrir em um Ambiente de Desenvolvimento Integrado (IDE)** Para projetos mais complexos ou para uma experiência de desenvolvimento mais fluida, é altamente recomendável importar os diretórios individuais dos projetos em uma IDE Java, como IntelliJ IDEA, Eclipse ou Apache NetBeans. Essas IDEs gerenciarão dependências, compilação e execução automaticamente. Procure por arquivos `pom.xml` (Maven) ou `build.gradle` (Gradle) dentro dos diretórios dos projetos, caso eles utilizem uma ferramenta de build.
    

## Estrutura do Projeto

O repositório mantém uma separação clara entre exercícios de aprendizado e projetos completos:

```
Java/
├── Estudos/  # Contém vários módulos de aprendizado, trechos de código e exercícios teóricos.
│   ├── MaquinaSnack/ # Exercicio simples de logica
│   │   └── ...
│   ├── Estudando Queries/ # Exercicio de consultas usando sql
│   │   └── ...
├── Projetos/            # Contém projetos Java independentes e autocontidos.
│   ├── Santander_dev_week_2023/
│   │   └── src/           # Código-fonte do projeto
│   │   └── gradlew
│   │   └── ...
│   ├── dslist/
│   │   └── src/           # Código-fonte do projeto
│   │   └── pom.xml
└── README.md            # Este arquivo de documentação
```
