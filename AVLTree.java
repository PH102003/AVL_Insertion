import java.util.LinkedList;
import java.util.List;

public class AVLTree {
    private AVLNode<Integer> root;

    public void inserir(){
        
    }
    public LinkedList<Integer> passeioEmOrdem() {
        LinkedList<Integer> newList = new LinkedList<>();
        passeioEmOrdem(root, newList);  // Call the recursive method with root

        return newList;
    }

    private void passeioEmOrdem(AVLNode<Integer> atual, LinkedList<Integer> newList) {
        if (atual != null) {
            passeioEmOrdem(atual.getLeft(), newList);
            newList.add(atual.getInfo().intValue());  // Extract the Integer value
            passeioEmOrdem(atual.getRight(), newList);
        }
    }

    public LinkedList<Integer> passeioPorNivel(){

    }
}
