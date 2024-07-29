package bootcamp;

public class Curso {
    private String titulo;
    private int cargaHoraria;
    private String descricao;

    // Construtor
    public Curso(String titulo, int cargaHoraria, String descricao) {
        this.titulo = titulo;
        this.cargaHoraria = cargaHoraria;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
