package gui;

import java.util.Scanner;

import model.Cliente;
import model.Servicos;
import model.Agendar;
import model.Barbeiros;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Servicos servicos = new Servicos("Corte de cabelo",35.90,60);
    Cliente cliente = new Cliente(10, true, 5);
    Agendar agendar = new Agendar();
    Barbeiros barbeiros = new Barbeiros("Reyzon Hugo Polaquine", "99-99999-9999", "Corte infantil",10,1,3000.00);
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
            System.out.println("4- Afiliados Barbeiros");
            System.out.println("0- Sair do Programa");
            contadormenu = scanner.nextInt();
            scanner.nextLine();

            switch (contadormenu) {
                case 1:
                    servicos.novoServico();
                    
                    break;
                case 2:
                    cliente.exibirCliente(scanner);
                    cliente.exibirClienteComDesconto();
                    break;
                case 3:
                    agendar.agendarcliente(scanner);
                    break;
                case 4:
                    barbeiros.exibirAfiliados();
                    barbeiros.exibirdetalhesprofssionais();
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
