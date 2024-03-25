package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PersonRepository {

    private Map<Integer, Person> mapPerson;

    public PersonRepository() {
     this.mapPerson
         = new HashMap<>();
    }

    public void addPerson (Person person){
        mapPerson.put(person.ID(), person);
    }

    public Optional<Person>getPersonByID(int id){

            System.out.println ("person with ID " +  Optional.ofNullable(mapPerson.get(id)));
            return Optional.ofNullable(mapPerson.get(id));

        }

    }
