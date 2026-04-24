public class Filme {

    private String Titulo;
    private String Genero;
    private String Valor;

    public Filme(String titulo, String valor, String genero) {
        Titulo = titulo;
        Valor = valor;
        Genero = genero;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }
}
