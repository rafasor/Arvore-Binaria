public class Main {
    public static void main(String[] args) {
        BinaryTree arvore = new BinaryTree();

        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(20);

        System.out.print("Pré-ordem: ");
        arvore.preOrdem();

        System.out.print("In-ordem: ");
        arvore.inOrdem();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem();

        System.out.println("Busca 10: " + arvore.buscar(10));
        System.out.println("Busca 7: " + arvore.buscar(7));
    }
}
