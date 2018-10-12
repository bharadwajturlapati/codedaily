package algorithms;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BalancingExpressionTest {
	
	@Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
                 { 0, 0 }, { 1, 1 }, { 2, 1 }, { 3, 2 }, { 4, 3 }, { 5, 5 }, { 6, 8 }  
           });
    }
	
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
