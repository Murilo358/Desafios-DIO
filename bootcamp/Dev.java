package bootcamp;
import java.util.List;

public class Dev {
    private String nome;
    private int idade;
    private List<Curso> cursosConcluidos;

    public Dev(String nome, int idade, List<Curso> cursosConcluidos) {
        this.nome = nome;
        this.idade = idade;
        this.cursosConcluidos = cursosConcluidos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Curso> getCursosConcluidos() {
        return cursosConcluidos;
    }

    public void setCursosConcluidos(List<Curso> cursosConcluidos) {
        this.cursosConcluidos = cursosConcluidos;
    }
}

