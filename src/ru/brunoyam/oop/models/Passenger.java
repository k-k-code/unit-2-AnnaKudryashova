package ru.brunoyam.oop.models;

public class Passenger {
    private String name;
    private String surname;
    private String secondName;
    private String docNumber;
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getSecondName() {
        return secondName;
    }
    public String getDocNumber() {
        return docNumber;
    }
    public Passenger(String docNumberArg){  //конструктор с одним параметром
        docNumber = docNumberArg;
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
    @Override
    public String toString() {
        return "Passenger{" +
                "docNumber='" + docNumber + '\'' +
                '}';
    }
}