import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }
}