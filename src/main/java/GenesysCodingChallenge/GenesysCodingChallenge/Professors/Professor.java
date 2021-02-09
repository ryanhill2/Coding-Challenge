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

    private String FirstName;
    private String SurName;
    private Long ProfessorsId;
    private String ProfessorsEmail;
    private Date StartDate;
    private String Title;
    private Date DOB;
    private String Phone;
    private String Department;

    @OneToOne(mappedBy = "Professor")
    public static Optional<GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course> Course;

    Professor(){
    }

    public Professor(Long Id, String FirstName, String SurName, Long ProfessorsId, String ProfessorsEmail, Date StartDate, String Title, Date DOB, String Phone, String Department) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.ProfessorsId = ProfessorsId;
        this.ProfessorsEmail = ProfessorsEmail;
        this.StartDate = StartDate;
        this.Title = Title;
        this.DOB = DOB;
        this.Phone = Phone;
        this.Department = Department;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public Long getProfessorsId() {
        return ProfessorsId;
    }

    public void setProfessorsId(Long professorsId) {
        ProfessorsId = professorsId;
    }

    public String getProfessorsEmail() {
        return ProfessorsEmail;
    }

    public void setProfessorsEmail(String professorsEmail) {
        ProfessorsEmail = professorsEmail;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

}
