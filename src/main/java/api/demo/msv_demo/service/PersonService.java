package api.demo.msv_demo.service;

import api.demo.msv_demo.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {
    List<Person> getList();
    Optional<Person> getPerson(Integer id);
    Person savePerson(Person person);
    Person updatePerson(Integer id, Person person);
    void deletePerson(Integer id);
}
