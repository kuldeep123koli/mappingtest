package mapping.test.pro.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="marks")
public class Marks {
	
	@Id
	String marksId;
	
	String math;
	String eng;
	String sci;
	
	/*@ManyToMany(mappedBy="marks")
	List<Student> students;*/
	
	public Marks(){
		
	}
	
	
	

	public String getMath() {
		return math;
	}




	public void setMath(String math) {
		this.math = math;
	}




	public String getEng() {
		return eng;
	}




	public void setEng(String eng) {
		this.eng = eng;
	}




	public String getSci() {
		return sci;
	}




	public void setSci(String sci) {
		this.sci = sci;
	}




	public String getMarksId() {
		return marksId;
	}

	public void setMarksId(String marksId) {
		this.marksId = marksId;
	}
/*
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}*/
	
	
	
	
}
