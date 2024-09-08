
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Sayantan Karmakar", 54, 'O');
		StudentView studentview = new StudentView();
		StudentController studentcontroller = new StudentController(student, studentview);
		
		studentcontroller.updateStudentDetails();
		
		student.setName("Ankita Sinha Ray");
		student.setId(36);
		
		studentcontroller.updateStudentDetails();
	}

}
