import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Disciplina {
    private String nome;
    private Curso curso;

    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public Curso getCurso() {
        return curso;
    }
}