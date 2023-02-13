
import java.util.Scanner;
public class LinkedList {
    private static Scanner reader = new Scanner(System.in);
    private Node head;
    private Node tail;
    private Player player;
    private int points;
    private int totalQuestionsChosed;

    public LinkedList(String playerName, int totalQuestionsChosed) {
        this.player = new Player(playerName);
        this.totalQuestionsChosed = totalQuestionsChosed;
        this.points = 0;
        fillLinkedList(totalQuestionsChosed);
        setPlayerAtHead(player);
    }

    public void addNode(Node node){
        if(head == null){
            head = node;
            tail = node;
        }else{
            tail.setNext(node);
            node.setPrevious(tail);
            tail = node;
        }
    }
    public void fillLinkedList(int N){
        for(int i = 0; i < N; i++){
            Node node = new Node();
            addNode(node);
            node.setName(i+1);
        }
    }

    public void setPlayerAtHead(Player player){
        if(head != null){
            head.setPlayer(player);
        }

    }

    /*public void print(){
        print(head, 1);
    }*/



    /*public void print(Node current){
        if(current == null){
            return;
        }

    }*/

    /*public void printNodePlayer(Node current, int i){
        if(current.getName() == i){
            System.out.println("[" + current.getName() + "*]" + " ");
        }
    }*/

    public void answerQuestion(){
        answerQuestion(head);
    }

    private String answerQuestion(Node current){
        if(current == tail){
            current.setPlayer(current.getPrevious().getPlayer());
            current.getPrevious().setPlayer(null);
            return current.printNodePlayer();
        }else{
            reader.nextLine();
            current.getNext().setPlayer(current.getPlayer());
            current.setPlayer(null);
            return current.printNodePlayer();
            answerQuestion(current.getNext());
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }
}
