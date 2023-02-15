
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

    public String printLinkedList(){
        return printLinkedList(head);
    }
    private String printLinkedList(Node current){
        String msj = "";
        if(current != null){
            msj += current.printNodePlayer() + printLinkedList(current.getNext());
        }
        return msj;
    }

    public void answerQuestion(){
        answerQuestion(head);
    }

    private void answerQuestion(Node current){
        System.out.println(printLinkedList());
        validateAnswer(current.getNext());
        if(current == tail){
            current.setPlayer(current.getPrevious().getPlayer());
            current.getPrevious().setPlayer(null);
        }else{
            reader.nextLine();
            current.getNext().setPlayer(current.getPlayer());
            current.setPlayer(null);
            answerQuestion(current.getNext());

        }
    }

    public void validateAnswer(Node node){
        System.out.println(node.getProblem().getProblem());
        int response = reader.nextInt();
        if(response != -1){
            if(response != node.getProblem().getAnswer()){
                node.setStatus(QuestionStatus.INCORRECTA);
            }else{
                node.setStatus(QuestionStatus.CORRECTA);
            }
        }else{
            node.setStatus(QuestionStatus.PASO);
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
