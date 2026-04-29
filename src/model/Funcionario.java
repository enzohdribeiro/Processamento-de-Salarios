package model;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamento();
    public abstract String getCargo();
    public double getSalarioBase() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

}
