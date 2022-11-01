import java.util.ArrayList;
import java.util.Arrays;

public class Curso{
    private String nomeCurso;
    private String ementaCurso;
    private Funcionarios coordenador;
    private int cargaHoraria;
    private ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();



    public Curso(String nomeCurso, String ementaCurso, Funcionarios coordenador, int cargaHoraria) {
        this.nomeCurso = nomeCurso;
        this.ementaCurso = ementaCurso;
        this.coordenador = coordenador;
        this.cargaHoraria = cargaHoraria;
    }

    public void matricularAluno(Aluno ...aluno){
        listaAlunos.addAll(Arrays.asList(aluno));
    }

    public void jubilarAluno(Aluno aluno){
        listaAlunos.remove(aluno);
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getEmentaCurso() {
        return ementaCurso;
    }

    public void setEmentaCurso(String ementaCurso) {
        this.ementaCurso = ementaCurso;
    }

    public Funcionarios getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Funcionarios coordenador) {
        this.coordenador = coordenador;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public ArrayList<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
