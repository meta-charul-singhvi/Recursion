package Search;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Linear_Binary_Test {

	//Testing Linear Search
	@Test
	public void TestOfLinearSearchExp1(){
		try{
			int[] arr = {};
			Linear_Binary.linSearch(arr, 45, 0);
		}
		catch (Exception e) { 
			assertEquals("Array is empty!", e.getMessage());
		}
	}
	
	public void TestOfLinearSearchExp2(){
		try{
			int[] arr = {90, 56, 43};
			Linear_Binary.linSearch(arr, 89, 0);
		}
		catch (Exception e) { 
			assertEquals("Element not found!", e.getMessage());
		}
	}
	
	@Test
	public void TestOfLinearSearch1() throws Exception{
		int[] arr = {90, 56, 43, 60};
		assertEquals(true, Linear_Binary.linSearch(arr, 60, 0));
	}
	
	@Test
	public void TestOfLinearSearch2() throws Exception{
		int[] arr = {90, 56, -1, 43, 60};
		assertEquals(true, Linear_Binary.linSearch(arr, -1, 0));
	}
	
	//Testing Binary Search
	@Test
	public void TestOfBinarySearchExp1(){
		try{
			int[] arr = {12,23,34,45,56};
			Linear_Binary.binSearch(arr, 44, 2);
		}
		catch (Exception e) { 
			assertEquals("Element doesn't exist!", e.getMessage());
		}
	}
	
	@Test
	public void TestOfBinarySearch1() throws Exception{
		int[] arr = {9, 16, 33, 43, 60};
		assertEquals(2, Linear_Binary.binSearch(arr, 33, 2));
	}
	
	@Test
	public void TestOfBinarySearch2() throws Exception{
		int[] arr = {-4, 9, 16, 33, 43, 60};
		assertEquals(0, Linear_Binary.binSearch(arr, -4, 2));
	}
	
}
