package mapping.test.pro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mapping.test.pro.model.Marks;
import mapping.test.pro.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,String>{
		public List<Student> findAllByMarks(Marks marks);
}
