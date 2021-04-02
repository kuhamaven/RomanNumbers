package Nodes;

public class INode implements RomanNumber{
    private RomanNumber next;
    private boolean substract;

    public INode() {
        substract = false;
        next = new NNode();
    }

    @Override
    public int getValue() {
        return substract? -1 + next.getValue(): 1 + next.getValue();
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        switch (romanNumber.getValue()) {
            case 1 -> next = romanNumber;
            case 10, 5 -> {
                next= romanNumber;
                substract=true;
            }
            default -> throw new UnsupportedOperationException("Invalid Number");
        }
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
