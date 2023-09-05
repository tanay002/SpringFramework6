package com.practice.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

	// Field Injection
	//As soon as we put autowired on a field.
	// It  would automatically do field injection.
	
//	@Autowired
	StudentParentDao studentParentDao;

//	@Autowired
	StudentPersonalDetailDao studentPersonalDetailDao;
	
	public StudentParentDao getStudentParentDao() {
		return studentParentDao;
	}

    //Autowired is not mandatory for constructor injection
	@Autowired
	public StudentService(StudentParentDao studentParentDao, StudentPersonalDetailDao studentPersonalDetailDao) {
		super();
		System.out.println("Constructor Injections for fields");
		this.studentParentDao = studentParentDao;
		this.studentPersonalDetailDao = studentPersonalDetailDao;
	}
	
	// Setter Injections
  // @Autowired
	public void setStudentParentDao(StudentParentDao studentParentDao) {
		System.out.println("Setter Injection for Field 1");
	   this.studentParentDao = studentParentDao;
	}
   
 //  @Autowired
	public void setStudentPersonalDetailDao(StudentPersonalDetailDao studentPersonalDetailDao) {
		System.out.println("Setter Injection for Field 2");
		this.studentPersonalDetailDao = studentPersonalDetailDao;
	}

	public StudentPersonalDetailDao getStudentPersonalDetailDao() {
		return studentPersonalDetailDao;
	}

	@Override
	public String toString()
	{
		return "Using "+studentParentDao+" and "+studentParentDao;
	}
	
	// Hierarchy constructor then setter 
}
