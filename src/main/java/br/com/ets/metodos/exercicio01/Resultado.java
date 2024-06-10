package br.com.ets.metodos.exercicio01;

public class Resultado
{
    private double media;
    public Resultado(double media)
    {
        this.media = media;
    }

    public void mostrarResultado()
    {
        if(this.media>=7)
        {
            System.out.printf("O aluno foi aprovado com média: %.1f", this.media);
        } else {
            System.out.printf("O aluno foi reprovado com média: %.1f", this.media);
        }
    }
}
