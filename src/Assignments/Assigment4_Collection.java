package Assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assigment4_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//*StudentDetails ******************************
		
			Map<String, String>StudentDetailsMap1 = new HashMap<String, String>();
			StudentDetailsMap1.put("Name" , "John Doe");
			StudentDetailsMap1.put("Age" , "Twenty");
			StudentDetailsMap1.put("Gender" , "Male");
			StudentDetailsMap1.put("Roll Number" , "SBA12345");
			StudentDetailsMap1.put("Grade" , "A++");
			StudentDetailsMap1.put("Major" , "Computer");
			StudentDetailsMap1.put("GPA" , "A3.8");
			StudentDetailsMap1.put("Email" , "John@exam.com");
			StudentDetailsMap1.put("PAN" , "SDFA12344");
			StudentDetailsMap1.put("Adderess" , "123 em Street");
			
				
			Map<String, String>StudentDetailsMap2 = new HashMap<String, String>();
			StudentDetailsMap2 .put("Name" , "Jane Smith");
			StudentDetailsMap2.put("Age" , "Twenty one");
			StudentDetailsMap2.put("Gender" , "FeMale");
			StudentDetailsMap2.put("Roll Number" , "SBA12346");
			StudentDetailsMap2.put("Grade" , "B+");
			StudentDetailsMap2.put("Major" , "Maths");
			StudentDetailsMap2.put("GPA" , "A3.8");
			StudentDetailsMap2.put("Email" , "Jane@exam.com");
			StudentDetailsMap2.put("PAN" , "REWA12344");
			StudentDetailsMap2.put("Adderess" , "456 OAKStreet");
			
			Map<String, String>StudentDetailsMap3 = new HashMap<String, String>();
			StudentDetailsMap3 .put("Name" , "Mike Brown");
			StudentDetailsMap3.put("Age" , "Twenty Two");
			StudentDetailsMap3.put("Gender" , "Male");
			StudentDetailsMap3.put("Roll Number" , "SBA12347");
			StudentDetailsMap3.put("Grade" , "A+");
			StudentDetailsMap3.put("Major" , "Physics");
			StudentDetailsMap3.put("GPA" , "A3.9");
			StudentDetailsMap3.put("Email" , "Mike@exam.com");
			StudentDetailsMap3.put("PAN" , "TYR12344");
			StudentDetailsMap3.put("Adderess" , "789 pine Street");	
			
		List<Map<String, String>>StudentDetails = new ArrayList<Map<String, String>>();
			
			StudentDetails.add(StudentDetailsMap1);
			StudentDetails.add(StudentDetailsMap2);
			StudentDetails.add(StudentDetailsMap3);
			
			System.out.println("Enter Student Details \n" +StudentDetails);
			
			
			
	//*********************	 Employee Details *****************************************
			
			Map<String, String>EmpDetailsMap1 = new HashMap<String, String>();
			EmpDetailsMap1.put("Emp ID" , "2001");
			EmpDetailsMap1.put("Name" , "Alice Green");
			EmpDetailsMap1.put("Age" , "Thirty");
			EmpDetailsMap1.put("Gender" , "Female");
			EmpDetailsMap1.put("Deparment" , "Eng");
			EmpDetailsMap1.put("Position" , "Software Eng");
			EmpDetailsMap1.put("Sal" , "75k pounds");
			EmpDetailsMap1.put("Email" , "Alice@exam.com");
			EmpDetailsMap1.put("PAN" , "SDF630965");
			
			
				
			Map<String, String>EmpDetailsMap2 = new HashMap<String, String>();
			EmpDetailsMap2.put("Emp ID" , "2002");
			EmpDetailsMap2.put("Name" , "Bob johnson");
			EmpDetailsMap2.put("Age" , "Thirty Five");
			EmpDetailsMap2.put("Gender" , "Male");
			EmpDetailsMap2.put("Deparment" , "Marketing");
			EmpDetailsMap2.put("Position" , "Marketing Manager");
			EmpDetailsMap2.put("Sal" , "85k pounds");
			EmpDetailsMap2.put("Email" , "bob@exam.com");
			EmpDetailsMap2.put("PAN" , "Rew6543096");
			
			Map<String, String>EmpDetailsMap3 = new HashMap<String, String>();
			EmpDetailsMap3.put("Emp ID" , "2003");
			EmpDetailsMap3.put("Name" , "Chrol White");
			EmpDetailsMap3.put("Age" , "Twenty Eight");
			EmpDetailsMap3.put("Gender" , "FeMale");
			EmpDetailsMap3.put("Deparment" , "Sales");
			EmpDetailsMap3.put("Position" , "Sales Excutive");
			EmpDetailsMap3.put("Sal" , "65k pounds");
			EmpDetailsMap3.put("Email" , "carol@exam.com");
			EmpDetailsMap3.put("PAN" , "TYR6543096");
			
			
		List<Map<String, String>>EmpDetails= new ArrayList<Map<String, String>>();
			
		EmpDetails.add(EmpDetailsMap1);
		EmpDetails.add(EmpDetailsMap2);
		EmpDetails.add(EmpDetailsMap3);
			
		System.out.println("Enter Employee Details \n "  +EmpDetails);
			
	//*********************	 Product Details *****************************************
		
	Map<String, String> ProdDetails1= new HashMap<String, String>();

	ProdDetails1.put("Prod ID" , "P001");
	ProdDetails1.put("Name" , "Laptop");
	ProdDetails1.put("Category" , "Electronics");
	ProdDetails1.put("Price" , "12k Pounds");
	ProdDetails1.put("Stock Quantity" , "Not Avilable");
	ProdDetails1.put("Suplier" , "Tech Supplies");
	ProdDetails1.put("Warrenty" , "2 Years");
	ProdDetails1.put("Rating" , "4.5 Stars");
	ProdDetails1.put("Manufa date" , "Aug 2023");
	ProdDetails1.put("Expiry Date" , "Aug 2028");		
			

	Map<String, String> ProdDetails2= new HashMap<String, String>();

	ProdDetails2.put("Prod ID" , "P002");
	ProdDetails2.put("Name" , "Desk Chair");
	ProdDetails2.put("Category" , "Furniture");
	ProdDetails2.put("Price" , "150k Pounds");
	ProdDetails2.put("Stock Quantity" , "Two");
	ProdDetails2.put("Suplier" , "Office Depot");
	ProdDetails2.put("Warrenty" , "1 Years");
	ProdDetails2.put("Rating" , "4 Stars");
	ProdDetails2.put("Manufa date" , "Sep 2024");
	ProdDetails2.put("Expiry Date" , "N/A");		
			

	Map<String, String> ProdDetails3= new HashMap<String, String>();

	ProdDetails3.put("Prod ID" , "P003");
	ProdDetails3.put("Name" , "Coffee Maker");
	ProdDetails3.put("Category" , "Kitchen");
	ProdDetails3.put("Price" , "75k Pounds");
	ProdDetails3.put("Stock Quantity" , "Two Hundered");
	ProdDetails3.put("Suplier" , "Kitchen world");
	ProdDetails3.put("Warrenty" , "6 months");
	ProdDetails3.put("Rating" , "4.2 Stars");
	ProdDetails3.put("Manufa date" , "Jan 2025");
	ProdDetails3.put("Expiry Date" , "Jan 2027");	

	List<Map<String, String>> ProdDetails = new ArrayList<Map<String, String>>();

	ProdDetails.add(ProdDetails1);
	ProdDetails.add(ProdDetails2);
	ProdDetails.add(ProdDetails3);				
			
	System.out.println("Enter Product Details \n "  + ProdDetails);		


	Map<String,List<Map<String, String>>> Details = new HashMap<String,List<Map<String, String>>>();

	Details.put("StudentData", StudentDetails);
	Details.put("EmplyoeeData", EmpDetails);
	Details.put("Product Data", ProdDetails);		
			
	System.out.println ("Enter All Datas \n " + Details );	



	//System.out.println (Details.get(ProdDetails));	
	//ProdDetails.get(1)	;	
	//System.out.println(ProdDetails + " " + ProdDetails));
	//System.out.println(Details.get(ProdDetails[2][2]));

	System.out.println("Displaying Supplier Name of 2nd row Product: "+Details.get("Product Data").get(1).get("Supplier"));
		}

	}