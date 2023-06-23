package com.click.pro.service;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.click.pro.domain.MacClick2;
import com.click.pro.persistence.MacRepository;

@Service
public class MacService {

	private final MacRepository mr;
	
	public MacService(MacRepository mr) {
		this.mr = mr;
	}
	
	public ResponseEntity<String> getposition(MacClick2 mc) {
        List<MacClick2> mcl = new ArrayList<>();
        List<MacClick2> mcl2 = (List<MacClick2>) mr.findAll();
        boolean alreadyExist = false;
        if(mc.getIndb().equals("true")) {
        	mr.save(mc);
//        	for(MacClick2 m: mcl2) {
//	        	if(m.getCheckname().equals(mc.getCheckname())) {
//	        		alreadyExist = true;
//	        		return ResponseEntity.badRequest().body("중복");
//	        	}
//	        	else{
//		        	mr.save(mc);
//		        	return ResponseEntity.ok().body("저장성공");
//	        	}
//        	}
        }
        
		return ResponseEntity.ok().body("전달성공");
	}

	public ResponseEntity<Optional<MacClick2>> getfrequentxy(String checkname) {
		System.out.println(checkname);
		Optional<MacClick2> m2 = mr.findByCheckname(checkname);
			
		System.out.println(m2.toString());

		System.out.println("reposite");
		return ResponseEntity.ok().body(m2);
	}
}
