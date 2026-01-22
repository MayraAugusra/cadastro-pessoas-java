package br.com.mayra;

public class Application {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Mayra", 23);
        PessoaService service = new PessoaService();

        service.mostrarPessoa(pessoa);
    }
}

