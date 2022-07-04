package com.ty.studentappboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("hi")
	public String hiMessage()
	{
		return "Welcome to Spring Boot";
	}
	
	@GetMapping("student")
	public Student getStudent() {
		
		Student student =new Student();
		student.id=1;
		student.email="madhu@mail.com";
		student.name="madhu";
	    return student;
}
	@PostMapping("save")
	public String recieve(@RequestBody Student student) {
		System.out.println(student);
		
		return "recieved";
	}
	@GetMapping("studentr")
	public String getStudent(@RequestParam int id) {
		return "recieved id is "+id;
	}
	
	@GetMapping("student/{studentId}/class/{classId}")
	public String getStudentByClass(@PathVariable("classId")int cid,@PathVariable("studentId") int sid) {
		return "hi its stu id is"+sid+"and class Id "+cid;
	}
}
