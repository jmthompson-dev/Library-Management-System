package com.jmthompson.system.model;

import java.util.Objects;

public class Book {
    private final String ISBN;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;

    public Book(String ISBN, String title, String subject, String publisher, String language, int numberOfPages) {
        this.ISBN = ISBN;
        this.title = title;
        this.subject = subject;
        this.publisher = publisher;
        this.language = language;
        this.numberOfPages = numberOfPages;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getNumberOfPages() == book.getNumberOfPages() && getISBN().equals(book.getISBN()) && getTitle().equals(book.getTitle()) && getSubject().equals(book.getSubject()) && getPublisher().equals(book.getPublisher()) && getLanguage().equals(book.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getISBN(), getTitle(), getSubject(), getPublisher(), getLanguage(), getNumberOfPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
