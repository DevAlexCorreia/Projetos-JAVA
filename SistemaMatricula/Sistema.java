public class Sistema {
    public static void main(String[] args) {
        //Criar ambiente com universidades, cursos e alunos já cadastrados no inep
        Inep inep = inepSetUp();

        System.out.println("");

        String[][] enade = inep.criarProva();


        for (Universidade uni : inep.getListaUniversidades()){
            System.out.println(uni.getNomeUni() + "\n");

            for (Curso curso : uni.getListaCursos()){
                System.out.println(curso.getNomeCurso() + "\n");

                //Todos os alunos de cada universidade...
                for (Aluno aluno: curso.getListaAlunos()){
                    //Fazer prova manualmente
//                    String[] resposta = aluno.fazerProva(enade);

                    //Fazer prova automatica
                    String[] resposta = aluno.fazerProvaAutomatica(enade);

                    System.out.println("");

                    //Salvar nota da prova
                    aluno.setNotaEnade(inep.corrigirProva(enade, resposta));
                }
            }

            //Calcular e salvar media da universidade
            uni.setMediaEnade();
        }

        //Informações da universidade
        for(Universidade uni : inep.getListaUniversidades()){
            System.out.println("Media da " + uni.getNomeUni() + ": " + uni.getMediaEnade());
        }
    }

    public static Inep inepSetUp(){
        Inep inep = new Inep();

        //Declarar Universidades
        Universidade unifacs = new Universidade("Unifacs", "Salvador", 123456789);
        Universidade ufba = new Universidade("UFBA", "Salvador", 123123123);
        Universidade ifba = new Universidade("IFBA", "Salvador", 123451234);

        //Cadastrar Universidades no inep
        inep.cadastrarUniversidade(unifacs, ufba, ifba);

        //Declarar coordenador (temporario)
        Funcionarios coordenador = new Funcionarios("Lucas Falcão");

        int uniQtd = inep.getListaUniversidades().size();
        int cursoQtd = 0, alunoQtd = 0;

        //Para cada universidade...
        for (Universidade uni : inep.getListaUniversidades()){
            //Declarar cursos
            Curso engenharia = new Curso("Engenharia Eletrica", "Muito calculo", coordenador, 3600);
            Curso direito = new Curso("Direito", "Muito processo", coordenador, 3200);
            Curso medicina = new Curso("Medicina", "Muito dinheiro", coordenador, 4000);

            //Cadastrar cursos na universidade
            uni.criarCurso(engenharia, direito, medicina);

            cursoQtd += uni.getListaCursos().size();

            //Para cada curso...
            for (Curso curso : uni.getListaCursos()){
                //Declarar alunos
                Aluno aluno1 = new Aluno("Lucas Falcão", "LucasFalcão@gmail.com", 2022);
                Aluno aluno2 = new Aluno("Alex Costa", "AlexCosta@gmail.com", 2022);
                Aluno aluno3 = new Aluno("Vicente Sampaio", "VicenteSampaio@gmail.com", 2022);
                Aluno aluno4 = new Aluno("Luis Henrique", "LuisHenrique@gmail.com", 2022);

                //Matricular alunos
                curso.matricularAluno(aluno1, aluno2, aluno3, aluno4);

                alunoQtd += curso.getListaAlunos().size();
            }
        }

        System.out.printf("Inep possui %d universidades cadastradas, %d cursos e %d alunos%n", uniQtd, cursoQtd, alunoQtd);

        return inep;

    }
}