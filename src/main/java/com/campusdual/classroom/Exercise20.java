package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        Person p = new Person("John", "Smith");
        Person t = new Teacher("María", "Montessori", "Educación");
        Person pO = new PoliceOfficer("Jake", "Peralta", "B-99");
        Person d = new Doctor("Gregory", "House", "Nefrología e infectología");
        List<Person> peopleList = new ArrayList<Person>(4);
        peopleList.add(p);
        peopleList.add(t);
        peopleList.add(pO);
        peopleList.add(d);

        return peopleList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
        for (Person item : stringList) {
            item.getDetails();
        }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }
}
