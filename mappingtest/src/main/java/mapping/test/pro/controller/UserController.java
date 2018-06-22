package mapping.test.pro.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mapping.test.pro.model.User;
import mapping.test.pro.repository.UserRepository;

@RestController
@RequestMapping(value="user")
public class UserController {
	
	@Autowired UserRepository userRepository;
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@RequestBody User user){
		userRepository.save(user);
		return "user saved";
	}
	
	@RequestMapping(value="/sum" ,method=RequestMethod.GET)
	public String sum(@RequestParam("num1") String num1,@RequestParam("num2") String num2 ){
		int a = Integer.valueOf(num1);
		int b = Integer.valueOf(num2);
		
		return a+b+"";
	}
	
	@GetMapping(value="/sum/{num1}/{num2}")
	public String sum(@PathVariable int num1 , @PathVariable int num2){
		return num1+num2+"";
	}
	
	@RequestMapping(value = "/add" , method=RequestMethod.POST)
	public String add(@RequestBody Map<String,Integer> parameters){
		int a = parameters.get("num1");
		int b = parameters.get("num2");
		return a+b+"";
	}

}
