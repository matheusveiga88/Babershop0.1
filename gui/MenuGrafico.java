package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Cliente;
import model.Servicos;
import model.Agendar;
import model.Barbeiros;

public class MenuGrafico {

    private Servicos servicos = new Servicos();
    private Cliente cliente = new Cliente();
    private Agendar agendar = new Agendar();
    private Barbeiros barbeiros = new Barbeiros();

    public void iniciar() {
        // Criando a janela principal
        JFrame janela = new JFrame("BarberShop - Sistema de Gestão");
        janela.setSize(400, 450);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null); // Centraliza a janela na tela
        janela.setLayout(new GridLayout(6, 1, 10, 15)); // Organiza em botões empilhados

        // Título estilizado no topo
        JLabel titulo = new JLabel("BarberShop", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setForeground(Color.RED);
        janela.add(titulo);

        // Criando os botões com as opções do seu menu original
        JButton btnServicos = new JButton("1- Serviços do Salão");
        JButton btnClientes = new JButton("2- Clientes Cadastrados");
        JButton btnAgendar = new JButton("3- Agendar Cliente");
        JButton btnBarbeiros = new JButton("4- Afiliados Barbeiros");
        JButton btnSair = new JButton("0- Sair do Programa");

        // Adicionando os botões na tela
        janela.add(btnServicos);
        janela.add(btnClientes);
        janela.add(btnAgendar);
        janela.add(btnBarbeiros);
        janela.add(btnSair);

        // --- Configuração das Ações de cada botão ---

        // 1. Serviços do Salão
        btnServicos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                servicos.novoServico("Corte de Cabelo", 25.90, 60);
                
                String resultado = "Serviço adicionado:\n" +
                                   "• Nome: " + servicos.getServico() + "\n" +
                                   "• Valor: R$ " + servicos.getValor() + "\n" +
                                   "• Tempo: " + servicos.getTempoServico() + " minutos";
                JOptionPane.showMessageDialog(janela, resultado, "Serviços", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // 2. Clientes Cadastrados
        btnClientes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Substituindo o Scanner por caixas de diálogo visuais
                String nome = JOptionPane.showInputDialog(janela, "Digite o nome do cliente:", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
                if (nome == null) return; // Se o usuário cancelar
                
                String numero = JOptionPane.showInputDialog(janela, "Digite o número do cliente:", "Cadastro de Cliente", JOptionPane.QUESTION_MESSAGE);
                if (numero == null) return;

                cliente.setNome(nome);
                cliente.setNumero(numero);
                cliente.setDesconto(10);
                cliente.setFidelidade(true);
                cliente.setQuantidadeVisitas(5);

                String resultado = "Cliente Cadastrado com Sucesso:\n" +
                                   "• Nome: " + cliente.getNome() + "\n" +
                                   "• Número: " + cliente.getNumero() + "\n" +
                                   "• Desconto: " + cliente.getDesconto() + "%\n" +
                                   "• Fidelidade: Sim\n" +
                                   "• Visitas: " + cliente.getQuantidadeVisitas();
                JOptionPane.showMessageDialog(janela, resultado, "Clientes", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // 3. Agendar Cliente
        btnAgendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog(janela, "Digite o nome do cliente para agendamento:", "Agendar Cliente", JOptionPane.QUESTION_MESSAGE);
                if (nome == null) return;
                
                String numero = JOptionPane.showInputDialog(janela, "Digite o número do cliente:", "Agendar Cliente", JOptionPane.QUESTION_MESSAGE);
                if (numero == null) return;

                agendar.setAgendarnome(nome);
                agendar.setAgendarnumero(numero);

                String resultado = "Agendamento Confirmado!\n" +
                                   "• Cliente: " + agendar.getAgendarnome() + "\n" +
                                   "• Número: " + agendar.getAgendarnumero();
                JOptionPane.showMessageDialog(janela, resultado, "Agendamento", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // 4. Afiliados Barbeiros
        btnBarbeiros.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                barbeiros.exibirAfiliados("Reyzon Hugo Polaquine", "99-99999-9999", "Corte infantil");
                barbeiros.exibirdetalhesprofssionais(5, 3000.0, 1);

                String resultado = "Dados do Barbeiro Afiliado:\n" +
                                   "• Nome: " + barbeiros.getNome() + "\n" +
                                   "• Número: " + barbeiros.getNumero() + "\n" +
                                   "• Especialidade: " + barbeiros.getEspecialidade() + "\n\n" +
                                   "Detalhes Profissionais:\n" +
                                   "• Número de cortes: " + barbeiros.getNumerodecortes() + "\n" +
                                   "• Salário: R$ " + barbeiros.getSalario() + "\n" +
                                   "• Número da bancada: " + barbeiros.getNumeroDaBancada();
                JOptionPane.showMessageDialog(janela, resultado, "Barbeiros", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        // 0. Sair do Programa
        btnSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(janela, "SAINDO...", "Encerrando", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            }
        });

        // Exibir a janela montada
        janela.setVisible(true);
    }
}
