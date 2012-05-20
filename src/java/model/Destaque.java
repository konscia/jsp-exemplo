package model;

public class Destaque {
    
    private String titulo;
    private String subtitulo;

    public Destaque(String titulo, String subtitulo) {
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTitulo() {
        return titulo.toLowerCase();
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
