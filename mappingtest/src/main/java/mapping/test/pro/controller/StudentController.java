package mapping.test.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import mapping.test.pro.SendEmail;
import mapping.test.pro.model.Marks;
import mapping.test.pro.model.Student;
import mapping.test.pro.model.UserDTO;
//import mapping.test.pro.repository.MarksRepository;
import mapping.test.pro.repository.StudentRepository;

@RestController
@RequestMapping(value="/student")
public class StudentController{
	
	@Autowired SendEmail sendEmail;
	@Autowired StudentRepository studentRepository;
	//@Autowired MarksRepository marksRepository; 
	
	
	/*
	 * save user with marks 
  {
	"id":"1",
	"name":"kuldeep",
	"roll":"004",
	"marks":[{
		"marksId":"ONE",
		"math":"90",
		"eng":"98",
		"sci":"90"
		
	}]
 }
	 * 
	 * */
	@RequestMapping(value="/save" , method=RequestMethod.POST)
	public String save(@RequestBody Student student){
		
		studentRepository.save(student);
		return "saved";
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Student> getAll(){
		System.out.println("getAll");
		List<String> list = new ArrayList<String>();
		List<String> cc = new ArrayList<String>();
		List<String> bcc = new ArrayList<String>();
		cc.add("nupoxiwil@vpslists.com");
		list.add("kuldeep123koli@gmail.com");
		bcc.add("kuldeepk0041017214@gmail.com");
		sendEmail.send(list, "kuldeep.kumar@oodlestechnologies.com", "sendgrid email", "sending email using send grid", cc, bcc, null);
		return studentRepository.findAll();
	}
	
	@RequestMapping(value="/marksId",method=RequestMethod.POST)
	public List<Student> getByMarks(@RequestBody Marks marks){
		return studentRepository.findAllByMarks(marks);
	}
	
	@RequestMapping(value="/byStudent",method=RequestMethod.POST)
	public List<Marks> getMarksByStudent(@RequestBody Student student){
		
		//return marksRepository.getAllByStudents(student);
		return null;
		
	}
	
	@RequestMapping(value="/getDTO" , method = RequestMethod.POST)
	public void getDTO(@RequestBody UserDTO user){
		System.out.println("userDTO : "+user);
		Student student = user.getStudent();
		Marks marks = user.getMarks();
		ObjectMapper om = new ObjectMapper();
		try {
			System.out.println("student values : "+om.writeValueAsString(student));
			System.out.println("marks values : "+om.writeValueAsString(marks));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}