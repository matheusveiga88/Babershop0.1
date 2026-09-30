package model;

public class Servicos {
    private String servico;
    private double valor;
    private double tempoServico;

    public Servicos(String servico,Double valor, double tempodeservico) {
        this.servico = servico;
        this.valor = valor;
        this.tempoServico = tempodeservico;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setTempoServico(double tempoServico) {
        this.tempoServico = tempoServico;
    }

    public double getTempoServico() {
        return tempoServico;
    }

public void novoServico() {
        System.out.println("Serviço: " + this.servico + "\nValor: R$" + this.valor + "\nTempo de serviço: " + this.tempoServico + " minutos");
        }

}
