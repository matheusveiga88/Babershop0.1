<img width="630" height="596" alt="image" src="https://github.com/user-attachments/assets/ae5588e9-2065-4886-8e51-4840240a8f1f" />

# BarberShop 💈

Sistema de gerenciamento para barbearias desenvolvido em **Java**. O projeto utiliza os conceitos de Orientação a Objetos (POO), encapsulamento, herança e organização de pacotes para simular o fluxo de atendimento de clientes, agendamento de horários, cadastro de barbeiros afiliados e definição de serviços.

## 🚀 Funcionalidades

O sistema conta com um menu interativo executado via console (`Main.java`), permitindo as seguintes operações:

* **Gerenciamento de Serviços:** Cadastro e exibição de serviços do salão, com definição de nome, valor (R$) e tempo estimado de execução.
* **Cadastro de Clientes:** Captura de dados básicos (nome e telefone) através do console e aplicação de regras de fidelidade ou descontos específicos.
* **Agendamento:** Módulo para reserva e registro de atendimentos vinculados aos clientes do estabelecimento.
* **Afiliados e Profissionais:** Listagem de barbeiros integrados, exibindo especialidades, salários e identificação de bancadas de trabalho.

## 📂 Estrutura do Projeto

A arquitetura do código está dividida em pacotes lógicos para garantir uma melhor separação de responsabilidades:

```text
src/
├── gui/
│   └── Menu.java          # Camada de interface, gerencia as opções do menu interativo
├── model/
│   ├── Pessoas.java       # Classe base (Superclasse) com atributos comuns (Nome, Número)
│   ├── Cliente.java       # Subclasse de Pessoas, adiciona regras de fidelidade e desconto
│   ├── Barbeiros.java     # Subclasse de Pessoas, gerencia especialidade, salário e bancada
│   ├── Agendar.java       # Classe responsável pelo fluxo de marcação de horários
│   └── Servicos.java      # Define a estrutura de preços e durações dos cortes/barbas
└── Main.java              # Ponto de entrada da aplicação (Instancia e inicia o Menu)
```

## 🛠️ Tecnologias Utilizadas

* **Java SE (Standard Edition)**
* **Scanner API** (para captura de dados via console)
* **Paradigma Orientado a Objetos** (Herança, Encapsulamento, Métodos Acessores/Modificadores)

## 🔧 Como Executar o Projeto

### Pré-requisitos
Certifique-se de ter o **JDK (Java Development Kit)** instalado na sua máquina (versão 8 ou superior).

### Passo a Passo

1. **Clonar o Repositório:**
   ```bash
   git clone https://github.com/seu-usuario/BarberShop.git
   cd BarberShop
   ```

2. **Compilar o Projeto:**
   Navegue até a pasta raiz onde estão os pacotes e compile todos os arquivos `.java`:
   ```bash
   javac Main.java gui/Menu.java model/*.java
   ```

3. **Executar a Aplicação:**
   Rode a classe principal que inicializa o menu interativo:
   ```bash
   java Main
   ```

## 💻 Demonstração do Menu Principal

Ao iniciar a aplicação, a interface do terminal exibirá as seguintes opções numéricas:
1. **Serviços do Salão** (Exibe os serviços e valores disponíveis)
2. **Clientes Cadastrados** (Exibe e captura informações de clientes com descontos)
3. **Agendar Cliente** (Fluxo interativo para novas reservas)
4. **Afiliados Barbeiros** (Exibe detalhes técnicos e equipe profissional)
0. **Sair do Programa**
