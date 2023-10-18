package br.com.projeto.dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cagarHoraria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCagarHoraria() {
        return cagarHoraria;
    }

    public void setCagarHoraria(int cagarHoraria) {
        this.cagarHoraria = cagarHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cagarHoraria=" + cagarHoraria +
                '}';
    }
}
