package Nodes;

public class XNode implements RomanNumber{
    private RomanNumber next;
    private boolean substract;

    public XNode() {
        substract = false;
        next = new NNode();
    }

    @Override
    public int getValue() {
        return substract? -10 + next.getValue(): 10 + next.getValue();
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        switch (romanNumber.getValue()) {
            case 1, 10, 5 -> next = romanNumber;
            case 50, 100 -> {
                next = romanNumber;
                substract = true;
            }
            default -> throw new UnsupportedOperationException("Invalid Number");
        }
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
