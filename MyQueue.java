
public class MyQueue {
	//First in first out -> a normal line 
	public StudentInfo Front; //front
	public int numberOfStudents; //num
	
	public MyQueue() {
		Front = null;
		numberOfStudents = 0;
	}
	
	public void enqueue(StudentInfo toAdd) {
		//adds toAdd to the back of the queue
		if(numberOfStudents == 0) {
			Front = toAdd;
			numberOfStudents++;
			toAdd.next = null;
		}
		else {
			StudentInfo currentStudent = Front;
			toAdd.next = null;
			while(currentStudent.next != null) {
				currentStudent = currentStudent.next;
			}
			currentStudent.next = toAdd;
			numberOfStudents ++;
		}
	}
	
	public StudentInfo dequeue() {
		  //removes the student at the front of the queue
		if(numberOfStudents == 0) {
			return null;
		}
		else {
			StudentInfo currentStudent = Front;
			Front = Front.next;
			numberOfStudents--;
			if (numberOfStudents == 0) {
				Front = null;
			}
			return(currentStudent);
		}
	}
	
	public StudentInfo peek() {
		//return the reference for the student in the front 
		return(Front);
	}
	
	public void display() {
		if(numberOfStudents == 0) {
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
