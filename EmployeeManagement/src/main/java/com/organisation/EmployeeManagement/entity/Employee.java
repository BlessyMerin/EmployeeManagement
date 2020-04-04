package com.organisation.EmployeeManagement.entity;



import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="employee_management")
public class Employee{

	@Id
	@Column(name="employee_id")
	private int id;
	
	@NotEmpty(message="*First Name to be filled")
	@Column(name="firstName")
	private String firstName;
	
	@NotEmpty(message="*Last Name to be filled")
	@Column(name="lastName")
	private String lastName;
	
	@Email(regexp="^([a-zA-Z0-9\\_\\-\\.]+)@([a-zA-Z0-9\\_\\-\\.]+)\\.([a-zA-Z]{2,5})",   message="*Invalid Email!!")
	@Column(name="mail_id")
	private String email;
	
	@NotEmpty(message="*Contact Number cannot be null")
	@Pattern(regexp="(^$|[0-9]{10})",message = "Enter 10 digit mobile number")
	@Column(name="contact_number")
	private String contact;
	
	@NotEmpty(message="*Mandatory column to be filled")
	@Column(name="gender")
	private String gender;
	
	@Min(value = 18,message = "**minimum age of an employee should be 18")
	@NotEmpty(message="*Mandatory column to be filled")
	@Column(name="age")
	private String age;
	
	@NotEmpty(message="*Mandatory column to be filled")
    @Column(name="job_location")
	private String jobLocation;
	
	@NotEmpty(message="*Mandatory column to be filled")
    @Column(name="Business_Unit")
    private String bu;
	
	
    @Column(name="project_id")
    private int prjId;
	
	@NotEmpty(message="*Mandatory column to be filled")
    @Column(name="Job_title")
    private String jobTitle;
	
	 @Column(name="DateOfJoining")
    private Date doj;
    
  
    @Column(name="Salary")
    private double salary;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getJobLocation() {
		return jobLocation;
	}
	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getPrjId() {
		return prjId;
	}
	public void setPrjId(int prjId) {
		this.prjId = prjId;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int id, String firstName, String lastName, String email, String contact, String gender, String age,
			String jobLocation, String bu, int prjId, String jobTitle, Date doj, double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contact = contact;
		this.gender = gender;
		this.age = age;
		this.jobLocation = jobLocation;
		this.bu = bu;
		this.prjId = prjId;
		this.jobTitle = jobTitle;
		this.doj = doj;
		this.salary = salary;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", contact=" + contact + ", gender=" + gender + ", age=" + age + ", jobLocation=" + jobLocation
				+ ", bu=" + bu + ", prjId=" + prjId + ", jobTitle=" + jobTitle + ", doj=" + doj + ", salary=" + salary
				+ "]";
	}
	
	
}
