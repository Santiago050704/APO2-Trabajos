
import java.util.ArrayList;


public class BST {
    private Node root;
    public BST(){

    }
    public void add(Node node){
        if(root == null){
            root = node;
            //System.out.println(root.getKey());
        }else{
            add(root, node);
        }
    }
    private void add(Node current, Node node){
        if(node.getKey().compareTo(current.getKey()) < 0){
            //Meter a la izquierda
            if(current.getLeft() == null){
                current.setLeft(node);
            }else{
                add(current.getLeft(), node);
            }
        }else if(node.getKey().compareTo(current.getKey()) > 0){
            //Meter a la derecha
            if(current.getRight() == null){
                current.setRight(node);
            }else{
                add(current.getRight(), node);
            }
        }else{
            //No hacer nada, es el mismo
        }
    }

    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node current){
        if(current == null){
            return;
        }
        inOrder(current.getRight());
        System.out.print(current.getKey() + " ");
        inOrder(current.getLeft());
    }

    public int obtainDepth(){
        return obtainDepth(root);
    }

    private int obtainDepth(Node current){
        int leftDepth = 0;
        int rightDepth = 0;
        if(current == null){
            return 0;
        }else{
            leftDepth = obtainDepth(current.getLeft());
            rightDepth = obtainDepth(current.getRight());
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }

    public void activatePassToTree(ArrayList<String> listNames){
        Node base = passToTree(listNames);
    }

    private Node passToTree(ArrayList<String> listNames){
        Node half;
        ArrayList<String> leftTree = new ArrayList<String>();
        ArrayList<String> rightTree = new ArrayList<String>();
        if(listNames.size() <= 1){
            return new Node(listNames.get(0));
        }else{
            int middlePos = (listNames.size()/2)-1;
            half = new Node(listNames.get(middlePos));
            for(int i = 0; i < middlePos; i++){
                leftTree.add(listNames.get(i));
            }
            for(int i = middlePos + 1; i <= listNames.size() - 1; i++){
                rightTree.add(listNames.get(i));
            }
            add(half);
            if(0 < leftTree.size()){
                half.setLeft(passToTree(leftTree));
            }
            if(0 < rightTree.size()){
                half.setRight(passToTree(rightTree));
            }
        }
        return half;
    }
}
