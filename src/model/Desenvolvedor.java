package model;

public class Desenvolvedor extends Funcionario{
    private String cargo = "Desenvolvedor";
    private double salario;
    private double bonusFixo = 0.1;

    public Desenvolvedor(String nome) {
        super(nome);
    }

    public Desenvolvedor(String nome, double salarioBase) {
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
    public double calcularPagamento(double valorProjeto){
        salario = salarioBase + salarioBase*bonusFixo;
        salario += 0.1*valorProjeto;
        return salario;
    }

}
