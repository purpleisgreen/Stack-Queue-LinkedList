
public class MyLL {
	
	// The list manager class!
	
	public StudentInfo front;
	public int num;
	
	public MyLL() {
		front = null;
		num = 0;
	}
	
	
	public void addToFront(StudentInfo studentToAdd) {
		
		if (num == 0) {
			front = studentToAdd;
			front.next = null; // just to be safe!
			num++;
			return;
		}
		
		if (num > 0) {
			studentToAdd.next = front;
			front = studentToAdd;
			num++;
			return;
		}
	
		
	}
	
	
	public void displayList() {
		
		// Start at the front and walk to the rear, printing out each first name.
		
		if (num == 0) {
			System.out.println("\n\nThe list is empty!!!");
			return;
		}
		
		if (num > 0) {
			System.out.println("\n\nHere is the list from front to rear!");
			StudentInfo currentStudent = front;
			while (currentStudent != null) {
				System.out.println(currentStudent.firstName);
				currentStudent = currentStudent.next;
			}
			return;
		}
		
		
		
	}
	

}
