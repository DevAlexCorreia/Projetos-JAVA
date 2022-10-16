public class Aluno extends Curso{
   private long matricula;
   private String nome;
   private String email;
   private int anoIngresso;
 

//gets e sets
public long getMatricula(){
    return matricula;
}
public void setMatricula(long matricula){
    this.matricula = matricula;
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