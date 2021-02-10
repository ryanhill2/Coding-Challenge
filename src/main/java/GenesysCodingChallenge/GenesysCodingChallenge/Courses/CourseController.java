package GenesysCodingChallenge.GenesysCodingChallenge.Courses;

import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> findAllCourses() {
        return courseService.findAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    @PutMapping("/{course_id}/student/{student_id}")
    public String assignStudentToCourse(
            @PathVariable("course_id") Long course_id,
            @PathVariable("student_id") Long student_id)
    {
        return courseService.assignStudentToCourse(course_id, student_id);
    }

    @PutMapping("/{course_id}/professor/{professor_id}")
    public String assignProfessorsToCourse(
            @PathVariable("course_id") Long course_id,
            @PathVariable("professor_id") Long professor_id)
    {
        return courseService.assignProfessorsToCourse(course_id, professor_id);
    }

}