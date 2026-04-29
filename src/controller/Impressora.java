package controller;

import model.Desenvolvedor;
import model.Funcionario;

public class Impressora {
    public static void imprimeFuncionario(Funcionario funcionario){
        if(funcionario.getSalarioBase()==0){
            System.out.println("Salário base inválido");
            return;
        }
        System.out.println("Funcionario(a): " + funcionario.getNome());
        System.out.println("Cargo: "+funcionario.getCargo());
        System.out.println("Salário base: "+funcionario.getSalarioBase());
        System.out.println("Salário final: "+funcionario.calcularPagamento());
        System.out.println("------------------------------");
    }
    public static void imprimeFuncionario(Desenvolvedor funcionario, double valorProjeto){
        if(funcionario.getSalarioBase()==0){
            System.out.println("Salário base inválido");
            return;
        }
        System.out.println("Funcionario(a): " + funcionario.getNome());
        System.out.println("Cargo: "+funcionario.getCargo());
        System.out.println("Salário base: "+funcionario.getSalarioBase());
        System.out.println("Salário final: "+funcionario.calcularPagamento(valorProjeto));
        System.out.println("------------------------------");
    }
}
