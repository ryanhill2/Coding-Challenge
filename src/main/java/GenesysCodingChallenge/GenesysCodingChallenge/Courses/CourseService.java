package GenesysCodingChallenge.GenesysCodingChallenge.Courses;

import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import GenesysCodingChallenge.GenesysCodingChallenge.Professors.ProfessorRepository;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.StudentRepository;
import com.sun.xml.bind.v2.schemagen.xmlschema.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    ProfessorRepository professorRepository;

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id){
        return courseRepository.getOne(id);
    }

    public String assignStudentToCourse(Long c_id, Long student_id){
        Course course = courseRepository.findById(c_id).get();
        Student student = studentRepository.findById(student_id).get();
        course.students.add(student);
        courseRepository.save(course);

        return "Student added";
    }

    public String assignProfessorsToCourse(Long c_id, Long p_id) {

        Course course = courseRepository.findById(c_id).get();
        Professor professor = professorRepository.findById(p_id).get();
        course.professor = professor;
        courseRepository.save(course);

        return "Professor added";
    }

}
