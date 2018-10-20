package algorithms;

import java.util.Stack;

public class BalancingExpression {
	
	// test express
	private String expres;
	
	public BalancingExpression(String expr){
		this.expres = expr;
	}
	
	public boolean isExpressionBalanced(){
		if(expres == null || expres == ""){
			return true;
		}
		Stack<String> stack = new Stack<String>();
		
		char[] chararray = expres.toCharArray();
		
		for(int i=0; i<chararray.length; i++){
			pushopeningchars(stack, chararray[i]);
			popclosingchars(stack, chararray[i]);
		}
		
		return stack.isEmpty();
	}

	private void popclosingchars(Stack<String> stack, char c) {
		if(c == '('){
			stack.push("(");
		}
		if(c == '{'){
			stack.push("{");
		}
		if(c == '['){
			stack.push("[");
		}
	}

	private void pushopeningchars(Stack<String> stack, char c) {
		if(c == ')' || c == '}' || c == ']'){
			stack.pop();
		}
	}
}
