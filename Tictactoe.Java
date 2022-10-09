import java.util.Scanner;
public class ttt {
  public static void main(String[] args) {
        
    
    Slot[][]ttt = new Slot[3][3];
    String SymbolVer = "X";
    Boolean Game = true;
    String Win = "";
    Scanner input = new Scanner(System.in);

    initGame(ttt);

    while(Game){
        Redraw(ttt);
        Win = winVerify(ttt);
        if(Win != ""){
            System.out.println("Player %s Wins");
            break;
        }
        try{
            if(playVerify(ttt, Play(input, SymbolVer), SymbolVer)){
                if(SymbolVer == "X"){
                    SymbolVer = "O";
                }else{
                    SymbolVer = "X";
                }
            }
        }catch(Exception e){
            System.out.println("Error");
        }
    }
        System.out.println("Game Over!");
  }
  public static void Redraw(Slot[][] ttt){
    System.out.println("   0   1   2");
    for(int i =0;i<3;i++){
        System.out.printf("0   %s  |  %s  |  %s%n",ttt[0][i].getSymbol());            
    }for(int i =0;i<3;i++){
        System.out.printf("1   %s  |  %s  |  %s%n",ttt[1][i].getSymbol());            
    }for(int i =0;i<3;i++){
        System.out.printf("2   %s  |  %s  |  %s%n",ttt[2][i].getSymbol());            
    }
  }
  public static void Cls(){
    for(int i =0; i<200;i++){
        System.out.println("");
    }    
  }
  public static int[] Play(Scanner input, String SymbolVer){
    int[] p = new int[2];
    System.out.printf("%s %s%n","Who plays: ", SymbolVer);
    System.out.println("Report line");
    p[0] = input.nextInt();
    System.out.println("Report Column");
    p[1] = input.nextInt();
    return p;
  }
  public static Boolean playVerify(Slot[][] ttt, int p[], String symbolVer){
    if(ttt[p[0]][p[1]].getSymbol()==""){
        ttt[p[0]][p[1]].setSymbol(symbolVer);
        return true;
    }else{
        return false;
    }
  }
  public static void initGame(Slot[][] ttt){
    for(int l=0;l<3;l++){
        for(int c=0;c<3;c++){

        }
    }
  }
  public static String winVerify(Slot[][] ttt){
    return "";
  }
}
