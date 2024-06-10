package br.com.ets.metodos.exercicio03;

public class Validacao {
    public static boolean validarSalario(double salario) {
        return salario>=0;
    }
    
    public static boolean validarPedidoEmprestimo(double pedidoEmprestimo) {
        return pedidoEmprestimo>0 && pedidoEmprestimo<=200000;
    }
}
