package Operadores;

public class Media {
    private double media;

    public Media(double nota1, double nota2, double nota3, double nota4){
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public double getMedia() {
        return media;
    }
}
