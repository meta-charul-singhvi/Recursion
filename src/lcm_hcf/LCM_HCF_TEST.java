package lcm_hcf;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LCM_HCF_TEST {
	
	//Test cases for LCM function.
	@Test 
	public void TestLcmOfTwonumbersExp1(){
		try { 
			LCM_HCF.lcmOfNumbers(0,1, 1); 
		}
		catch (Exception e) { 
			assertEquals("Input should be non zero numbers!", e.getMessage());
		}

	}
	
	@Test 
	public void TestLcmOfTwonumbersExp2(){
		try { 
			LCM_HCF.lcmOfNumbers(1,0, 1); 
		}
		catch (Exception e) { 
			assertEquals("Input should be non zero numbers!", e.getMessage());
		}

	}
	
	@Test 
	public void TestHcfOfTwonumbersExp3(){
		try { 
			LCM_HCF.hcfOfNumbers(2,-1); 
		}
		catch (Exception e) { 
			assertEquals("Input should be positive numbers!", e.getMessage());
		}

	}

	@Test 
	public void TestLcmOfTwonumbers1() throws Exception{
		assertEquals(10,LCM_HCF.lcmOfNumbers(5,10, 1));
	}
	
	//Test cases for HCF function.
	@Test 
	public void TestHcfOfTwonumbersExp1(){
		try { 
			LCM_HCF.hcfOfNumbers(0,0); 
		}
		catch (Exception e) { 
			assertEquals("Input should be non zero numbers!", e.getMessage());
		}

	}

	@Test 
	public void TestHcfOfTwonumbersExp2(){
		try { 
			LCM_HCF.hcfOfNumbers(2,-1); 
		}
		catch (Exception e) { 
			assertEquals("Input should be positive numbers!", e.getMessage());
		}
	}
	
	@Test
	public void TestHcfOfTwonumbers1() throws Exception{
		assertEquals(1,LCM_HCF.hcfOfNumbers(0,1));
	}
	
	@Test
	public void TestHcfOfTwonumbers2() throws Exception{
		assertEquals(1,LCM_HCF.hcfOfNumbers(1,0));
	}
	
	@Test
	public void TestHcfOfTwonumbers3() throws Exception{
		assertEquals(5,LCM_HCF.hcfOfNumbers(10,5));
	}
	
	@Test
	public void TestHcfOfTwonumbers4() throws Exception{
		assertEquals(5,LCM_HCF.hcfOfNumbers(5,10));
	}

	
}