package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("Os instrumentos mortais - Cidade dos Ossos", 458);
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/
    }

}

class Livro {
    private String nome;
    private Integer nunPag;

    public Livro(String nome, Integer nunPag) {
        this.nome = nome;
        this.nunPag = nunPag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNunPag() {
        return nunPag;
    }

    public void setNunPag(Integer nunPag) {
        this.nunPag = nunPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nunPag=" + nunPag +
                '}';
    }
}

