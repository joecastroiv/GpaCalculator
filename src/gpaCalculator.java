
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class gpaCalculator {
		
	studentInfo student = new studentInfo();
	
    //Constructor (key, value) to associate grade(key) to what is worth in points(value) 	
	 public final Map<String, Double> gradeConvert = new HashMap<>();
	 public gpaCalculator() {
	     gradeConvert.put("A", 4.00);
	     gradeConvert.put("A-", 3.67);
	     gradeConvert.put("B+", 3.33);
	     gradeConvert.put("B", 3.00);
	     gradeConvert.put("B-", 2.67);
	     gradeConvert.put("C+", 2.33);
	     gradeConvert.put("C", 2.00);
	     gradeConvert.put("C-", 1.67);
	     gradeConvert.put("D+", 1.33);
	     gradeConvert.put("D", 1.00);
	     gradeConvert.put("F", 0.0);
	    }
	    
	 //Start calculator
	 public void startUserInput() {
		 
		 System.out.println("Let's Begin Your GPA Calculation!");
		 	
			 Scanner scnr = new Scanner(System.in); {			
		     userInfo(student, scnr);
		 
		     creditsAndPoints(student, scnr, 1);   //class #1
		     creditsAndPoints(student, scnr, 2);   //class #2
		     creditsAndPoints(student, scnr, 3);   //class #3
		
		 double studentGpa = calculateGpa(student);  //take the final calculated gpa and move it to store in 'studentGpa'
		 System.out.printf(student.firstName + " " + student.lastName +" your Gpa is: %.2f\n", +studentGpa);   //print gpa output to 2 decimal places
		 
	     }
	 }
	    
	 public void userInfo (studentInfo student, Scanner scnr) {
		 
		 System.out.println("Enter your first name: ");
		 student.firstName = scnr.nextLine();  //hold students first name
		 System.out.println("Enter your last name: ");
		 student.lastName = scnr.nextLine();  //hold students last name
		 
		 
	 }
	 
	 public void creditsAndPoints (studentInfo student, Scanner scnr, int classNumber) {
		 
		 
		 System.out.println("Enter the # of credits of class " + classNumber + "(1-5): ");
		 double credit = scnr.nextDouble();
		 student.credits.add(credit);  //add each entered class credits into array to hold for final calculation
		 
		 System.out.println("Enter your grade for class " + classNumber + "(A,A-,B+,B,B-...etc): ");
		 String grade = scnr.next();  //hold grade for each class
		 
	     double gradeValue = 0;  //initial holding value of 0 stored to gradeValue
		 
		if(gradeConvert.containsKey(grade)) {
			 gradeValue = gradeConvert.get(grade);  //convert grade(key) to points(value)
		 } 
		else {
			 System.out.println("Invalid Grade Entered");  //if user input is not a valid grade let user know it is invalid
		 }
		 
		 double classTotalPoints = gradeValue * credit;  //add all class points together by multiplying the grade point value and credits of each class
		 student.points.add(classTotalPoints); //hold answer in classTotalPoints
		 
	 }
	 //calculate students GPA
	 public double calculateGpa(studentInfo student) {
		 
		 double totalCredits = getTotal(student.credits);
		 double totalPoints = getTotal(student.points);
		 double studentGpa = totalPoints / totalCredits;
		 
		 return studentGpa;  //hold GPA 
		 
	 }
	 //array for the points and credits to be totaled by the calculation step
	 public double getTotal(ArrayList<Double> doubles) {
		 
		 double total = 0;
		 for(Double d:doubles) {
			 total += d;
		 }
		 return total;
	 }
	 
	        
	
    }



