/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;

/**
 *
 * @author xolan
 */
public class ReferenceBook extends Book {
    private String referenceSection;

    // Default constructor
    public ReferenceBook() {
        this(0, "Unknown", 0, "General");
    }

    // Parameterized constructor
    public ReferenceBook(int bookID, String title, int yearPublished, String referenceSection) {
        super(bookID, title, yearPublished);
        setReferenceSection(referenceSection);
    }

    public String getReferenceSection() {
        return referenceSection;
    }

    public void setReferenceSection(String referenceSection) {
        if (referenceSection == null || referenceSection.isEmpty()) {
            throw new InvalidReferenceSectionException("Reference section cannot be empty.");
        }
        this.referenceSection = referenceSection;
    }

    public String getDetails() {
        return "Book ID: " + getBookID() + ", Title: " + getTitle() + 
               ", Year Published: " + getYearPublished() + 
               ", Reference Section: " + getReferenceSection();
    }
}
