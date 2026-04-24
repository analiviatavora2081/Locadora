public class Aluguel {

    private String Cliente;
    private String Filme;
    private String Dias;

    public Aluguel(String cliente, String dias, String filme) {
        Cliente = cliente;
        Dias = dias;
        Filme = filme;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public String getFilme() {
        return Filme;
    }

    public void setFilme(String filme) {
        Filme = filme;
    }

    public String getDias() {
        return Dias;
    }

    public void setDias(String dias) {
        Dias = dias;
    }


}