package br.com.egcservice.dependency_inversion;

/**
 * Created by elson on 11/06/2016.
 */
public class LivroImpresso implements Escritor {
    private int numeroPaginas;

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void escreverLivro(String conteudo) {
        System.out.println("Conteúdo do Livro: " + conteudo);
    }
}
