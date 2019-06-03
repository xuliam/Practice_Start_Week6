package Practice_Start_Week6;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAddDelateSearchChang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		//int i = 1;
		double[] numArray = new double[1];
		int numCount = 0;
		for(;;numCount++) {
			if(numCount == numArray.length) {
				numArray = Arrays.copyOf(numArray, numArray.length*2);
				
				System.out.println(Arrays.toString(numArray));
			}
			System.out.println("pls enter the  "+(numCount+1)+" element");
			numArray[numCount]= input.nextDouble();
			System.out.println("Go on Y/N?");
			String choice = input.next();
			if(!"y".equalsIgnoreCase(choice)) {
				break;
			}
			for (int i = 0; i < numArray.length; i++) {
				
				System.out.println(numArray[numCount]);
			}
			
		}
		
		System.out.println("Pls enter the NO. which you want delete");
		double delNum = input.nextDouble();
		int delIndex = -1;
		for (int i = 0; i < numArray.length; i++) {
			if(delNum == numArray[i]) {
				delIndex = i;
				break;
			}
		}
		if(delIndex == -1) {
			System.out.println("Nothing find out!");
		}else {
			for (int i = delIndex; i < numArray.length-1; i++) {
				numArray[i] = numArray[i+1];
			}
			numCount--;
		}
	}

}
