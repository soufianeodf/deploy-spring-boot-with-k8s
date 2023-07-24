package io.soufianeodf.deployspringbootwithk8s.controller;

import io.soufianeodf.deployspringbootwithk8s.dto.GreetingDTO;
import io.soufianeodf.deployspringbootwithk8s.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @RequestMapping("/greeting")
    public ResponseEntity<GreetingDTO> greeting() {
        return ResponseEntity.ok().body(new GreetingDTO(greetingService.getGreeting()));
    }
}
