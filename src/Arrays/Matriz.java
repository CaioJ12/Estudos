package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos existem?: ");
        int qntAlunos = entrada.nextInt();

        System.out.println("Quantas notas por aluno: ");
        int qntNotas = entrada.nextInt();

        double[][] notasDaTurma = new double[qntAlunos] [qntNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++){
            for (int n = 0; n < notasDaTurma[i].length; n++){

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, i + 1);
                notasDaTurma[i][n] = entrada.nextDouble();
                total += notasDaTurma [i][n];

            }
        }

        double media = total / (qntAlunos * qntNotas);
        System.out.println("Média da turma é " + media);

        for (double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }

        entrada.close();
    }
}
