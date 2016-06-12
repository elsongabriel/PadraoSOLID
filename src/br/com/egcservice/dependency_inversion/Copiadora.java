package br.com.egcservice.dependency_inversion;

/**
 * Created by elson on 11/06/2016.
 */
public class Copiadora {
    public void escanearLivro(LivroImpresso livro) {
        int pagina = 0;
        String conteudo = null;

        while (pagina < livro.getNumeroPaginas()) {
            conteudo = conteudo + livro.toString();
            pagina++;
        }

        livro.escreverLivro(conteudo);
    }
}
