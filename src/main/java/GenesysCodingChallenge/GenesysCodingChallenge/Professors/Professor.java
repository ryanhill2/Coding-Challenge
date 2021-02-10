package GenesysCodingChallenge.GenesysCodingChallenge.Professors;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
public class Professor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String firstName;
    private String surName;
    private Long professorsId;
    private String professorsEmail;
    private Date startDate;
    private String title;
    private Date dob;
    private String phone;
    private String department;

//    @OneToOne(mappedBy = "Professors")
//    public static Optional<GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course> Course;

    Professor(){
    }

    public Professor(Long id, String firstName, String surName, Long professorsId, String professorsEmail, Date startDate, String title, Date dob, String phone, String department) {
        this.Id = Id;
        this.firstName = firstName;
        this.surName = surName;
        this.professorsId = professorsId;
        this.professorsEmail = professorsEmail;
        this.startDate = startDate;
        this.title = title;
        this.dob = dob;
        this.phone = phone;
        this.department = department;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Long getProfessorsId() {
        return professorsId;
    }

    public void setProfessorsId(Long professorsId) {
        this.professorsId = professorsId;
    }

    public String getProfessorsEmail() {
        return professorsEmail;
    }

    public void setProfessorsEmail(String professorsEmail) {
        this.professorsEmail = professorsEmail;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
