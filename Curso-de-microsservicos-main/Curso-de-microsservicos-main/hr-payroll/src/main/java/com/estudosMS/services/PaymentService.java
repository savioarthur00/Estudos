package com.estudosMS.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estudosMS.entites.Payment;
import com.estudosMS.entites.Worker;
import com.estudosMS.feingclients.WorkerFeingClient;

@Service
public class PaymentService {
		
	@Autowired
	private WorkerFeingClient workerfeingClient;
	
	
	public Payment getPayment (Long workedId, int days) {
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workedId);
		
					
		Worker worker = workerfeingClient.findById(workedId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
		
	}

}
