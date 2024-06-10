package br.com.ets.metodos.exercicio02;

import java.util.Scanner;

public class EntradaSaida {

    private double salarioBruto;
    private int horasExtras;

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    public int getHorasExtras(){
        return this.horasExtras;
    }

    public void perguntarSalarioBruto(Scanner sc) {
        Validacao validacao = new Validacao();
        while(true)
        {
            try
            {
                System.out.println("Insira o valor do seu salário bruto: ");
                double salarioBruto = Double.parseDouble(sc.nextLine());

                if(validacao.validarSalario(sc, salarioBruto)) {
                    this.salarioBruto = salarioBruto;
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("\nValor inválido! Insira apenas números.\n");
            }
        }
    }

    public void perguntarQuantidadeHorasExtras(Scanner sc) {
        Validacao validacao = new Validacao();
        while(true)
        {
            try
            {
                System.out.println("Insira a quantidade de horas extras: ");
                int horasExtras = Integer.parseInt(sc.nextLine());

                if(validacao.validarHorasExtras(sc, horasExtras)) {
                    this.horasExtras = horasExtras;
                    break;
                }
            }
            catch (Exception e) {
                System.out.println("\nValor inválido! Insira apenas números inteiros.\n");
            }
        }
    }

}
