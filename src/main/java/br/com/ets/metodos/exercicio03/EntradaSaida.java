package br.com.ets.metodos.exercicio03;

import java.util.Scanner;

public class EntradaSaida {


    public double perguntarSalario(Scanner sc) {
        while(true){
            try {
                System.out.println("Digite seu salário atual:");
                double salario = Double.parseDouble(sc.nextLine());

                if(Validacao.validarSalario(salario)) {
                    return salario;
                }
                else {
                    System.out.println("\nInsira um valor maior que 0.\n");
                }
            }
            catch(Exception e) {
                System.out.println("\nValor inválido! Insira um valor númerico.\n");
            }
        }
    }

    public double perguntarEmprestimo(Scanner sc, double salario) {
        while(true){
            try {
                System.out.println("Digite o valor que deseja emprestar (máximo R$200.000):");
                double pedidoEmprestimo = Double.parseDouble(sc.nextLine());

                if(Validacao.validarPedidoEmprestimo(pedidoEmprestimo)) {
                    return pedidoEmprestimo;
                }
                else {
                    System.out.println("\nInsira um valor maior que 0 e menor ou igual a R$200.000.\n");
                }
            }
            catch(Exception e) {
                System.out.println("\nValor inválido! Insira um valor númerico.\n");
            }
        }
    }

    public void mostrarResultado(Emprestimo emprestimo) {
        if (emprestimo.checarEmprestimo()) {
            System.out.println("Empréstimo aprovado!");
            System.out.printf("Valor de cada parcela: R$%.2f \n", emprestimo.calcularValorParcela());
            System.out.printf("Valor total a ser pago: R$%.2f", emprestimo.calcularValorTotalComJuros());
        } else {
            System.out.println("Empréstimo negado. O valor da parcela excede 15% do seu salário.");
        }
    }
}
