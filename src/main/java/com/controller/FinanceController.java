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

import com.model.Finance;
import com.service.FinanceService;



@RestController
@RequestMapping(path="/api")
public class FinanceController {
	
	@Autowired
	FinanceService financeservice;
	
	
	@PostMapping("/addFinance")
	public ResponseEntity<Finance> addBill(@RequestBody Finance c)
	{
		Finance c1=financeservice.addBill(c);
		ResponseEntity re=new ResponseEntity<Finance>(c1,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("/getFinances")
	public ResponseEntity<List<Finance>> getBills()
	{
		List<Finance> lc1=financeservice.getBills();
		ResponseEntity re=new ResponseEntity<List<Finance>>(lc1,HttpStatus.OK);
		return re;
	}
	
	@GetMapping(path="/getFinance/{cid}")
	public ResponseEntity<Finance> getBillById(@PathVariable int cid) throws Throwable
	{
		Finance c1=financeservice.getBillById(cid);
		
		ResponseEntity re=new ResponseEntity<Finance>(c1,HttpStatus.OK);
		return re;
	}
	
	@PostMapping(path="/addFinances")
	public ResponseEntity<List<Finance>> addBills(@RequestBody List<Finance> ls)
	{
		List<Finance> le=financeservice.addBills(ls);
		
		ResponseEntity re=new ResponseEntity<List<Finance>>(le,HttpStatus.OK);
		return re;
	}
	
	@PutMapping(path="/updateFinance")
	public ResponseEntity<Finance> updateBill(@RequestBody Finance e) throws Throwable
	{
		Finance e1=financeservice.updateBill(e);
		
		ResponseEntity re=new ResponseEntity<Finance>(e1,HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteFinance")
	public ResponseEntity<String> deleteBill(@RequestBody Finance e)
	{
		financeservice.deleteBill(e);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deleteFinance/{eid}")
	public ResponseEntity<String> deleteBillById(@PathVariable int eid)
	{
		financeservice.deleteBillById(eid);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	

}
