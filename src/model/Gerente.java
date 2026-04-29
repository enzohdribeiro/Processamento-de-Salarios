package model;

public class Gerente extends Funcionario{
    private static String cargo;
    private double salario;
    private double bonusFixo;

    {
        cargo = "Gerente";
        bonusFixo = 0.2;
    }

    public Gerente(String nome) {
        super(nome);
    }

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento(){
        salario = salarioBase + salarioBase*bonusFixo;
        return salario;
    }
    @Override
    public String getCargo(){
        return cargo;
    }
}
