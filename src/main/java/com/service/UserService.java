package com.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.ResourceNotFoundException;
import com.model.User;
import com.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User addUser(User c)
	{
		 repo.save(c);	
		 return c;
	}
	
	public List<User> getUsers()
	{
		List<User> lc1=repo.findAll();
		
		return lc1;
	}

	public User getUserById(int cid) throws Throwable {
		Supplier s1= ()->new ResourceNotFoundException("User Does not exist in the database");
		User c=repo.findById(cid).orElseThrow(s1);
		return c;
	}

	public String deleteUserById(int cid) {
		
		repo.deleteById(cid);
		
		return "Deleted";
	}

	public String deleteUser(User c) {
		
		repo.delete(c);
		return "Deleted";
	}

	public User updateUser(User c) throws Throwable {
		int id=c.getuId();
		
		Supplier s1= ()->new ResourceNotFoundException("User Does not exist in the database");
		User c1=repo.findById(id).orElseThrow(s1);
		
		c1.setUserName(c.getUserName());
			repo.save(c1);
			return c1;	
	}

	public List<User> addUsers(List<User> ls) {
		repo.saveAll(ls);
		return ls;
	}
	
	

}

