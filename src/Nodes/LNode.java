package Nodes;

public class LNode implements RomanNumber{
    private RomanNumber next;

    public LNode() {
        next = new NNode();
    }

    public void setNext(XNode xNode){
        this.next = xNode;
    }

    @Override
    public int getValue() {
        return 50 + next.getValue();
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        switch (romanNumber.getValue()) {
            case 10, 1, 5 -> next = romanNumber;
            default -> throw new UnsupportedOperationException("Invalid Number");
        }
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
