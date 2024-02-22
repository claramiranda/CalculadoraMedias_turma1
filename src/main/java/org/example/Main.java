package org.example;

public class Main {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.lerMediasDoEstudante();

        System.out.println("A media do semestre foi: " + aluno.calculaMediaSemestral(
                aluno.notaCheckpointSemestreUm,aluno.notaGlobalSolutionsSemestreUm));


    }
}