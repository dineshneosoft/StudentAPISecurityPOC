package com.dinesh.modal;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_master")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	private String firstName;
	private String lastName;
	private String mobNumber;
	private String email;
	@OneToMany(targetEntity=Project.class, cascade = CascadeType.ALL) 
	@JoinColumn(name = "cp_fk", referencedColumnName =  "studentId")
	private List<Project> project;

	public List<Project> getProject() {
		return project;
	}
	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMobNumber() {
		return mobNumber;
	}
	public void setMobNumber(String mobNumber) {
		this.mobNumber = mobNumber;
	}
	public String getEmail() {
		return email;
	}

	
	
	
	

}
