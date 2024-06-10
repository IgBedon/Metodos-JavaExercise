package br.com.ets.metodos.exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem-vindo, professor!");

        EntradaSaida io = new EntradaSaida();
        io.perguntarNotas(sc);
        int tipoMedia = io.perguntarTipoMedia(sc);

        Calculo calculo = new Calculo(io);
        double media = (tipoMedia==1) ? calculo.calcularMediaAritmetica() : calculo.calcularMediaPonderada();

        Resultado resultado = new Resultado(media);
        resultado.mostrarResultado();
    }
}