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
    private Long Id;

    private String CourseName = null;
    private String CourseCode = null;
    private String Description = null;
    private Long Credits = null;
    private String Semester = null;

    @OneToOne
    public static Optional<GenesysCodingChallenge.GenesysCodingChallenge.Professors.Professor> Professor = null;

    @ManyToMany
    public static List<Student> Student = null;

    Course(){
    }

    public Course(Long Id, String  CourseName, String CourseCode, String Description, Long Credits, String Semester){
        this.Id = Id;
        this.CourseName = CourseName;
        this.CourseCode = CourseCode;
        this.Description = Description;
        this.Credits = Credits;
        this.Semester = Semester;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        this.CourseCode = courseCode;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Long getCredits() {
        return Credits;
    }

    public void setCredits(Long credits) {
        this.Credits = credits;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String semester) {
        this.Semester = semester;
    }

}
