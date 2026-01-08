
public class MyLL {
	
	public StudentInfo front;
	public StudentInfo rear;
	public int num;
	
	public MyLL() {
		front = null;
		rear = null;
		num = 0;
	}
	
	public void addToFront(StudentInfo studentToAdd) {
		if (num == 0) {
			front = studentToAdd;
			rear = studentToAdd;	
			studentToAdd.next = null;
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

	//Add to back in O(1) with rear pointer
	public void addToRear(StudentInfo studentToAdd){
		if (num == 0) {
			front = studentToAdd;
			rear = studentToAdd;
			studentToAdd.next = null;
			num++;
			return;
		}
		if (num > 0){
			rear.next = studentToAdd;
			rear = studentToAdd;
			rear.next = null;
			num++;
		}
	}

	//Remove from a certain index, returns removed object, or null if invalid
	public StudentInfo removeAtIndex(int index){
		if (index < 0 || index >= num){
			return null;
		}
		if (index == 0){
			//Remove from front
			StudentInfo removed = front;
			front = front.next;
			if (front == null){
				rear = null; //now an empty list
			}
			num--;
			return removed;
		}
		StudentInfo current = front;
		for (int i = 0; i < index -1; i++){
			current = current.next;
		}
		StudentInfo removed = current.next;
		current.next = removed.next;

		if (index == num-1){
			rear = current; //update rear if the old rear was removed
		}
		num--;
		return removed;
	}

	//Add at a certain index
	public void addAtIndex(int index, StudentInfo studentToAdd){
		if (index < 0 || index > num){
			return; //invalid index 
		}
		if (index == 0){
			addToFront(studentToAdd);
			return;
		}
		if (index == num){
			addToRear(studentToAdd);
			return;
		}
		StudentInfo current = front;
		for (int i = 0; i < index - 1; i++){
			current = current.next;
		}
		studentToAdd.next = current.next;
		current.next = studentToAdd;
		num++;
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

