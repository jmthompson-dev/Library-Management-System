package com.jmthompson.system.model;

import java.util.Objects;

public class Author {
    private String name;
    private String description;

    public Author() {
    }

    public Author(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getName().equals(author.getName()) && getDescription().equals(author.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription());
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
