Caso eu quisesse por um codigo mais limpo e com collections o codigo ficaria assim.
package Operadores;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
private String nome;

    public Alunos(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

package Operadores;

public class Notas {
private double nota;

    public Notas(double nota) {
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}

package Operadores;

import java.util.List;

public class ResultadoFinal {

    public static void main(String[] args) {
        List<Alunos> alunos = new ArrayList<>();
        alunos.add(new Alunos("Ygor"));
        alunos.add(new Alunos("Giulianna"));
        alunos.add(new Alunos("Rosane"));
        alunos.add(new Alunos("Antenor"));

        System.out.println("****Lista de Alunos****");
        for (Alunos aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        List<Notas> notas = new ArrayList<>();
        notas.add(new Notas(7.1));
        notas.add(new Notas(8.9));
        notas.add(new Notas(5.2));
        notas.add(new Notas(6.6));

        System.out.println("****Notas em ordem dos alunos****");
        for (Notas nota : notas) {
            System.out.println(nota.getNota());
        }

        double soma = calcularSoma(notas);
        System.out.println("Soma das notas: " + String.format("%.2f", soma));

        double media = calcularMedia(notas);
        System.out.println("A Média das notas é: " + String.format("%.2f", media));
    }

    public static double calcularSoma(List<Notas> notas) {
        double soma = 0;
        for (Notas nota : notas) {
            soma += nota.getNota();
        }
        return soma;
    }

    public static double calcularMedia(List<Notas> notas) {
        return calcularSoma(notas) / notas.size();
    }
}

