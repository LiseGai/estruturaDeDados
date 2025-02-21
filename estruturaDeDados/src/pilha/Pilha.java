package pilha;

import estruturaLinear.listaEncadeada;

public class Pilha {

    private listaEncadeada<String> lista;

    public Pilha() {
        this.lista = new listaEncadeada<>();
    }

    public void adicionar(String novoValor) {
        this.lista.adicionarComeco(novoValor);
    }

    public void remover() {
        if (this.lista.getTamanho() > 0) {
            this.lista.Remover(this.get());
        } else {
            System.out.println("Pilha vazia, nada para remover.");
        }
    }

    public String get() {
        if (this.lista.getTamanho() > 0) {
            return this.lista.getPrimeiro().getValor();
        }
        return null;
    }
}
