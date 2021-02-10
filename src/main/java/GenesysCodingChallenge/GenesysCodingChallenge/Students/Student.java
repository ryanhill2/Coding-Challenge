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
    private Long id;

    private String firstName;
    private String surName;
    private Long studentId;
    private String studentEmail;
    private Date startDate;
    private Date endDate;
    private Date dob;
    private String phone;
    private String address;

//    @ManyToMany(mappedBy = "Student")
//    public static List<GenesysCodingChallenge.GenesysCodingChallenge.Courses.Course> Course;

    Student(){
    }

    public Student(Long id, String firstName, String surName, Long studentId, String studentEmail, Date startDate, Date endDate, Date dob, String phone, String address) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
        this.studentId = studentId;
        this.studentEmail = studentEmail;
        this.startDate = startDate;
        this.endDate = endDate;
        this.dob = dob;
        this.phone = phone;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

