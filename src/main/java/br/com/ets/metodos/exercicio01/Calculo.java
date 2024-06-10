package br.com.ets.metodos.exercicio01;

public class Calculo
{
    EntradaSaida io;

    public Calculo(EntradaSaida io) {
        this.io = io;
    }

    /*
    private double nota1;
    private double nota2;
    public Calculo(double nota1, double nota2)
    {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    */

    public double calcularMediaAritmetica()
    {
        return (this.io.nota1 + this.io.nota2)/2.0;
    }

    public double calcularMediaPonderada()
    {
        return ((this.io.nota1*this.io.peso1) + (this.io.nota2*this.io.peso2)) / (this.io.peso1+this.io.peso2);
    }
}
