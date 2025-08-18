package Assignments;


public class Assignment5_ConditionalStatement {

	public static void main(String[] args) {

		

		//Customer Details::
			
	String	customerName = "John Doe";
	int     creditScore = 720;
	double  income = 55000.0;
	boolean isEmployed = true;
	double  debtToIncomeRatio = 35.0;
	    
	    
System.out.println("Loan Evaluation Result \n" +"custer name = " +customerName );   
	  
		

		
		if (creditScore > 750) {
			
			
			System.out.println("loan is automatically approved.");
		}
	
		
		else if (creditScore >= 650) {
			
			
			System.out.println("Additional checks are performed..");
			
			if (income >= 50000) {
			
					
					if (isEmployed) {
						System.out.println("customer is unemployed, the loan is denied..");
						
						
						
						if (debtToIncomeRatio> 40.0) {
							System.out.println("Loan Approved: Meets all criteria.");
						}
							else {
							System.out.println("Loan Denied: Debt-to-Income ratio is too high.");
							}
						
				}
				
		}
	
		
	
}
		
	
	}
}

