package chapter4;

/*
 * Find the average test scores for each student in the class. 
 * There are 24 students and 4 tests.
 */
import java.util.Scanner;


public class NestedLoops4d {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		float maths;
		float english;
		float chemestry;
		float arts;
		float average = 0;
		
		for(int i = 0; i<24; i++) {
			
			float total = 0;
			
//			for(int j = 0; j<4; j++) {
				System.out.printf("Please enter the student #%d for the next subjects:\n ", i+1);
				System.out.println("Maths: ");
				maths = scanner.nextFloat();
				System.out.println("English: ");
				english = scanner.nextFloat();
				System.out.println("Chemestry: ");
				chemestry = scanner.nextFloat();
				System.out.println("arts: ");
				arts = scanner.nextFloat();
				total = maths + english + chemestry + arts;
				average = total/4;

//				System.out.printf("Test average for student #%d is: %f", i, average);
//			}
			System.out.printf("Test average for student #%d is: %f\n\n", i+1, average);
		}
		
	}
}