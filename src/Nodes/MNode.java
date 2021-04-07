package Nodes;

public class MNode implements RomanNumber{
    private RomanNumber next;

    public MNode() {
        next = new NNode();
    }

    @Override
    public int getValue() {
        return 1000 + next.getValue();
    }

    public void setNext(RomanNumber romanNumber){
        this.next = romanNumber;
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
