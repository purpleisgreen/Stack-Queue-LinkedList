
public class MyStack {
	//First in last out -> paperwork on a table 
	public StudentInfo Front; //top
	public int numberOfStudents; //num
	
	public MyStack() {
		Front = null;
		numberOfStudents = 0;
	}
	
	public void push(StudentInfo toAdd) {
		//add a student to the top of the stack
		if (numberOfStudents == 0) {
			Front = toAdd;
			toAdd.next = null;
			numberOfStudents++;
			return;
		}
		else {
			toAdd.next = Front;
			Front = toAdd;
			numberOfStudents++;
		}
	}
	
	public StudentInfo pop() {
		//remove the top student from the stack and returns the reference 
		if (numberOfStudents == 0) {
			return null;
		}
		else {  
			StudentInfo tempStudent = Front;
			Front = Front.next;
			numberOfStudents--;
			if(numberOfStudents == 0) {
				Front = null;
			}
			return(tempStudent);
		}
	}
	
	public StudentInfo peek() {
		//returns the reference of the student at the top of the stack
		return(Front);
	}
	
	public void display() {
		//prints out the first names of the students in the stack, starting from the front 
		if (numberOfStudents == 0){
			return;
		}
		else {
		StudentInfo currentStudent = Front;
		System.out.print(currentStudent.firstName);
		System.out.println("");
		while(currentStudent.next != null) {
			System.out.print(currentStudent.next.firstName);
			System.out.println("");
			currentStudent = currentStudent.next;
		}
		}
	}
	
	
}
