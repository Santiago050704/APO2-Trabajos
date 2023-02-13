public class Node {
    private int name;
    private Node next;
    private Node previous;
    private Player player;
    private Problem problem;
    private QuestionStatus status;

    public Node() {
        this.name = 0;
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

    public String printNodePlayer(){
        String txt = "[ " + name + " ";
        if (status != QuestionStatus.PASO){
            txt = "[ " + name + " ";
            if(player != null){
                txt += "*";
            }else{
                switch (status){
                    case CORRECTA:
                        txt += "+";
                        break;
                    case INCORRECTA:
                        txt += "x";
                        break;
                }
            }

        }
        return txt += " ]";
        //printNodePlayer();
    }
}
