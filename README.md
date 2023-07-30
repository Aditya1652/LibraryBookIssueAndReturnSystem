This Java code implements a basic Library System, simulating the functionalities of a library where books can be added, issued, and returned. It consists of three classes: `Book`, `Library`, and `LibrarySystem`.

The `Book` class represents a book with attributes like title, author, and availability status. It has getter and setter methods to access and modify these attributes.

The `Library` class manages a list of books and provides methods to add books, issue books (mark as unavailable), and return books (mark as available). The `addBook` method allows the librarian to add new books to the library's collection. The `issueBook` method searches for a book by its title and marks it as unavailable if found. The `returnBook` method searches for a book by its title and marks it as available if found.

The `LibrarySystem` class serves as the entry point and the user interface for the library system. It initializes a `Library` object and allows users to interact with the library through a simple text-based menu. Users can choose to issue a book, return a book, or exit the system. If a book is not available when issuing or already available when returning, appropriate messages are displayed.

In summary, this code provides a straightforward implementation of a Library System where users can manage books through basic interactions. Although simplistic, it forms the foundation for a more complex and feature-rich library management system.
