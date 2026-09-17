package model;

public class Barbeiros extends Pessoas {
    private String especialidade;
    private int numerodecortes;
    private double salario;
    private int numeroDaBancada;

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

    public void exibirAfiliados(String nome, String numero, String especialidade) {
        setNome(nome);
        setNumero(numero);
        setEspecialidade(especialidade);
        System.out.println("Nome do barbeiro: " + getNome());
        System.out.println("Número do barbeiro: " + getNumero());
        System.out.println("Especialidade: " + getEspecialidade());
    }

    public void exibirdetalhesprofssionais(int numerodecortes, double salario, int numeroDaBancada) {
        setNumerodecortes(numerodecortes);
        setSalario(salario);
        setNumeroDaBancada(numeroDaBancada);
        System.out.println("Número de cortes: " + getNumerodecortes());
        System.out.println("Salário: " + getSalario());
        System.out.println("Número da bancada: " + getNumeroDaBancada());
    }
}