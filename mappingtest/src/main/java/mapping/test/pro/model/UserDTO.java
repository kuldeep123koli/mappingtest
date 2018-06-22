package mapping.test.pro.model;

public class UserDTO {
	Marks marks;
	Student student;
	
	public UserDTO(){
		
	}
	public UserDTO(Marks marks , Student student){
		this.marks=marks;
		this.student=student;
	}
	public Marks getMarks() {
		return marks;
	}
	public void setMarks(Marks marks) {
		this.marks = marks;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
