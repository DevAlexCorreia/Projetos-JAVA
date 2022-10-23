import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Inep {
    private String materia;
    private String prova;
    private String nota;
    Random rand = new Random();

    public String gerarSenha(){

        char[] letras = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i<6; i++){
            senha.append(letras[rand.nextInt(letras.length)]);
        }

        return senha.toString();
    }

    public String[][] criarProva(){
        String[] prova = new String[3];
        String[] gabarito = new String[3];

        ArrayList<String> questoes = new ArrayList<String>(Arrays.asList("2 + 2?", "Cor do cavalo branco de napoleao?", "Qual é o maior oceano do mundo?",
                "Que tipo de peixe é Nemo?", "Qual o sétimo mês do ano?", "Quantos planetas existem no sistema solar?"));
        ArrayList<String> respostas = new ArrayList<String>(Arrays.asList("4", "branco", "pacifico", "peixe palhaço", "julho", "8"));

        for(int i = 0; i <prova.length; i++){
            int randInt = rand.nextInt(questoes.size());

            prova[i] = questoes.get(randInt);
            gabarito[i] = respostas.get(randInt);
            questoes.remove(randInt);
            respostas.remove(randInt);
        }

        System.out.println(Arrays.toString(prova));

        return new String[][]{prova, gabarito};
    }

    public int corrigirProva(String[][] prova, String[] respostas){
        int nota = 0;
        for(int i = 0; i<prova[0].length; i++){
            if(prova[1][i].equals(respostas[i])){
                nota++;
            }
        }

        return nota;
    }

}
