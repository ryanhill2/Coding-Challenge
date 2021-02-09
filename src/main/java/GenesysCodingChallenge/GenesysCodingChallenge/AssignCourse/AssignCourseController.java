package GenesysCodingChallenge.GenesysCodingChallenge.AssignCourse;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;
import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/assigncourse")
public class AssignCourseController {
    @Autowired
    private AssignCourseService assignCourseService;

    @PatchMapping(value = "/Professor/{p_id}/course/{c_id}")
    public String assignProfessorCourse(
            @PathVariable Long p_id,
            @PathVariable Long c_id){
        return assignCourseService.assignProfessorCourse(p_id, c_id);
    }

    @PatchMapping(value = "/student/{s_id}/course/{c_id}")
    public Optional<Course> assignStudentCourse(
            @PathVariable Long s_id,
            @PathVariable Long c_id){

            return assignCourseService.assignStudentCourse(s_id, c_id);
    }
}
