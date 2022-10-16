import java.util.Scanner;
public class ContaBanco {
    
    public long numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private Boolean status;
    Scanner input = new Scanner(System.in);
    
    public ContaBanco(String dono) {
        this.saldo = 0;
        this.status = false;
        this.setDono(dono);
    }
    public long getNumConta() {
        return numConta;
    }
    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void abrirConta() {
        System.out.println("Que tipo de conta você quer abrir");
        System.out.println("1 - Conta Corrente");
        System.out.println("2 - Conta Poupança");
        tipo = input.next();
        
        switch (tipo) {
            case "1":
                System.out.println("Conta Corrente");
                this.setSaldo(50);
                this.setStatus(true);
                System.out.println("Conta Aberta!");  
                break;
            case "2":
                System.out.println("Conta Poupança");
                this.setSaldo(150);
                this.setStatus(true);
                System.out.println("Conta Aberta !");  
            default:
                break;
            
        }
    }

    public void fecharConta(){
        
        if(saldo<0){
            System.out.println("Você não pode fechar a sua conta até quitar seu débito\n");
        }else{
            sacar(saldo);
            this.setStatus(false);
        }
    }

    public void depositar(double valor){
       if(this.status = true){
        this.setSaldo(this.getSaldo()+valor);
        System.out.println("Depósito realizado na conta de "+this.getDono());
       }else{
        System.out.println("Você precisar abrir uma conta para depositar um valor\n");
       }
    }
    
    public void sacar(double v){
        if(this.status = true){
            if(this.getSaldo()>=v){
                this.setSaldo(this.getSaldo()-v); 
            }else{                
                System.out.println("Valor indisponível para saque!\n");               
            }
       }
    }
    public void extrato(){
        System.out.printf("Seu novo saldo é : %.2f\n",this.getSaldo());
    }
    
    public void pagarMensal(){
        if(this.getStatus()==true){
            if(tipo=="1"){
                setSaldo(getSaldo()-12);;
            }else{
                setSaldo(getSaldo()-20);
            }
        }else{
            System.out.println("Abra uma conta para efetuar pagamentos\n");
        }
    }



}
