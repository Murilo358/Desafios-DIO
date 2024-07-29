package bootcamp;

import java.util.List;

public class Bootcamp {
    private String nome;
    private String descricao;
    private List<Curso> cursos;
    private List<Mentoria> mentorias;

    // Construtor
    public Bootcamp(String nome, String descricao, List<Curso> cursos, List<Mentoria> mentorias) {
        this.nome = nome;
        this.descricao = descricao;
        this.cursos = cursos;
        this.mentorias = mentorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Mentoria> getMentorias() {
        return mentorias;
    }

    public void setMentorias(List<Mentoria> mentorias) {
        this.mentorias = mentorias;
    }
}
