package Nodes;

public class NodeFactory {

    public static RomanNumber nodeFactory(String symbol){
        return switch (symbol) {
            case "I","i" -> new INode();
            case "V","v" -> new VNode();
            case "X","x" -> new XNode();
            case "L","l" -> new LNode();
            case "C","c" -> new CNode();
            case "D","d" -> new DNode();
            case "M","m" -> new MNode();
            default -> throw new UnsupportedOperationException("Unexpected value: " + symbol);
        };
    }
}
