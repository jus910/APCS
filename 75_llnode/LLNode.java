// Watermelon: Justin Mohabir, Jomin Zhang, Anthony Sun
//APCS pd7
//HW75 -- node
//2022-03-14m
//time spent: 0.5hr + class time

public class LLNode {
    private String value;
    private LLNode node;

    public LLNode() {
        this.value = null;
        this.node = null;
    }

    public LLNode(String value, LLNode node) {
        this.value = value;
        this.node = node;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setSubNode(LLNode node) {
        this.node = node;
    }
    public LLNode getSubNode() {
        return this.node;
    }
}
