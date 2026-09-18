package model;
import java.util.Scanner;

public class Cliente {
    private String nomeDoCliente;
    private String numDoCliente;

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente) {
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getNumDoCliente() {
        return numDoCliente;
    }

    public void setNumDoCliente(String numDoCliente) {
        this.numDoCliente = numDoCliente;
    }

    public void exibirCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        nomeDoCliente = scanner.nextLine();
        System.out.print("Digite o número do cliente: ");
        numDoCliente = scanner.nextLine();
        System.out.println("Nome do cliente é: " + nomeDoCliente);
        System.out.println("Numero: " + numDoCliente);
    }
}
