package pro_mac_controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pro_mac_domain.MacClick;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MacController {
    
    @PostMapping("/api/mousePosition")
    public ResponseEntity<String> getMousePosition(@RequestBody MacClick mck) {
        List<MacClick> mc = new ArrayList<>();
        int x1 = mck.getX1();
        int y1 = mck.getY1();
        System.out.println(x1);
        return ResponseEntity.ok().body("전달성공");
    }
    @GetMapping("/api/test")
    public ResponseEntity<String> testEndpoint() {
        return ResponseEntity.ok().body("Test Endpoint");
    }
}