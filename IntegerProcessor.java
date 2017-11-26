import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class IntegerProcessor{
	
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("intList.txt");
		Scanner scanner = new Scanner(file);
		 int index=0;
		 int sum=0;
	while(scanner.hasNextInt()){
	       int i = scanner.nextInt();
	       sum+=i;
	       i++;
	       index++;
	       System.out.println(i);
	      
	     
	       
	       
	    }

	System.out.println("Average:" + (sum/index));
  
	
	}	


}