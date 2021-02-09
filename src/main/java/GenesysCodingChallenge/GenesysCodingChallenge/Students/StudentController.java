package GenesysCodingChallenge.GenesysCodingChallenge.Students;

import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired StudentService studentService;

    @GetMapping
    public List<Student> findAllStudent(){
        return studentService.findAllStudent();
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
