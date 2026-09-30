package model;

public class Barbeiros extends Pessoas {
    private String especialidade;
    private int numerodecortes;
    private double salario;
    private int numeroDaBancada;

    public Barbeiros(String nome, String numero,String especialidade,int numerodecortes, int numeroDaBancada, double salario){
        super(nome,numero);
        this.especialidade = especialidade;
        this.numerodecortes = numerodecortes;
        this.numeroDaBancada = numeroDaBancada;
        this.salario = salario;
        
    }
        


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNumerodecortes() {
        return numerodecortes;
    }

    public void setNumerodecortes(int numerodecortes) {
        this.numerodecortes = numerodecortes;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getNumeroDaBancada() {
        return numeroDaBancada;
    }

    public void setNumeroDaBancada(int numeroDaBancada) {
        this.numeroDaBancada = numeroDaBancada;
    }

    public void exibirAfiliados() {
        
        
        System.out.println("Nome do barbeiro: " + getNome());
        System.out.println("Número do barbeiro: " + getNumero());
        System.out.println("Especialidade: " + getEspecialidade());
    }

    public void exibirdetalhesprofssionais() {
        
        System.out.println("Número de cortes: " + getNumerodecortes());
        System.out.println("Salário: " + getSalario());
        System.out.println("Número da bancada: " + getNumeroDaBancada());
    }
}