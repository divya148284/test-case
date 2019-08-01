import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
 
public class TaxCalcTest {
    @SuppressWarnings("deprecation")
	@Test
    public void testGetTax0() {
       
    	IncomeTaxCal tester = new IncomeTaxCal();
    	 String status = "M";
         float income = 100000;
          
         float expected = 0;
         float result = tester.getTax(status, income);  
          
         // Tests
         assertEquals(expected, result ,0.001);
  
        // Assert.assertEquals("26655", IncomeTaxCal.getTax("S",100000),0);
 
    }
 
}