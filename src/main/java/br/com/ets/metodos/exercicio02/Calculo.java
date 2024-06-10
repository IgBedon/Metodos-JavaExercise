package br.com.ets.metodos.exercicio02;

public class Calculo {
    private double descontoINSS;
    private double descontoIRPF;
    private double descontoPlanoSaude;
    private double acrescimoHorasExtras;


    public void calcularDescontos(double salarioBruto, int quantidadeHorasExtras) {
        calcularDescontoINSS(salarioBruto);
        calcularDescontoIRPF(salarioBruto);
        calcularDescontoPlanoSaude(salarioBruto);
        calcularAcrescimoHorasExtras(salarioBruto, quantidadeHorasExtras);
    }

    public void exibirDescontos() {
        System.out.printf("Desconto do INSS: R$%.2f \nDesconto do IRPF: R$%.2f \nDesconto do Plano de Saúde: R$%.2f \nAcréscimo das Horas Extras: R$%.2f\n", descontoINSS, descontoIRPF, descontoPlanoSaude, acrescimoHorasExtras);
    }

    public void calcularSalarioLiquido(double salarioBruto) {
        double salarioLiquido = salarioBruto - this.descontoINSS - this.descontoIRPF - this.descontoPlanoSaude + this.acrescimoHorasExtras;
        System.out.printf("O valor do salário líquido é: R$%.2f\n", salarioLiquido);
    }

    private void calcularDescontoINSS(double salarioBruto) {
        this.descontoINSS = salarioBruto*0.20;
    }

    private void calcularDescontoIRPF(double salarioBruto) {
        this.descontoIRPF = salarioBruto*0.10;
    }

    private void calcularDescontoPlanoSaude(double salarioBruto) {
        this.descontoPlanoSaude = salarioBruto*0.05;
    }

    private void calcularAcrescimoHorasExtras(double salarioBruto, int quantidadeHorasExtras) {
        double valorHoraNormal = salarioBruto/160;
        double valorHoraExtra = valorHoraNormal*1.5;
        this.acrescimoHorasExtras = quantidadeHorasExtras*valorHoraExtra;
    }
}
