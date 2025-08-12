package Assignments;

public class Assignment3_EmpGroups {

	String [][] group = {{"Bharath","1234"}, {"ABC","1235"},{"XYZ","1236"}};
	
	

	public static void main(String[] args) {
		
		
		Assignment3_Employees obj = new Assignment3_Employees();
		
		//EmpGroups obj2 = new EmpGroups();
		//System.out.println("Emp name is- " +  obj2[0][0]  + " and Emp ID is- " +  obj2[0][1]  );
		
		System.out.println("Emp name is- " +  obj.EmpName1 + " and Emp ID is- " + obj.Empid1);
		System.out.println("Emp name is- " +  obj.EmpName2 + " and Emp ID is- " + obj.Empid2);
		System.out.println("Emp name is- " +  obj.EmpName3 + " and Emp ID is- " + obj.Empid3);
	}
}