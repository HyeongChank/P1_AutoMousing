package com.click.pro.service;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.click.pro.domain.MacClick2;
import com.click.pro.persistence.MacRepository;

@Service
public class MacService {

	@Autowired
	private MacRepository mr;
	
	public ResponseEntity<String> getposition(MacClick2 mc) {
        List<MacClick2> mcl = new ArrayList<>();
        mr.save(mc);

		return ResponseEntity.ok().body("전달성공");
	}
}
