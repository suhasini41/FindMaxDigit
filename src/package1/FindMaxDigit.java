package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindMaxDigit {
	
	private int finfMaxDigit(int[] n) {
		int max = 0;
		String newNum = "";
		for (int i = 0; i<n.length; i++) 
		{
			while(n[i]>0)
			{
				if((n[i]%10)>max)
				{
					max = n[i]%10;
					
				}
				 n[i] = n[i]/10;
			}
			System.out.println(max);
			newNum = newNum + max;
		}
		int num = Integer.parseInt(newNum);
		return num;
	}
	
	@Test
	public void testCase1()
	{
		int[] n = {123, 555, 678};
		Assert.assertEquals(finfMaxDigit(n),358);
	}
}
