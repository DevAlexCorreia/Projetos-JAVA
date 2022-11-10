import java.util.ArrayList;
import java.util.Arrays;

public class Universidade{// site
    private String nomeUni;
    private String cidadeUni;
    private long cnpj;
    private ArrayList<Curso> listaCursos = new ArrayList<Curso>();
    private double mediaEnade;

    public Universidade(String nomeUni, String cidadeUni, long cnpj) {
        this.nomeUni = nomeUni;
        this.cidadeUni = cidadeUni;
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nomeUni = '" + nomeUni + '\'' +
                ", cidadeUni = '" + cidadeUni + '\'' +
                ", cnpj = " + cnpj +
                ", Quantidade de cursos = " + listaCursos.size() +
                ", mediaEnade = " + mediaEnade +
                '}';
    }

    public void setMediaEnade() {
        float somatorioNotas = 0;
        int alunosQtd = 0;


        for (Curso curso : getListaCursos()){
            for (Aluno aluno : curso.getListaAlunos()){
                somatorioNotas += aluno.getNotaEnade();
                alunosQtd++;
            }
        }

        this.mediaEnade = Math.floor((somatorioNotas / alunosQtd) * 100) / 100;
    }
    public void criarCurso(Curso ...curso){
        listaCursos.addAll(Arrays.asList(curso));
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

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public double getMediaEnade() {
        return mediaEnade;
    }


}