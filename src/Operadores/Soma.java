package Operadores;

public class Soma {
    private double soma;

    public Soma(double nota1, double nota2, double nota3, double nota4){
        this.soma = nota1 + nota2 + nota3 + nota4;
    }

    public double getSoma() {
        return soma;
    }
}
