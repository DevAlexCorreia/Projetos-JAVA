import java.util.ArrayList;

public class Universidade{// site
    private String nomeUni;
    private String cidadeUni;
    private long cnpj;
    private ArrayList<Curso> listaCursos = new ArrayList<Curso>();

    public Universidade(String nomeUni, String cidadeUni, long cnpj) {
        this.nomeUni = nomeUni;
        this.cidadeUni = cidadeUni;
        this.cnpj = cnpj;
    }

    public void criarCurso(Curso curso){
        listaCursos.add(curso);
    }

    public void excluirCurso(Curso curso){
        listaCursos.remove(curso);
    }

    public String getNomeUni() {
        return nomeUni;
    }

    public void setNomeUni(String nomeUni) {
        this.nomeUni = nomeUni;
    }

    public String getCidadeUni() {
        return cidadeUni;
    }

    public void setCidadeUni(String cidadeUni) {
        this.cidadeUni = cidadeUni;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}