package pilha;

public class PilhaCodigo {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.adicionar("Maria");
        pilha.adicionar("José");
        pilha.adicionar("Pedro");

        System.out.println("Topo da pilha: " + pilha.get());

        pilha.remover();
        System.out.println("Após remover, novo topo: " + pilha.get());
    }
}

