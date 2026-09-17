package model;
import java.util.Scanner;

public class Cliente extends Pessoas {
    private int desconto;
    private boolean fidelidade;
    private int quantidadeVisitas = 0;

    
    public int getDesconto() {
        return desconto;
    }



    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }



    public boolean isFidelidade() {
        return fidelidade;
    }



    public void setFidelidade(boolean fidelidade) {
        this.fidelidade = fidelidade;
    }



    public int getQuantidadeVisitas() {
        return quantidadeVisitas;
    }



    public void setQuantidadeVisitas(int quantidadeVisitas) {
        this.quantidadeVisitas = quantidadeVisitas;
    }



    public void exibirCliente(Scanner scanner) {
        System.out.print("Digite o nome do cliente: ");
        setNome(scanner.nextLine());
        System.out.print("Digite o número do cliente: ");
        setNumero(scanner.nextLine());
        System.out.println("Nome do cliente é: " + getNome());
        System.out.println("Numero: " + getNumero());
    }
    public void exibirClienteComDesconto(int desconto, boolean fidelidade, int quantidadeVisitas) {
        setDesconto(desconto);
        setFidelidade(fidelidade);
        setQuantidadeVisitas(quantidadeVisitas);
        System.out.println("Desconto: " + getDesconto() + "%");
        System.out.println("Fidelidade: " + (isFidelidade() ? "Sim" : "Não"));
        System.out.println("Quantidade de visitas: " + getQuantidadeVisitas());

    }
}
