package br.com.ets.metodos.exercicio01;

import java.util.Scanner;

public class EntradaSaida
{
    double nota1;
    double nota2;

    int peso1;
    int peso2;


    public void perguntarNotas(Scanner sc)
    {
        Validacao validacao = new Validacao();
        boolean parar = false;
        while(!parar)
        {
            try
            {
                System.out.println("Insira o valor da primeira nota: ");
                double nota1 = Double.parseDouble(sc.nextLine());

                if(validacao.validarNota(sc, nota1)) {
                    while(!parar) {
                        System.out.println("Insira o valor da segunda nota: ");
                        double nota2 = Double.parseDouble(sc.nextLine());

                        if(validacao.validarNota(sc, nota2)) {
                            parar = true;
                            this.nota1 = nota1;
                            this.nota2 = nota2;
                        }
                    }
                }
            }
            catch (Exception e) {
                System.out.println("\nValor inválido! Insira apenas números.\n");
            }
        }
    }

    public int perguntarTipoMedia(Scanner sc)
    {
        while(true)
        {
            try
            {
                System.out.println("Deseja calcular média [1] Aritmética ou [2] Ponderada?");
                int tipoMedia = Integer.parseInt(sc.nextLine());

                if(tipoMedia == 1) {
                    return tipoMedia;
                }
                else if(tipoMedia == 2) {
                    perguntarPesos(sc);
                    return tipoMedia;
                }
                else {
                    System.out.println("\nValor inválido! Insira apenas 1 ou 2.\n");
                }
            }
            catch (Exception e) {
                System.out.println("\nValor inválido! Insira apenas o número correspondente.\n");
            }
        }
    }

    public void perguntarPesos(Scanner sc)
    {
        Validacao validacao = new Validacao();
        boolean parar = false;
        while(!parar)
        {
            try
            {
                System.out.println("Insira o valor do primeiro peso: ");
                int peso1 = Integer.parseInt(sc.nextLine());

                if(validacao.validarPeso(sc, peso1)) {
                    while(!parar) {
                        System.out.println("Insira o valor do segundo peso: ");
                        int peso2 = Integer.parseInt(sc.nextLine());

                        if(validacao.validarPeso(sc, peso2)) {
                            parar = true;
                            this.peso1 = peso1;
                            this.peso2 = peso2;
                        }
                    }
                }
            }
            catch (Exception e) {
                System.out.println("\nValor inválido! Insira apenas números.\n");
            }
        }
    }


}
