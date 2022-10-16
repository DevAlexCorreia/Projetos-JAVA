public class Caneta {

    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private Boolean tampada=true;
    

    
    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float ponta){
        this.ponta = ponta;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int carga){
        this.carga = carga;
    }
    public Boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(Boolean tampada){
        this.tampada = tampada;
    }

    public void Tampar(){
        this.tampada = true;
    }
    public void Destampar(){
        this.tampada = false;
    }
    public void Desenhar(){
        Destampar();
    }
    public void Status(){
        System.out.println("O Modelo da caneta é "+this.modelo);
        System.out.println("A cor da caneta é "+this.cor);
        System.out.println("O Tipo da ponta é "+this.ponta);
        System.out.println("A Carga é "+this.carga);
        System.out.printf("A Caneta está %s",this.tampada ?"Tampada" : "Destampada");
    }



}   