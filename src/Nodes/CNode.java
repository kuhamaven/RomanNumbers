package Nodes;

public class CNode implements RomanNumber{
    private RomanNumber next;
    private boolean substract;

    public CNode() {
        next = new NNode();
        substract = false;
    }

    @Override
    public int getValue() {
        return substract? -100 + next.getValue(): 100 + next.getValue();
    }

    public void setNext(RomanNumber romanNumber){
        if(romanNumber.getValue()>=500) substract = true;
        this.next = romanNumber;
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
