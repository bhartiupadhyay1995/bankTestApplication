import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.assertEquals;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class BankingTest {
	
	
	
	
	@Parameters    
    public static Collection data() { 
    List testData = Arrays.asList(new Object[]
[] {
              { 500,"USD",750},            
              { 100, "CAD",200 },
              { 300, "Pessos",119.5 },
              });

    return testData;    }
	

	  private final Account account ;
	    private final double first ;
	    private final String second ;
	    private final double expectedSum;
	 
	    public BankingTest(double first, 
                String second, 
                double expectedSum) {

    this.account = new Account("ABCD","Checking",100.00);
     this.first = first;
    this.second = second;
    this.expectedSum = expectedSum;
}
	    
	   
		   @Test
		    public void testdeposit() {
		        double actualdeposit = account.deposit(first, second);
		        assertEquals(actualdeposit, expectedSum,0.001);
		    }
		  
	   

}
