package groupId.Springboot.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import groupId.Springboot.error.ResourceNotFoundException;
import groupId.Springboot.model.Student;
import groupId.Springboot.repository.StudentRepository;

@RestController
@RequestMapping("students")

public class StudentEndpoint {

	private final StudentRepository studentDao;

	@Autowired

	public StudentEndpoint(StudentRepository studentDao) {
		super();
		this.studentDao = studentDao;
	}

	@GetMapping
	public ResponseEntity<?> listAll() {

		return new ResponseEntity<>(studentDao.findAll(), HttpStatus.OK);

	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id) {
		verifyIfStudentExists(id);
		Student student = studentDao.findOne(id);
		return new ResponseEntity<>(student, HttpStatus.OK);

	}

	@PostMapping
	public ResponseEntity<?> save(@RequestBody Student student) {

		return new ResponseEntity<>(studentDao.save(student), HttpStatus.OK);

	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		verifyIfStudentExists(id);
		studentDao.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@PutMapping
	public ResponseEntity<?> update(@RequestBody Student student) {
		verifyIfStudentExists(student.getId());
		studentDao.save(student);
		return new ResponseEntity<>(HttpStatus.OK);

	}

	@GetMapping(path = "/findByName/{name}")
	public ResponseEntity<?> findStudentsByName(@PathVariable String name) {

		return new ResponseEntity<>(studentDao.findByNameIgnoreCaseContaining(name), HttpStatus.OK);

	}

	
	private void verifyIfStudentExists(Long id) {
		
		if (studentDao.findOne(id) == null)
			throw new ResourceNotFoundException("Student Not Found For ID: " + id);
		
	}
}
