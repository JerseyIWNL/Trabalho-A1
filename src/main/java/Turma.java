import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Turma {
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;

    public Turma(Professor professor, Disciplina disciplina) {
        this.professor = professor;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void apresentar() {
        System.out.println("Turma da disciplina " + disciplina.getNome() + ", ministrada pelo professor " + professor.getNome());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(" - " + aluno.getNome() + " (" + aluno.getCurso() + ")");
        }
    }
}
