package Assignments;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4_ArrayandCollections {
	
	public static void main(String[] args) {
		
//Top 5 cities using list
	

	List<String> cities = new ArrayList<String>();
			
	 cities.add("Coimbatore");
	 cities.add("Chennai");
	 cities.add("Banglore");
	 cities.add("Hydrabad");
	 cities.add("mumbai");
	 
       System.out.println("Print 3rd and 4thCountry: " + cities.get(3) + "  "+ cities.get(4));
	 
	 
//Top 10 most visited tourist	 
       
       
	Set<String> TouristPlaces = new HashSet<String>();
	
       
       
	TouristPlaces.add("OOty");
	TouristPlaces.add("Eiffel Tower");
	TouristPlaces.add("Maldives");
	TouristPlaces.add("Dubai");
	TouristPlaces.add("Bangkok");
	TouristPlaces.add("Petra");
	TouristPlaces.add("Angkor Wat");
	TouristPlaces.add("Great Wall of China");
	TouristPlaces.add("Victoria Falls");
	TouristPlaces.add("Dead Sea");
	
	System.out.println("Most Visted places: " + TouristPlaces.size()  + TouristPlaces );

// Create an array of 10 random integers and print out the Average of 5th and 6th value
	
	 int[] numbers = {100, 200, 300, 400,500,600,700,800,900,1000};
	 
	
	 int sum = numbers[4] + numbers[5];
	 double  avg = sum / 2;
	 
    System.out.println("The sum is: " + sum);
	System.out.println("The average is: " + avg);
	 
//Top 5 Highest grossing movies	and print 3rd movie
	List<String> Movies = new LinkedList<String>();

	Movies.add("Dangal: (2016) - 2024.6 Cr");
	Movies.add("Baahubali 2: The Conclusion: (2017) - 1742.3 Cr");
	Movies.add("RRR: (2022) - 1250.9 Cr");
	Movies.add("K.G.F: Chapter 2: (2022) - 1176.5 Cr");
	Movies.add("Jawan: (2023) - 1142.6 Cr");
	
	System.out.println("3rd movie on the list is" + Movies.get(2));
	
}
	

}