package com.example.debit.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.debit.dto.Account;

@RestController
@RequestMapping("/debit")
public class DebitController {

	@PostMapping("/a")
	public Map<String ,Boolean>  receiveNewUserInfo(@RequestBody Account accInfo) {
		
		System.out.println(" Received to  DebitService : "+accInfo.toString());
		Map<String, Boolean> map = new HashMap<String, Boolean>();
        
		map.put("status", true);

		return map;
	}
	

    @GetMapping("/b")
    public String debitSuccess() {
        return "Ammount debited successfully";
    }
}
