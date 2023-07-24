package io.soufianeodf.deployspringbootwithk8s.dto;

public class GreetingDTO {
    private String message;

    public GreetingDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
