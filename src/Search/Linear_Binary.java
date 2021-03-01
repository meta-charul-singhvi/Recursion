package Search;
import java.util.Scanner;

public class Linear_Binary {
	
	public static boolean linSearch(int[] arr, int linSearchElem, int index)throws Exception{
		boolean result = false;
		if (arr.length == 0) {
			throw new Exception("Array is empty!");
		}
		else if(index < arr.length){
			if(linSearchElem == arr[index])
				return true;
			else if(index >= arr.length)
				return false;
			else{
				index++;
				result = linSearch(arr, linSearchElem, index);
			}
		}
		else if( index>=arr.length ){
			throw new Exception ("Element not found!");
		}
		return result;
	}
	
	public static int binSearch(int[] arr, int binSearchElem, int midIndex)throws Exception{
		int index = -1;
		if (arr.length == 0) {
			throw new Exception("Array is empty.");
		}
		else if (binSearchElem == arr[arr.length - 1])
			return (arr.length-1);
		
		else if(binSearchElem == arr[midIndex])
			return midIndex;
		
		else if(binSearchElem < arr[midIndex]){
			index = binSearch(arr, binSearchElem, (midIndex-1)/2);
		}
		else if(binSearchElem > arr[midIndex+1]){
			index = binSearch(arr, binSearchElem, (midIndex+arr.length)/2);
		}
		return index;
	}
	
	
	public static void main(String[] args) throws Exception{
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter number of values : ");
		int n = scan.nextInt();
		
		int[] arr= new int[n];
		for(int i=0; i<n; i++){
			System.out.print("Enter value "+ i +" : ");
			arr[i]= scan.nextInt();
		}
		
		System.out.println("Enter element to search in array: ");
		int searchElem = scan.nextInt();
		
		boolean result = linSearch(arr,searchElem, 0);
		System.out.println("Using LINEAR SEARCH\nDoes "+searchElem+" exists in array -> "+result+"\n");
		
		//Assuming array is sorted
		int index = binSearch(arr, searchElem, arr.length-1/2);
		System.out.println("Using BINARY SEARCH");
		if (index == -1) {
			extracted();
		}
		//Following zero indexing 
		System.out.print("Element "+searchElem+" exists in array at -> "+index);
		
		scan.close();
	}

	private static void extracted() throws Exception {
		throw new Exception ("Element doesn't exist!");
	}

}
