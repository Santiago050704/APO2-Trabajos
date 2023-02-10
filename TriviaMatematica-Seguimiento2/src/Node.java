public class Node {
    private int name;
    private Node next;
    private Node previous;
    private Player player;
    private Problem problem;

    public Node(/*int name, Node next, Node previous, Player player, Problem problem*/) {
        /*this.name = name;
        this.next = next;
        this.previous = previous;
        this.player = player;
        this.problem = problem;*/
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
}
