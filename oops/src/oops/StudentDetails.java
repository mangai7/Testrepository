package oops;

public class StudentDetails extends Student {
	void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
    }

	public static void main(String[] args) {
	     StudentDetails student = new StudentDetails();
	    
	     student.display();
	     
	}
 
}
