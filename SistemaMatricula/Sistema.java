import java.util.Arrays;
import java.util.Scanner;
public class Sistema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Universidade unifacs = new Universidade("Unifacs", "Salvador", 123456789);

        Funcionarios coordenador = new Funcionarios("Lucas Falcão");

        Curso eng = new Curso("Engenharia Eletrica", "Muito calculo", coordenador, 3600);

        Aluno aluno1 = new Aluno("Lucas Falcão", "lalalau@gmail.com", 2022);
        Inep inep = new Inep();

        String[][] enade = inep.criarProva();

        String[] resposta = aluno1.fazerProva(enade);

        aluno1.setNotaEnade(inep.corrigirProva(enade, resposta));

        input.close();
    }
    
}