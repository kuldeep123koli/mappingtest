package mapping.test.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mapping.test.pro.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
