package Assignments;

public class Assignment_6_ArraysDatatypesOperators {

	public static void main(String[] args) {
		

		
		String[] StudentName = {"Suresh",  "Mahesh","Naresh"};
		int[]Mark= {75, 80, 82};
		
		int[] updatedMarks = new int[3];

		updatedMarks[0] = Mark[0] + 10;
		updatedMarks[1] = Mark[1] + 10;
		updatedMarks[2] = Mark[2] + 10;
		
		
		System.out.println("Enter Student Name \n "+ StudentName[0]);
		System.out.println("Enter Student Mark \n" + updatedMarks[0]);
		
		System.out.println("Enter Student Name \n" + StudentName[1]);
		System.out.println("Enter Student Mark \n" + updatedMarks[1]);
		
		System.out.println("Enter Student Name \n" + StudentName[2]);
		System.out.println("Enter Student Mark \n" + updatedMarks[2]);
		
		// Calculate the average of updated marks
		
		int averageMarks = (updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) / updatedMarks.length;

		// Print the average marks
		System.out.println("Average Marks: " + averageMarks);
	
	 
		 
	}

}
