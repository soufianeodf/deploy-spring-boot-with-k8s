package io.soufianeodf.deployspringbootwithk8s.service;

import io.soufianeodf.deployspringbootwithk8s.repository.GreetingRepository;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting() {
        return greetingRepository.findAll().iterator().next().getMessage();
    }
}
