package model;

import java.util.Scanner;

public class Agendar {

    private String agendarnome;
    private String agendarnumero;
    private String agendarservico;

    public String getAgendarnome() {
        return agendarnome;
    }

    public void setAgendarnome(String agendarnome) {
        this.agendarnome = agendarnome;
    }

    public String getAgendarnumero() {
        return agendarnumero;
    }

    public void setAgendarnumero(String agendarnumero) {
        this.agendarnumero = agendarnumero;
    }

    public void agendarcliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        agendarnome = scanner.nextLine();
        System.out.print("Digite o numero do cliente: ");
        agendarnumero = scanner.nextLine();
        System.out.println("Cliente: " + agendarnome + " agendado! \nNumero: " + agendarnumero);
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine();
    }

}
