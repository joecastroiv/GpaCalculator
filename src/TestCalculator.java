
public class TestCalculator {

	public static void main(String[] args) {
		
		gpaCalculator testData = new gpaCalculator();
		gpaCalculator testData1 = new gpaCalculator(); 
		gpaCalculator testData2 = new gpaCalculator();
		gpaCalculator testData3 = new gpaCalculator();
		gpaCalculator testData4 = new gpaCalculator();
		
		System.out.println("Beginning Tests.");
		
		testData.student.credits.add(4.0);
		testData.student.points.add(4.0);
			
		testData.calculateGpa(testData.student);
		if(testData.calculateGpa(testData.student) != 1.0) {
			System.out.println("Failed calculateGpa");
		}
		
		testData1.student.credits.add(4.0);
		testData1.student.points.add(8.0);
		
		testData.calculateGpa(testData.student);
		if(testData.calculateGpa(testData1.student) != 2.0) {
			System.out.println("Failed calculateGpa2");
		}
		
		testData2.student.credits.add(4.0);
		testData2.student.points.add(12.0);
		
		testData.calculateGpa(testData.student);
		if(testData.calculateGpa(testData2.student) != 3.0) {
			System.out.println("Failed calculateGpa3");
		}
		
		testData3.student.credits.add(4.0);
		testData3.student.points.add(16.0);
		
		testData.calculateGpa(testData.student);
		if(testData.calculateGpa(testData3.student) != 4.0) {
			System.out.println("Failed calculateGpa4");
		}
		
		testData4.student.credits.add(2.0);
		testData4.student.points.add(7.0);
		
		testData.calculateGpa(testData.student);
		if(testData.calculateGpa(testData4.student) != 3.5) {
			System.out.println("Failed calculateGpa5");
		}
		
			
		System.out.println("Tests complete");
		System.out.println();
		
		testData.startUserInput(); //can still run Student input after test completes
	}

}
