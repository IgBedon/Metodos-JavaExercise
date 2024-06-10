package br.com.ets.metodos.exercicio03;

public class Usuario {
    private double salario;
    private double valorEmprestimo;

    public Usuario(double salario, double valorEmprestimo) {
        this.salario = salario;
        this.valorEmprestimo = valorEmprestimo;
    }

    public double getSalario() {
        return salario;
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }
}
