package GenesysCodingChallenge.GenesysCodingChallenge.Courses;

import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;

    public List<Course> findAllCourses() {
        return courseRepository.findAll();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public Course getCourseById(Long id){
        return courseRepository.getOne(id);
    }
}
