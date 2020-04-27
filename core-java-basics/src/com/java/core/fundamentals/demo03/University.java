package com.java.core.fundamentals.demo03;

public class University {
    private String name;
    private String location;
    private int noOfFaculties;
    private Library library;

    public University(String name, String location,int noOfFaculties,Library library){
        this.name = name;
        this.location = location;
        this.noOfFaculties = noOfFaculties;
        this.library = library;
    }
    public String getName(){
        return this.name;
    }
    public String getLocation(){
        return location;
    }

    public int getNoOfFaculties() {
        return noOfFaculties;
    }
    public Library getLibrary(){
        return library;
    }

    @Override
    public String toString(){
        return "University { Name: "+name+" ,Location: "+location+" ,No of faculties: "+noOfFaculties+" }" ;
    }
}
