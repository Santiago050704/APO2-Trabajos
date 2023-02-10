public class LinkedList {
    private Node head;
    private Node tail;
    private Player player;
    private int points = 0;
    private int totalQuestionsChosed;

    public LinkedList(String playerName, int totalQuestionsChosed) {
        this.player = new Player(playerName);
        this.totalQuestionsChosed = totalQuestionsChosed;
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

    public void print(){
        print(head);
    }

    public void print(Node current){
        if(current == null){
            return;
        }
        if(current.getName() != 1){
            System.out.print("[" + current.getName() + "]" + " ");
            print(current.getNext());
        }else{
            System.out.print("[" + current.getName() + "*]" + " ");
            print(current.getNext());
        }
    }

    public void answerQuestion(){

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
