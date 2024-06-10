package br.com.ets.metodos.exercicio02;

import java.util.Scanner;

public class Validacao {

    public boolean validarSalario(Scanner sc, double salarioBruto) {
        if(salarioBruto>=500 && salarioBruto<=30000) {
            return true;
        }
        else {
            System.out.println("\nValor inválido! Insira um valor maior ou igual a R$500.00 e menor ou igual a R$30000.00.\n");
            return false;
        }
    }

    public boolean validarHorasExtras(Scanner sc, int horasExtras) {
        if(horasExtras>=0) {
            return true;
        }
        else {
            System.out.println("\nValor inválido! Insira um valor maior ou igual a 0\n");
            return false;
        }
    }

}
