# Library Management System
---
---

## Contents
1. Introduction
2. System requirements
3. Use case diagram
4. Class diagram
5. Activity diagrams
6. Code
***
## Introduction

This is a management system backend for a library. The system will manage the main functions of a library such as keeping track of books and library members, sending notifications when needed, and more. Library management systems are a necessity for libraries to maintain their assets along with manage member relationships.
***
## System Requirements

### Necessary foundations for a successful Library Management System:

1. Members of the library have the ability to search for books by a title, author, category, or the date of publication.
2. An individual identification code will be attached to each book along with more details such as a shelf number.
3. Many times, libraries will possess multiple copies of a book. To ensure that members of the library are able to check out or reserve any of those copies, we will call each copy of the book, a book item.
4. Using this management system, a library can track a specific book, seeing which member has checked it out, along with the ability to pull up a list of books that a member currently has checked out or reserved.
5. The system will have a maximum limit of 5 books that a member may check out at one time.
6. The system will have a maximum limit of 14 days that a member may keep a book checked out before returning or renewing.
7. If a book is returned late, the system will apply a late fee and be able to collect that fee from the library member.
8. Library members will have the ability to reserve one or more books if the books are currently checked out by another member. Reservations are carried out in queue-fashion.
9. The management system will have notification abilities to let members know when their reserved book is in stock or if they have an overdue book.
10. The management system will be designed to accurately read barcodes from both member library cards and from books.

***
## Use case diagram

### This management system as a whole contains three main positions:

* **Librarian**: Adds new books, modifies current books, as well as book items and users. This position also oversees the issuing, reserving, and returning of all book items.
* **Member**: Ability to explore the library catalogs and with a member library card, they may reserve, check out, return, and renew books.
* **System**: Primarily keeps track of book reservations, checked out books, and sends notifications for reservations and overdue books. 

### Top use cases of the Library Management System:

* **Add/Remove/Modify book**: To add, remove, or modify books or book items.
* **Search Catalog**: To search for books either by their title, author, category, or date of publication.
* **Register new account/cancel membership**: To add new member information into the system or to deactivate a member account.
* **Check-out book**: To borrow a book from the library for a specified amount of time.
* **Reserve book**: To reserve a book that the library does not currently have in stock.
* **Renew book**: To re-borrow a book that is currently checked out.
* **Return book**: To return a book back to the library after it was borrowed for the allotted time.
***

## Class diagram

### Main classes of the Library Management System:

* **Library**: The essential component for the entire operation this system is designed to manage. This class is separated from all other libraries by attributes such as ‘Name’ or location based attributes such as ‘Address’.
* **Book**: The items that are managed within the system. All books will have important details recorded such as the ISBN, title, category, publisher(s), and date of publication.
* **BookItem**: The library may have multiple copies of any book. Every copy will be its own book item in the system, including each book having an individual barcode.
* **Account**: The management system will allow for two account types with the first as a librarian and the second as a library member.
* **LibraryCard**: Library cards are provided to all library members. Each card has an individual barcode that identifies the member as they check out or return books.
* **BookReservation**: This class will manage all book reservations against all book items.
* **BookLending**: Manages book items that are being checked out.
* **Catalog**: Consists of a sorted list of books at the library. There will be a total of four catalogs that can be searched through including title, author, category, and date of publication.
* **Fine**: If a library member fails to return their book(s) on time, this class will calculate and collect any fines that are owed.
* **Author**: This class will consist of the author name for any given book.
* **Rack**: The library will have a shelf system to store all physical books. Each shelf will display data such as the shelf number along with a location code so books can be found efficiently. 
