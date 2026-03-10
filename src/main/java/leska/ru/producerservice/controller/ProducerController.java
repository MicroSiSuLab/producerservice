package leska.ru.producerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProducerController {

    @GetMapping
    public String getMessage() {
        return "Marina, Ivana lubila";
    }

}
