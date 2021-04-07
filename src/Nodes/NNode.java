package Nodes;

public class NNode implements RomanNumber{
    public NNode(){

    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void setNext(RomanNumber romanNumber) {
        throw new UnsupportedOperationException("Invalid Number");
    }

    @Override
    public RomanNumber getNext() {
        return this;
    }
}
