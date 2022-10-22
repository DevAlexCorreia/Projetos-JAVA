import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
    Scanner input = new Scanner(System.in);
    
    /*A Unifacs realiza todos os anos o seu processo de seleção em várias etapas. 
    Uma dessas etapas consiste no vestibular, ou seja, a aplicação de uma prova de conhecimentos gerais com questões objetivas. 
    Candidatos devem realizar a prova e preencher um gabarito com as respostas de cada questão. 
    A prova contém 10 questões de alternativas que variam de 1 a 5. Por exemplo, um gabarito possível seria o seguinte: 

Questão 1-> resposta 3; 
Questão 2-> resposta 2; 
Questão 3-> resposta 3; 
Questão 4-> resposta 5; 
Questão 5-> resposta 1; 
Questão 6-> resposta 1; 
Questão 7-> resposta 2; 
Questão 8-> resposta 5; 
Questão 9-> resposta 4; 
Questão 10-> resposta 1; 
Para o cenário acima implemente um programa em Java que realize as seguintes atividades:
a)	leia o gabarito oficial do vestibular com a resposta das 5 questões.
 Considere que o usuário digitará nas respostas sempre um número entre 1 e 5, não é preciso fazer essa validação (1.0 pontos);

b)	solicite do usuário a quantidade de alunos que realizaram a prova e em seguida leia o gabarito com as respostas de cada um desses alunos .
 Considere que o usuário digitará nas respostas sempre um número entre 1 e 5, não é preciso fazer essa validação (1.0 pontos);

c)	corrija a prova de cada aluno e indique o resultado considerando que cada questão tem o valor de 1 ponto (2.0 pontos);

d)	indique qual a maior nota dentre todos os alunos que prestaram o vestibular (1.0 pontos). 


 */
    
    int[] gabarito = new int[10];// 0 a 9
    int[] questao = new int[10];
    int maiorNota=0,aluno=0;

    //Letra A)
    System.out.println("_________________________Preencha o Gabarito:_________________________");
    for(int i=0;i<gabarito.length;i++){// for de leitura do gabarito
      System.out.println("Resposta da questão "+(i+1)); // Questão 2
      if(gabarito[i]<=5){
      gabarito[i] = input.nextInt();// Ler de novo
      }else{
        i--;
      }
    }//fim da leitura do gabarito

    //Letra B)
    System.out.println("Quantos alunos farão a prova?");
    int alunos = input.nextInt();
    int[] Aluno = new int[alunos];        

    for(int i=0;i<gabarito.length;i++){  // for de impressão do gabarito
      System.out.println("Resposta "+(i+1)+": "+ gabarito[i]);
    }//fim da impressão o gabarito

    for(int i=0;i<Aluno.length;i++){//Armazenamento da variável aluno
      int nota=0;// Zerar a variável nota dentro do for para que não aja soma entre as notas dos alunos
      Aluno[i] = (i+1);//Aluno 1
      System.out.println("Respostas do Aluno "+Aluno[i]);// repostas do aluno 1

      //Letra C)
      for(int j=0;j<questao.length;j++){// Armazenamento das questões 
        System.out.println("Resposta da questão? "+(j+1));
        questao[j] = input.nextInt();
        if(questao[j]==gabarito[j]){  //teste de correção                
          nota++;
        }
      }
      //Letra D)
      if (nota > maiorNota){//Carga da variável maiorNota nota = 10
        maiorNota = nota; 
        aluno = i + 1;
      }//fim da condição de Carga da variável
      System.out.printf("O Aluno %d teve nota: %d\n",Aluno[i],nota);
     }
    
     System.out.printf("O Aluno "+aluno+" Teve a maior nota");  
    
    input.close();    
  } 
}
