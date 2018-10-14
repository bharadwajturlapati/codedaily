package algorithms;


import org.junit.Test;
import junit.framework.Assert;

public class BalancingExpressionTest {
	
	@Test
	public void testBalancingequation(){
		String input1 = "";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}

	@Test
	public void testBalancingequation2(){
		String input1 = null;
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void testBalancingequation3(){
		String input1 = "()";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void testBalancingequation4(){
		String input1 = "((a+b))";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void testBalancingequation5(){
		String input1 = "((a+b)";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, false);
	}
	
	@Test
	public void testBalancingequation6(){
		String input1 = "({a+b)";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, false);
	}
	
	@Test
	public void testBalancingequatio7(){
		String input1 = "({}a+b)";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}
	
	@Test
	public void testBalancingequation58(){
		String input1 = "{}()[]";
		BalancingExpression expressionEvaluator = new BalancingExpression(input1);
		boolean result = expressionEvaluator.isExpressionBalanced();
		Assert.assertEquals(result, true);
	}
}
