public class NodeScore {
    private int key;
    private ScoreRegistry data;
    private NodeScore left;
    private NodeScore right;

    public NodeScore(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public ScoreRegistry getData() {
        return data;
    }

    public void setData(ScoreRegistry data) {
        this.data = data;
    }

    public NodeScore getLeft() {
        return left;
    }

    public void setLeft(NodeScore left) {
        this.left = left;
    }

    public NodeScore getRight() {
        return right;
    }

    public void setRight(NodeScore right) {
        this.right = right;
    }
}
