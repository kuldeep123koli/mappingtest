package mapping.test.pro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import javax.persistence.JoinColumn;

@Entity
@Table(name="students")
public class Student {
	@Id
	String id;
	String name;
	String roll;
	
	

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "student_marks",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "mark_id", referencedColumnName = "marksId"))
    private List<Marks> marks;
	
	/*@ManyToMany
	@JoinColumn(name="marksId")
	List<Marks> marks;*/

	
	public void setMarks(List<Marks> marks){
		this.marks=marks;
	}
	
	public List<Marks> getMarks(){
		return marks;
	}
	
	public String getId() {

		return id;
	}
	public void setId(String id) {

		this.id = id;
	}
	public String getName() {

		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public String getRoll() {

		return roll;
	}
	public void setRoll(String roll) {

		this.roll = roll;
	}
	

}
