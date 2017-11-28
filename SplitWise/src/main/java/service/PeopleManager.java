package service;

import java.util.List;

public interface PeopleManager {
    void add(Person p);

    void deprecate(Person p);

    List<Person> getPeople();
}
