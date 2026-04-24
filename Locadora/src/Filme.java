public class Filme {


    private String titulo;
    private String genero;
    private int valor;

    public Filme(String titulo, String genero, int valor) {
        this.titulo = titulo;
        this.genero = genero;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}