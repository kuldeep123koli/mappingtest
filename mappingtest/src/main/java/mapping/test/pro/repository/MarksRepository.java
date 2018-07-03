package mapping.test.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mapping.test.pro.model.Marks;
import mapping.test.pro.model.Student;

@Repository
public interface MarksRepository extends JpaRepository<Marks,String>{
	
	//public List<Marks> getAllByStudents(Student student);
	public Marks getByMarksId(String id);

}
