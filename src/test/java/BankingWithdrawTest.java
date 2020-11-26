import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BankingWithdrawTest {

	
	@Parameters    
    public static Collection data2() { 
    List testData = Arrays.asList(new Object[]
[] {
              { 50,"CAD",50},            
              { 40, "USD",48 },
              { 80, "Pessos",94.8},
              });

    return testData;    }
	

	   private final Account account ;
	    private final double first ;
	    private final String second ;
	    private final double expectedwithdraw;
	 
	    public BankingWithdrawTest(double first, 
                String second, 
                double expectedwithdraw) {

    this.account = new Account("ABCD","Checking",100.0);
     this.first = first;
    this.second = second;
    this.expectedwithdraw = expectedwithdraw;
}
	    
	    
 
		   @Test
		    public void testdeposit() {
		        double actualwithdraw = account.withdraw(first, second);
		        assertEquals(actualwithdraw, expectedwithdraw,0.001);
		    }		   
		 
	   

}

