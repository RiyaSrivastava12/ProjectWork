package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserService;

@RestController
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@PostMapping("/addUser")
	public ResponseEntity<User> addUser(@RequestBody User c)
	{
		User c1=userservice.addUser(c);
		ResponseEntity re=new ResponseEntity<User>(c1,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("/getUsers")
	public ResponseEntity<List<User>> getUsers()
	{
		List<User> lc1=userservice.getUsers();
		ResponseEntity re=new ResponseEntity<List<User>>(lc1,HttpStatus.OK);
		return re;
	}
	
	@GetMapping(path="/getUser/{cid}")
	public ResponseEntity<User> getEmpById(@PathVariable int cid) throws Throwable
	{
		User c1=userservice.getUserById(cid);
		
		ResponseEntity re=new ResponseEntity<User>(c1,HttpStatus.OK);
		return re;
	}
	
	@PostMapping(path="/addUsers")
	public ResponseEntity<List<User>> addUsers(@RequestBody List<User> ls)
	{
		List<User> le=userservice.addUsers(ls);
		
		ResponseEntity re=new ResponseEntity<List<User>>(le,HttpStatus.OK);
		return re;
	}
	
	@PutMapping(path="/updateUser")
	public ResponseEntity<User> updateUser(@RequestBody User e) throws Throwable
	{
		User e1=userservice.updateUser(e);
		
		ResponseEntity re=new ResponseEntity<User>(e1,HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteUser")
	public ResponseEntity<String> deleteUser(@RequestBody User e)
	{
		userservice.deleteUser(e);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteUser/{eid}")
	public ResponseEntity<String> deleteUserById(@PathVariable int eid)
	{
		userservice.deleteUserById(eid);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	

}
