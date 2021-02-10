package GenesysCodingChallenge.GenesysCodingChallenge.Courses;

import GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor;
import GenesysCodingChallenge.GenesysCodingChallenge.Students.Student;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName = null;
    private String courseCode = null;
    private String description = null;
    private Long credits = null;
    private String semester = null;
    @OneToOne
    @JoinColumn
    public Professor professor = null;

    @ManyToMany
    @JoinColumn
    public List<Student> students = null;

    Course(){
    }

    public Course(Long id, String  courseName, String courseCode, String description, Long credits, String semester, Professor professor){
        this.id = id;
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.description = description;
        this.credits = credits;
        this.semester = semester;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCredits() {
        return credits;
    }

    public void setCredits(Long credits) {
        this.credits = credits;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
