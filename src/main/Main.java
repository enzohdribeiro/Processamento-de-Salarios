package main;

import controller.Impressora;
import model.Desenvolvedor;
import model.Funcionario;
import model.Gerente;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("João",4750);
        Desenvolvedor d2 = new Desenvolvedor("Maria",4750);
        Gerente g1 = new Gerente("Luana",6650);
        Gerente g2 = new Gerente("Joaquim",6650);

        Impressora.imprimeFuncionario(d1);
        Impressora.imprimeFuncionario(d2,9455);
        Impressora.imprimeFuncionario(g1);
        Impressora.imprimeFuncionario(g2);

    }
}
