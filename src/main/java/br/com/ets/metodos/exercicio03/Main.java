package br.com.ets.metodos.exercicio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EntradaSaida entradaSaida = new EntradaSaida();
        double salario = entradaSaida.perguntarSalario(scanner);
        double valorEmprestimo = entradaSaida.perguntarEmprestimo(scanner, salario);

        Usuario usuario = new Usuario(salario, valorEmprestimo);
        Emprestimo emprestimo = new Emprestimo(usuario);

        entradaSaida.mostrarResultado(emprestimo);

        scanner.close();
    }
}
