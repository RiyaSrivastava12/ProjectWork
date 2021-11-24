package com.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advices.ResourceNotFoundException;
import com.model.Finance;
import com.repository.FinanceRepository;

@Service
public class FinanceService {
	@Autowired
	FinanceRepository financeRepo;

	public Finance addBill(Finance f) {
		financeRepo.save(f);
		return f;
	}
	
	public List<Finance> addBills(List<Finance> f) {
		financeRepo.saveAll(f);
		return f;
	}
	

	public List<Finance> getBills() {
		List<Finance> bills = financeRepo.findAll();
		return bills;
	}

	public Finance getBillById(int bId) throws Throwable {
		Supplier s1 = () -> new ResourceNotFoundException("Bill with bill number : " + bId + " does not exist");
		Finance f1 = financeRepo.findById(bId).orElseThrow(s1);
		return f1;
	}

	public String deleteBillById(int bId) {
		financeRepo.deleteById(bId);
		return "Bill Deleted!!!";
	}

	public String deleteBill(Finance f) {

		financeRepo.delete(f);
		return "Deleted";
	}

	public Finance updateBill(Finance f) throws Throwable {
		int id=f.getId();
		Supplier s1= ()->new ResourceNotFoundException("Bill Does not exist in the database");
		Finance f2=financeRepo.findById(id).orElseThrow(s1);
		f2.setDocFees(f2.getDocFees());
		f2.setRegFees(f2.getRegFees());
		f2.setMedAmount(f2.getMedAmount());
		financeRepo.save(f2);
		return f2;
	}

}