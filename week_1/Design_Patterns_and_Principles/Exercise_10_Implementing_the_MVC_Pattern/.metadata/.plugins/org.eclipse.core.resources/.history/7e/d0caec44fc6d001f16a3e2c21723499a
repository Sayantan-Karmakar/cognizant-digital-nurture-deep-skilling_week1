
public class StudentController {
	
	private Student student;
	private StudentView studentview;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public StudentView getStudentview() {
		return studentview;
	}
	public void setStudentview(StudentView studentview) {
		this.studentview = studentview;
	}
	
	public StudentController(Student student, StudentView studentview) {
		setStudent(student);
		setStudentview(studentview);
	}
	
	public String getName() {
		return student.getName();
	}
	public void setName(String name) {
		student.setName(name);
	}
	
	public int getId() {
		return student.getId();
	}
	public void setId(int id) {
		student.setId(id);
	}
	
	public char getGrade() {
		return student.getGrade();
	}
	public void setGrade(char grade) {
		student.setGrade(grade);
	}
	
	public void updateStudentDetails() {
		studentview.displayStudentDetails(getName(), getId(), getGrade());
	}
}
