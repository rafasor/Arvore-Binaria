public class BinaryTree {
    Node raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node raiz, int valor) {
        if (raiz == null) {
            raiz = new Node(valor);
            return raiz;
        }
        if (valor < raiz.valor)
            raiz.esquerda = inserirRec(raiz.esquerda, valor);
        else if (valor > raiz.valor)
            raiz.direita = inserirRec(raiz.direita, valor);
        return raiz;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node raiz, int valor) {
        if (raiz == null)
            return false;
        if (raiz.valor == valor)
            return true;
        return valor < raiz.valor ? buscarRec(raiz.esquerda, valor) : buscarRec(raiz.direita, valor);
    }

    public void preOrdem() {
        preOrdemRec(raiz);
        System.out.println();
    }

    private void preOrdemRec(Node raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            preOrdemRec(raiz.esquerda);
            preOrdemRec(raiz.direita);
        }
    }

    public void inOrdem() {
        inOrdemRec(raiz);
        System.out.println();
    }

    private void inOrdemRec(Node raiz) {
        if (raiz != null) {
            inOrdemRec(raiz.esquerda);
            System.out.print(raiz.valor + " ");
            inOrdemRec(raiz.direita);
        }
    }

    public void posOrdem() {
        posOrdemRec(raiz);
        System.out.println();
    }

    private void posOrdemRec(Node raiz) {
        if (raiz != null) {
            posOrdemRec(raiz.esquerda);
            posOrdemRec(raiz.direita);
            System.out.print(raiz.valor + " ");
        }
    }
}
