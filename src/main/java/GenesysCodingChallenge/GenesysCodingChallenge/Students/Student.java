package GenesysCodingChallenge.GenesysCodingChallenge.Students;

import GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String FirstName;
    private String SurName;
    private Long StudentId;
    private String StudentEmail;
    private Date StartDate;
    private Date EndDate;
    private Date DOB;
    private String Phone;
    private String Address;

    @ManyToMany(mappedBy = "Student")
    public static List<GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course> Course;

    Student(){
    }

    public Student(Long Id, String FirstName, String SurName, Long StudentId, String StudentEmail, Date StartDate, Date EndDate, Date DOB, String Phone, String Address) {
        this.Id = Id;
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.StudentId = StudentId;
        this.StudentEmail = StudentEmail;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.DOB = DOB;
        this.Phone = Phone;
        this.Address = Address;
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

    public Long getStudentId() {
        return StudentId;
    }

    public void setStudentId(Long studentId) {
        StudentId = studentId;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}

