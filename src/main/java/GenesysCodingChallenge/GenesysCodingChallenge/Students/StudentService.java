package GenesysCodingChallenge.GenesysCodingChallenge.Students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> findAllStudent(){
        return (List<Student>) studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

}
