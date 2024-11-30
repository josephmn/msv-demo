package api.demo.msv_demo.controller;

import api.demo.msv_demo.entity.Person;
import api.demo.msv_demo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.getList();
    }

    @GetMapping("/{id}")
    public Optional<Person> getAll(@PathVariable Integer id) {
        return personService.getPerson(id);
    }
}
