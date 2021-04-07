package Nodes;

public class VNode implements RomanNumber{
    private RomanNumber next;

    public VNode() {
        next = new NNode();
    }

    public void setNext(INode iNode){
        this.next = iNode;
    }

    @Override
    public int getValue() {
        return 5 + next.getValue();
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        if (romanNumber.getValue() == 1) {
            next = romanNumber;
        } else {
            throw new UnsupportedOperationException("Invalid Number");
        }
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
