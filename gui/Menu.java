package gui;

import java.util.Scanner;

import model.Cliente;
import model.Servicos;
import model.Agendar;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Servicos servicos = new Servicos();
    Cliente cliente = new Cliente();
    Agendar agendar = new Agendar();

    private int contadormenu = -1;

    public void menuprincipal() {

        while (contadormenu != 0) {

            System.out.println("**********************************");
            System.out.println("            \u001B[1;\u001B[31mBaberShop\u001B[0m");
            System.out.println("**********************************");
            System.out.println("Escola a opçao:");
            System.out.println("1- Serviços do Salão");
            System.out.println("2- Clientes Cadastrados");
            System.out.println("3- Agendar Cliente");
            System.out.println("0- Sair do Programa");
            contadormenu = scanner.nextInt();
            scanner.nextLine();

            switch (contadormenu) {
                case 1:
                    servicos.novoServico("Corte de Cabelo", 25.90, 60);
                    break;
                case 2:
                    cliente.exibirCliente("Matheus Veiga de Souza", "11958880711");
                    break;
                case 3:
                    agendar.agendarcliente(scanner);
                    break;
                case 0:
                    System.out.println("SAINDO...");
                    contadormenu = 0;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

}
