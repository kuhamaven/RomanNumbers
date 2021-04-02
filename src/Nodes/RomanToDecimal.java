package Nodes;

public class RomanToDecimal {

    public static int convert(String romanNumber){
        if(romanNumber.isEmpty()) return 0;
        if(!stringIsValid(romanNumber)) return -1;
        RomanNumber result = NodeFactory.nodeFactory(romanNumber.substring(0,1));
        RomanNumber currentNode = result;
        try{
            for (int i = 1; i < romanNumber.length(); i++) {
                currentNode.setNext(NodeFactory.nodeFactory(romanNumber.substring(i,i+1)));
                currentNode = currentNode.getNext();
            }
        }
        catch (UnsupportedOperationException e){
            return -1;
        }
        return result.getValue();
    }

    private static boolean stringIsValid(String romanNumber){
        if (romanNumber.length()>15) return false;
        String regex = "^[MDCLXVImdclxvi]+$";
        if (!romanNumber.matches(regex)) return false;
        // you never have more than 3 I X C or M in the number
        // you never have more than 1 V L or D in the number
        // it should reject substraction addition cancel, like IXI, IVI, XLX, XCX, CDC & CMC
        return true;
    }
}
