package GenesysCodingChallenge.GenesysCodingChallenge.AssignCourse;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;
import GenesysCodingChallenge.GenesysCodingChallenge.Courses.CourseRepository;
import GenesysCodingChallenge.GenesysCodingChallenge.Courses.CourseService;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.StudentRepository;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssignCourseService {
    @Autowired
    private StudentService studentService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private CourseRepository courseRepository;

    public Optional<Course> assignStudentCourse(Long s_id, Long c_id){

//        Student student = studentService.getStudentById(s_id);
//        Course course = courseService.getCourseById(c_id);

        Optional<Student> student = studentRepository.findById(s_id);

        Optional<Course> course = courseRepository.findById(c_id);


//        Course.Student.add(student);
//        Student.Course.add(course);

        return course;
//        return "Student added to Course";
    }
}
