public class NodeUsername {
    private String key;
    private ScoreRegistry data;
    private NodeUsername left;
    private NodeUsername right;

    public NodeUsername(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ScoreRegistry getData() {
        return data;
    }

    public void setData(ScoreRegistry data) {
        this.data = data;
    }

    public NodeUsername getLeft() {
        return left;
    }

    public void setLeft(NodeUsername left) {
        this.left = left;
    }

    public NodeUsername getRight() {
        return right;
    }

    public void setRight(NodeUsername right) {
        this.right = right;
    }
}
