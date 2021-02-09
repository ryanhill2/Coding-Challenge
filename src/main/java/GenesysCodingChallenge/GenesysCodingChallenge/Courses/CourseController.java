package GenesysCodingChallenge.GenesysCodingChallenge.Courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService CourseService;

    @GetMapping
    public List<Course> findAllCourses() {
        return CourseService.findAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return CourseService.createCourse(course);
    }
}