package org.example;

import java.util.Scanner;

public class Estudante {
    //Atributos serão as notas do estudante
    float mediaPrimeiroSemestre;
    float mediaSegundoSemestre;
    float mediaAnual;

    float notaCheckpointSemestreUm;
    float notaCheckpointSemestreDois;
    float notaGlobalSolutionsSemestreUm;
    float notaGlobalSolutionsSemestreDois;

    //CONTRUTORES


    public Estudante(float notaCheckpointSemestreUm, float notaCheckpointSemestreDois,
                     float notaGlobalSolutionsSemestreUm, float notaGlobalSolutionsSemestreDois) {
        this.notaCheckpointSemestreUm = notaCheckpointSemestreUm;
        this.notaCheckpointSemestreDois = notaCheckpointSemestreDois;
        this.notaGlobalSolutionsSemestreUm = notaGlobalSolutionsSemestreUm;
        this.notaGlobalSolutionsSemestreDois = notaGlobalSolutionsSemestreDois;
    }

    public Estudante() {
        this.notaCheckpointSemestreUm = 0.0f;
        this.notaCheckpointSemestreDois = 0.0f;
        this.notaGlobalSolutionsSemestreUm = 0.0f;
        this.notaGlobalSolutionsSemestreDois = 0.0f;
    }

    public void lerMediasDoEstudante(){

        Scanner input = new Scanner(System.in);

        System.out.println("Lendo notas do Primeiro Semestre");
        System.out.print("Qual foi a nota do Checkpoint? ");
        this.notaCheckpointSemestreUm = input.nextFloat();

        System.out.print("\nQual foi a nota do Global Solutions? ");
        this.notaGlobalSolutionsSemestreUm = input.nextFloat();

        System.out.println("Lendo notas do Segundo Semestre");
        System.out.print("Qual foi a nota do Checkpoint? ");
        this.notaCheckpointSemestreDois = input.nextFloat();

        System.out.print("\nQual foi a nota do Global Solutions? ");
        this.notaGlobalSolutionsSemestreDois = input.nextFloat();
    }

    public float calculaMediaSemestral(float notaCheckpoint, float notaGlobalSolutions){
        float media;

        media = (float) ((notaCheckpoint * 0.4) + (notaGlobalSolutions * 0.6));

        return media;
    }
}