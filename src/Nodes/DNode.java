package Nodes;

public class DNode implements RomanNumber{
    private RomanNumber next;

    public DNode() {
        next = new NNode();
    }

    @Override
    public int getValue() {
        return 500 + next.getValue();
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        switch (romanNumber.getValue()) {
            case 1, 10, 5, 50, 100 -> next = romanNumber;
            default -> throw new UnsupportedOperationException("Invalid Number");
        }
    }

    @Override
    public RomanNumber getNext() {
        return this.next;
    }
}
