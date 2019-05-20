package groupId.Springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import groupId.Springboot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	
	List<Student> findByNameIgnoreCaseContaining(String name);

}