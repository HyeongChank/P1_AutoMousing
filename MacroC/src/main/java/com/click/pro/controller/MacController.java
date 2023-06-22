package com.click.pro.controller;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.click.pro.domain.MacClick2;
import com.click.pro.service.MacService;


@RestController
@RequestMapping("/api")
public class MacController {
	
	@Autowired
	private MacService ms;
	
	
    @PostMapping("/mousePosition")
    public ResponseEntity<String> getMousePosition(@RequestBody MacClick2 mc) {
        List<MacClick2> mcl = new ArrayList<>();
        mcl.add(mc);
        for(MacClick2 m : mcl) {
        	System.out.println(m.getX1() + " " + m.getX2());
        }
        clickCoordinates(mc);
        return ms.getposition(mc);
    }
    
    @PostMapping("/getfrequentlocation")
    public ResponseEntity<Optional<MacClick2>> getfrequentlocation(@RequestBody String checkname){
    	System.out.println(checkname);
    	    	
    	return ms.getfrequentxy(checkname);
    }
    
    @PostMapping("/clickCoordinates")
    public ResponseEntity<String> clickCoordinates(@RequestBody MacClick2 request) {
        // 플라스크 API 엔드포인트 설정
        String flaskApiUrl = "http://127.0.0.1:5000/clickCoordinates";
        // RestTemplate을 사용하여 플라스크로 POST 요청 전송
        RestTemplate restTemplate = new RestTemplate();
        // 전달할 데이터를 Map 형태로 변환
        Map<String, Object> requestData = new HashMap<>();
        if(request.getX1() !=null) {
        	
        }
        // 모든 파라미터 null확인해서 넣어야 함
        requestData.put("x1", request.getX1());
        requestData.put("y1", request.getY1());
        requestData.put("x2", request.getX2());
        requestData.put("y2", request.getY2());
        requestData.put("x3", request.getX3());
        requestData.put("y3", request.getY3());
        requestData.put("x4", request.getX4());
        requestData.put("y4", request.getY4());
        requestData.put("x5", request.getX5());
        requestData.put("y5", request.getY5());
        requestData.put("x6", request.getX6());
        requestData.put("y6", request.getY6());
        requestData.put("interval1", request.getInterval1());
        requestData.put("interval2", request.getInterval2());
        requestData.put("interval3", request.getInterval3());
        requestData.put("interval4", request.getInterval4());
        requestData.put("interval5", request.getInterval5());
        requestData.put("interval6", request.getInterval6());
        requestData.put("roop", request.getRoop());
        requestData.put("indb", request.getIndb());
        
        System.out.println("requestData" + requestData);
        // HttpHeaders 객체 생성 및 Content-Type 설정
        HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        
        // HttpEntity 객체 생성 및 요청 데이터와 헤더 설정
        HttpEntity<Map<String, Object>> entity = new HttpEntity<>(requestData, headers);
        
        // RestTemplate을 사용하여 플라스크로 POST 요청 전송
        ResponseEntity<String> response = restTemplate.exchange(flaskApiUrl, HttpMethod.POST, entity, String.class);

        // 플라스크 응답 반환
        return response;
    }
}
    
    