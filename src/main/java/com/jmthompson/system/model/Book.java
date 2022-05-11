package com.jmthompson.system.model;

import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private String subject;
    private String publisher;
    private String language;
    private int numberOfPages;

    public Book(Builder builder) {
        this.isbn = builder.ISBN;
        this.title = builder.title;
        this.subject = builder.subject;
        this.publisher = builder.publisher;
        this.language = builder.language;
        this.numberOfPages = builder.numberOfPages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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
        return getNumberOfPages() == book.getNumberOfPages() &&
                getIsbn().equals(book.getIsbn()) &&
                getTitle().equals(book.getTitle()) &&
                getSubject().equals(book.getSubject()) &&
                getPublisher().equals(book.getPublisher()) &&
                getLanguage().equals(book.getLanguage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIsbn(), getTitle(), getSubject(), getPublisher(), getLanguage(), getNumberOfPages());
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", publisher='" + publisher + '\'' +
                ", language='" + language + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        String ISBN;
        String title;
        String subject;
        String publisher;
        String language;
        int numberOfPages;

        private Builder() {
        }

        public Builder withISBN(final String ISBN) {
            this.ISBN = ISBN;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder withPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder withLanguage(String language) {
            this.language = language;
            return this;
        }

        public Builder withNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }
    }
}
