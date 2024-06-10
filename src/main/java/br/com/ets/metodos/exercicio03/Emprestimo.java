package br.com.ets.metodos.exercicio03;

public class Emprestimo {
    private static final double JUROS = 0.35;
    private static final int NUMERO_PARCELAS = 24;
    private Usuario usuario;

    public Emprestimo(Usuario usuario) {
        this.usuario = usuario;
    }

    public boolean checarEmprestimo() {
        double valorParcela = calcularValorParcela();
        double limiteParcela = usuario.getSalario() * 0.15;
        return valorParcela <= limiteParcela;
    }
    
    public double calcularValorParcela() {
        return calcularValorTotalComJuros() / NUMERO_PARCELAS;
    }

    public double calcularValorTotalComJuros() {
        return usuario.getValorEmprestimo() * (1 + JUROS);
    }

}
