/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;

/**
 *
 * @author xolan
 */
public class Book implements Comparable<Book> {
    private int bookID;
    private String title;
    private int yearPublished;

    // Default constructor
    public Book() {
        this(0, "Unknown", 0);
    }

    // Parameterized constructor
    public Book(int bookID, String title, int yearPublished) {
        this.bookID = bookID;
        this.title = title;
        this.yearPublished = yearPublished;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.bookID, other.bookID);
    }
}
