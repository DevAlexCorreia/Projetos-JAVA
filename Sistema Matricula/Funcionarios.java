import java.util.ArrayList;
public class Funcionarios extends Nivelacesso{
    private String nomeFunc;
    private String funcaoFunc;    
    private String loginFunc;
    private String senhaFunc;
    Aluno aluno = new Aluno();

    public Funcionarios(String nomeFunc){
        setNomefunc(senhaFunc);
        setFuncaofunc(senhaFunc);
        setLoginfunc(loginFunc);
        setSenhafunc(senhaFunc);
    }
public String getNomefunc(){
    return nomeFunc;
}
public void setNomefunc(String nomeFunc){
    this.nomeFunc = nomeFunc;
}
public String getFuncaofunc(){
    return funcaoFunc;
}
public void setFuncaofunc(String funcaoFunc){
    this.funcaoFunc = funcaoFunc;
}
public String getLoginfunc(){
    return loginFunc;
}
public void setLoginfunc(String loginFunc){
    this.loginFunc = loginFunc;
}
public String getSenhafunc(){
    return senhaFunc;
}
public void setSenhafunc(String senhaFunc){
    this.senhaFunc = senhaFunc;
}

//Cadastrar Funcionário
public void cadastrarFunc(){
    if(this.funcaoFunc.toLowerCase() == "coordenador"){// Função lower case
        setControleacesso(3);
    }
    if(getControleacesso()>=3){
        getNomefunc();
        setLoginfunc("Admin3");
        setSenhafunc("senhaadm3");
    }
/**- Armazenar funcionários - Nivel 3 Coordenador-*
Se coordenador nivel de acesso = 3

 */
//nome, funcao
//Gerar login e senha = Admin3
}
public void cadastrarAluno(String Aluno){

}
public void infoFunc(){//Banco de dados artificial
System.out.println("Nome do funcionário: "+getNomefunc());
System.out.println("Função: "+ getFuncaofunc());
}
}