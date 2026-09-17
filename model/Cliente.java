package model;

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

    public void exibirCliente(String nomedoCliente, String numDoCliente) {
        this.nomeDoCliente = nomedoCliente;
        this.numDoCliente = numDoCliente;
        System.out.println("Nome do cliente é: " + nomedoCliente);
        System.out.println("Numero: " + numDoCliente);
    }
}
