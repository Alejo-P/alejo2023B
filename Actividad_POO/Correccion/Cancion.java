public class Cancion extends Extra {
    private String Titulo, Autor;

    public Cancion(String n) {
        super(n);
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + getTitulo() + '\'' +
                ", autor='" + getAutor() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", valoracion=" + getValoracion() +
                '}';
    }
}
