package br.com.ets.metodos.exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EntradaSaida io = new EntradaSaida();
        io.perguntarSalarioBruto(sc);
        io.perguntarQuantidadeHorasExtras(sc);

        Calculo calculo = new Calculo();
        calculo.calcularDescontos(io.getSalarioBruto(), io.getHorasExtras());
        calculo.exibirDescontos();
        calculo.calcularSalarioLiquido(io.getSalarioBruto());
    }
}