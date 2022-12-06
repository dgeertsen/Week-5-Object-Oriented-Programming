import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[3];
		System.out.println("hi");
		
		if(numbers.length>3) {
			System.out.println(numbers[3]);
		}
	
		
		
		System.out.println("bye-bye");
		//Checked Exception - Explicitly check for in our code.
		//Try Catch block - handles check exceptions
		//Unchecked Exception - something we have control over and only occurs if we make mistakes in our code.
		try {
			FileReader fileReader = new FileReader("fffff.txt");
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} finally {
			System.out.println("Finally");
		}
		
		
		
		
	}

}
