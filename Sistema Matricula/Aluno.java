import java.util.Random;

public class Aluno extends Curso{
   private long matricula;
   private String nome;
   private String email;
   private int anoIngresso;

    public Aluno(String nome, String email, int anoIngresso) {
        this.nome = nome;
        this.email = email;
        this.anoIngresso = anoIngresso;
        setMatricula();
    }

    //gets e sets
public long getMatricula(){
    return matricula;
}
public void setMatricula(){
    Random rand = new Random();
    this.matricula = 1000 + rand.nextInt(30);
}
public String getNomeAluno(){
    return nome;
}
public void setNomeAluno(String nome){
    this.nome = nome;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email = email;
}
public int getAnoingresso(){
    return anoIngresso;
}
public void setAnoingresso(int anoIngresso){
    this.anoIngresso = anoIngresso;
}

//métodos
public void addDocumentos(){

}
public void addHistórico(){

}


}