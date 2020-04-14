package ru.brunoyam.oop.models.transport;

public class Passenger {
    public String name;
    String surname;
    String secondName;
    String docNumber;
    public Passenger() { //у конструктора нет возвращаемого значения, т.к. он возвращает объект
        System.out.println("constructor 1");
    }
    public Passenger(String docNumberArg){  //конструктор с одним параметром
        docNumber = docNumberArg;
        System.out.println("constructor 2");
    }
    public Passenger(String name, String surname, String secondName, String docNumber) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.docNumber = docNumber;
    }
    public String getFullName(){
        String fullName = name + " " + surname + " " + secondName;
        return fullName;
    }
    public String getFullName(String prefix){
        String fullName = prefix + " " + name + " " + surname + " " + secondName;
        return fullName;
    }

}