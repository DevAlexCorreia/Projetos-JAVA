/* Em produção*/
import java.io.IOException;
import java.util.Scanner;
public class Main {
 
  public static void main(String[] args) throws IOException {   
      Scanner input = new Scanner(System.in);
    
    String[][] n= new String[3][3];

    for(int i=0;i<3;i++){//for entrada
      for(int j=0;j<3;j++){
      System.out.println("Qual a posição você quer marcar ?");
       n[i][j] = input.next();      
      }
    }
    
    for(int i=0;i<3;i++){//for de impressão
      for(int j=0;j<3;j++){
        System.out.printf("%s ",n[i][j]);
        if(i==0 || i==1){
          if(j==2){
            System.out.print("\n");
          }
        }
      }
    }
    
    
  input.close();   
  }   
}
