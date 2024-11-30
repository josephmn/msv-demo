package api.demo.msv_demo.service;

import api.demo.msv_demo.entity.Person;
import api.demo.msv_demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<Person> getList() {
        return (List<Person>) personRepository.findAll();
    }

    @Override
    public Optional<Person> getPerson(Integer id) {
        return personRepository.findById(id);
    }

    @Override
    public Person savePerson(Person person) {
        return null;
    }

    @Override
    public Person updatePerson(Integer id, Person person) {
        return null;
    }

    @Override
    public void deletePerson(Integer id) {

    }
}
