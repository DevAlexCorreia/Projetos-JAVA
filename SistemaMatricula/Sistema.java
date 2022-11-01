import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Sistema {
    public static void main(String[] args) {
        //Criar ambiente com universidades, cursos e alunos já cadastrados no inep
        Inep inep = inepSetUp();



//        Aluno aluno1 = new Aluno("Lucas Falcão", "lalalau@gmail.com", 2022);

//        String[][] enade = inep.criarProva();
//
//        String[] resposta = aluno1.fazerProva(enade);
//
//        aluno1.setNotaEnade(inep.corrigirProva(enade, resposta));



    }

    public static Inep inepSetUp(){
        Inep inep = new Inep();

        //Declarar Universidades
        Universidade unifacs = new Universidade("Unifacs", "Salvador", 123456789);
        Universidade ufba = new Universidade("UFBA", "Salvador", 123123123);
        Universidade ifba = new Universidade("IFBA", "Salvador", 123451234);

        //Cadastrar Universidades no inep
        inep.cadastrarUniversidade(unifacs, ufba, ifba);

        //Declarar coordenador (temporario)
        Funcionarios coordenador = new Funcionarios("Lucas Falcão");

        int uniQtd = 3, cursoQtd = 0, alunoQtd = 0;

        //Para cada universidade...
        for (Universidade uni : inep.getListaUniversidades()){
            //Declarar cursos
            Curso engenharia = new Curso("Eletrica", "Muito calculo", coordenador, 3600);
            Curso direito = new Curso("Direito", "Muito processo", coordenador, 3200);
            Curso medicina = new Curso("Medicina", "Muito dinheiro", coordenador, 4000);

            //Cadastrar cursos na universidade
            uni.criarCurso(engenharia, direito, medicina);

            cursoQtd += 3;

            //Para cada curso...
            for (Curso curso : uni.getListaCursos()){
                //Declarar alunos
                Aluno aluno1 = new Aluno("Lucas Falcão", "LucasFalcão@gmail.com", 2022);
                Aluno aluno2 = new Aluno("Larry Falcão", "LarryFalcão@gmail.com", 2022);
                Aluno aluno3 = new Aluno("Lucas Flowers", "LucasFlowers@gmail.com", 2022);
                Aluno aluno4 = new Aluno("Larry Flowers", "LarryFlowers@gmail.com", 2022);

                //Matricular alunos
                curso.matricularAluno(aluno1, aluno2, aluno3, aluno4);

                alunoQtd += 4;
            }
        }

        System.out.printf("Inep possui %d universidades cadastradas, %d cursos e %d alunos%n", uniQtd, cursoQtd, alunoQtd);

        return inep;

    }
}