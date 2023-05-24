package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeDataAccessService implements PersonDao {
    private static List<Person> database = new ArrayList<>();
    @Override
    public int insertPerson(UUID id, Person person) {
        database.add(new Person(id, person.getName()));
        return 1;
    }
}
