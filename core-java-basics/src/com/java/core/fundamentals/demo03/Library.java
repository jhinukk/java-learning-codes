package com.java.core.fundamentals.demo03;

public class Library {
    private String libraryName;
    private int noOfBooks;
    private int noOfLibrarians;

    public Library(String libraryName,int noOfBooks,int noOfLibrarians){

        this.libraryName = libraryName;
        this.noOfBooks = noOfBooks;
        this.noOfLibrarians = noOfLibrarians;
    }
    public String getLibraryName(){
        return libraryName;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public int getNoOfLibrarians() {
        return noOfLibrarians;
    }

    @Override
    public String toString(){
        return "Library { Library Name : "+libraryName+" , No of books : "+noOfBooks+" ,No of Librarians : "+noOfLibrarians+" }";
    }
}
