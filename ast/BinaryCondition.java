package ast;

import java.util.HashMap;

/**
 * A representation of a binary Boolean condition: 'and' or 'or'
 *
 */
public class BinaryCondition implements Condition {
	
	private Condition left;
	private Operator operator;
	private Condition right;

    /**
     * Create an AST representation of l op r.
     * @param l
     * @param op
     * @param r
     */
    public BinaryCondition(Condition l, Operator op, Condition r) {
        //TODO
    	left = l;
    	operator=op;
    	right = r;
    }

    @Override
    public int size() {
    	// TODO Auto-generated method stub
    	if (this.operator==null || this.left == null || this.right==null) {
    		return 1;
    	}
    	else {
    		return this.left.size()+this.right.size();
    	}
    }

    @Override
    public Node nodeAt(int index) {
        // TODO Auto-generated method stub
    	if (index ==0) {
    		return this;
    	} 
    	return left.nodeAt(index-1)+right.nodeAt(index-2);
    	Node left = nodeAt(index-1);
        return null;
    }
    
    @Override
    public StringBuilder prettyPrint(StringBuilder sb) {
        // TODO Auto-generated method stub
    	
        return .append(sb);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * An enumeration of all possible binary condition operators.
     */
    public enum Operator {
        OR, AND;
    }
}
