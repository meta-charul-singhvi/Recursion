package nQueen;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class N_Queens_Test {
	
	@Test
	public void QueensProblemTest1(){
		try{
			N_Queens.createMatrix(1);
		}
		catch (Exception e){
			assertEquals("The size of the matrix should be greater than 3!",e.getMessage());
		}
	}
}