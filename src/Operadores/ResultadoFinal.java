package Operadores;

public class ResultadoFinal {

    public static void main(String[] args) {

        System.out.println("****Lista de Alunos****");
        Alunos aluno1 = new Alunos();
        aluno1.setAluno("Ygor");
        System.out.println(aluno1.getAluno());

        Alunos aluno2 = new Alunos();
        aluno2.setAluno("Giulianna");
        System.out.println(aluno2.getAluno());

        Alunos aluno3 = new Alunos();
        aluno3.setAluno("Rosane");
        System.out.println(aluno3.getAluno());

        Alunos aluno4 = new Alunos();
        aluno4.setAluno("Antenor");
        System.out.println(aluno4.getAluno());

        System.out.println("****Notas em ordem dos alunos****");
        Notas nota1 = new Notas();
        nota1.setNota(7.1);
        System.out.println(nota1.getNota());

        Notas nota2 = new Notas();
        nota2.setNota(8.9);
        System.out.println(nota2.getNota());

        Notas nota3 = new Notas();
        nota3.setNota(5.2);
        System.out.println(nota3.getNota());

        Notas nota4 = new Notas();
        nota4.setNota(6.6);
        System.out.println(nota4.getNota());

        Soma soma = new Soma(nota1.getNota(), nota2.getNota(), nota3.getNota(), nota4.getNota());
        System.out.println("Soma das notas: " + String.format("%.2f",soma.getSoma()));

        Media media = new Media(nota1.getNota(), nota2.getNota(), nota3.getNota(), nota4.getNota());
        System.out.println("A Média das notas é: " + String.format("%.2f", media.getMedia()));
    }
}

