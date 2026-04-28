public class Main {
        public static void main(String[] args) {

            Cliente cliente = new Cliente("Ana", "(35) 99761-9972");

            Filme filme = new Filme("It", "Terror", 10);

            filme.setValor(filme.getValor() - 2);

            Aluguel aluguel = new Aluguel("Ana", "7", "It");

            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Filme: " + filme.getTitulo());
            System.out.println("Dias: " + aluguel.getDias());

            System.out.println("Total: " + (filme.getValor() + aluguel.getDias()));
        }
    }
