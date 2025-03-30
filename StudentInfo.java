
public class StudentInfo {
	
	
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height;  // in cm
	public double weight;  // in kg
	
	
	public StudentInfo(int studentNumber, String fN, String lastName, double height, double weight) {
		this.studentNumber = studentNumber;
		firstName = fN;
		this.lastName = lastName;
		this.height = height;
		this.weight = weight;
	}
	
	public StudentInfo() {
		studentNumber = -1;
		firstName = "some first name";
		lastName = "some last name";
		height = 0.0;
		weight = 0.0;				
	}
	
	
	public double calcBMI() {
		double bmi = weight / ((height / 100) * (height / 100));
		return bmi;
	}
	
	
}