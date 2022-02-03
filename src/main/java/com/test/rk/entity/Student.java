package com.test.rk.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String userName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "gaurd_name")
	private String gaurdianName;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER/*,mappedBy = "student"*/)
//	@JoinTable(name ="stu_cou_ref",foreignKey ="stud_id",inverseForeignKey = "course_id")
	private List<Course> course;
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH},fetch = FetchType.EAGER)
	@JoinColumn(name ="fk_cls")
	private Classes classes;
}
