/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library_management_system;

/**
 *
 * @author xolan
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ReferenceBook[] books = new ReferenceBook[3];
        books[0] = new ReferenceBook(1, "Java Programming", 2020, "Computer Science");
        books[1] = new ReferenceBook(2, "Data Structures", 2019, "General");
        books[2] = new ReferenceBook(3, "Algorithms", 2021, "Mathematics");

        // Demonstrating exception handling
        try {
            books[1].setReferenceSection(""); // This will throw an exception
        } catch (InvalidReferenceSectionException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }

        // Sorting books by bookID
        Arrays.sort(books);

        // Displaying book details
        for (ReferenceBook book : books) {
            System.out.println(book.getDetails());
        }
    }
}
