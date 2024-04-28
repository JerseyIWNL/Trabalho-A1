import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Ensalamento {
    private Map<String, Curso> cursos;
    private Map<String, Professor> professores;
    private Map<String, Aluno> alunos;

    public Ensalamento() {
        cursos = new HashMap<>();
        professores = new HashMap<>();
        alunos = new HashMap<>();
    }

    public void inicializar() {
        
        Curso ti = new Curso("TI");
        Curso adm = new Curso("ADM");

        cursos.put(ti.getNome(), ti);
        cursos.put(adm.getNome(), adm);

        
        Disciplina poo = new Disciplina("POO", ti);
        Disciplina ed = new Disciplina("Estrutura de Dados", ti);
        Disciplina bi = new Disciplina("BI", adm);

        ti.adicionarDisciplina(poo);
        ti.adicionarDisciplina(ed);
        adm.adicionarDisciplina(bi);

        
        professores.put("Mia", new Professor("Mia", "POO"));
        professores.put("Saulo", new Professor("Saulo", "Estrutura de Dados"));
        professores.put("Paula", new Professor("Paula", "BI"));

        
        adicionarAluno(new Aluno("Alfredo", "TI"));
        adicionarAluno(new Aluno("Amélia", "TI"));
        adicionarAluno(new Aluno("Ana", "ADM"));
        adicionarAluno(new Aluno("Bruno", "TI"));
        adicionarAluno(new Aluno("Bentinho", "ADM"));
        adicionarAluno(new Aluno("Capitú", "TI"));
        adicionarAluno(new Aluno("Debra", "TI"));
        adicionarAluno(new Aluno("Ian", "ADM"));
        adicionarAluno(new Aluno("Iracema", "TI"));
        adicionarAluno(new Aluno("Joelmir", "ADM"));
        adicionarAluno(new Aluno("Julieta", "TI"));
        adicionarAluno(new Aluno("Luana", "ADM"));
        adicionarAluno(new Aluno("Luciana", "TI"));
        adicionarAluno(new Aluno("Majô", "ADM"));
        adicionarAluno(new Aluno("Maria", "ADM"));
        adicionarAluno(new Aluno("Norberto", "TI"));
        adicionarAluno(new Aluno("Paulo", "ADM"));
        adicionarAluno(new Aluno("Romeu", "ADM"));
        adicionarAluno(new Aluno("Wendel", "TI"));
        adicionarAluno(new Aluno("Zoey", "TI"));
    }

    private void adicionarAluno(Aluno aluno) {
        alunos.put(aluno.getNome(), aluno);
    }

    public void alocarTurmas() {
        
        Turma turmaPOO = new Turma(professores.get("Mia"), cursos.get("TI").getDisciplinas().get(0));
        Turma turmaED = new Turma(professores.get("Saulo"), cursos.get("TI").getDisciplinas().get(1));
        Turma turmaBI = new Turma(professores.get("Paula"), cursos.get("ADM").getDisciplinas().get(0));

        
        turmaPOO.adicionarAluno(alunos.get("Alfredo"));
        turmaPOO.adicionarAluno(alunos.get("Amélia"));
        turmaPOO.adicionarAluno(alunos.get("Bruno"));
        turmaPOO.adicionarAluno(alunos.get("Capitú"));
        turmaPOO.adicionarAluno(alunos.get("Debra"));
        turmaPOO.adicionarAluno(alunos.get("Iracema"));
        turmaPOO.adicionarAluno(alunos.get("Julieta"));
        turmaPOO.adicionarAluno(alunos.get("Luciana"));
        turmaPOO.adicionarAluno(alunos.get("Norberto"));
        turmaPOO.adicionarAluno(alunos.get("Wendel"));
        turmaPOO.adicionarAluno(alunos.get("Zoey"));

        turmaED.adicionarAluno(alunos.get("Bruno"));
        turmaED.adicionarAluno(alunos.get("Capitú"));
        turmaED.adicionarAluno(alunos.get("Debra"));
        turmaED.adicionarAluno(alunos.get("Iracema"));
        turmaED.adicionarAluno(alunos.get("Julieta"));
        turmaED.adicionarAluno(alunos.get("Luciana"));
        turmaED.adicionarAluno(alunos.get("Norberto"));
        turmaED.adicionarAluno(alunos.get("Wendel"));
        turmaED.adicionarAluno(alunos.get("Zoey"));

        turmaBI.adicionarAluno(alunos.get("Ana"));
        turmaBI.adicionarAluno(alunos.get("Bentinho"));
        turmaBI.adicionarAluno(alunos.get("Ian"));
        turmaBI.adicionarAluno(alunos.get("Joelmir"));
        turmaBI.adicionarAluno(alunos.get("Luana"));
        turmaBI.adicionarAluno(alunos.get("Majô"));
        turmaBI.adicionarAluno(alunos.get("Maria"));
        turmaBI.adicionarAluno(alunos.get("Paulo"));
        turmaBI.adicionarAluno(alunos.get("Romeu"));

        
        System.out.println("Ensalamento:");
        turmaPOO.apresentar();
        turmaED.apresentar();
        turmaBI.apresentar();
    }
}