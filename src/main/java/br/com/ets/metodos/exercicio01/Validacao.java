package br.com.ets.metodos.exercicio01;

import java.util.Scanner;

public class Validacao
{

    public boolean validarNota(Scanner sc, double nota)
    {
        if(nota >= 0 && nota <= 10) {
            return true;
        }
        else {
            System.out.println("\nValor inválido! Insira apenas valores entre 0 e 10.\n");
            return false;
        }
    }

    public boolean validarPeso(Scanner sc, int peso)
    {
        if(peso >= 1 && peso <= 10) {
            return true;
        }
        else {
            System.out.println("\nValor inválido! Insira apenas valores entre 1 e 10.\n");
            return false;
        }
    }
}
