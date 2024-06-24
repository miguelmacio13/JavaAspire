package libraryManagement;

import java.util.*;

import payrollManagement.CustomExceptions.IdAlreadyExist;

public class UserManagement {

    private Map<String, Users> users = new HashMap<>();
    private Map<String, Book> books = new HashMap<>();

    public Map<String, Users> getUsers() {
        return users;
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public void addUser(Users user) throws IdAlreadyExist {
        if (getUsers().containsKey(user.getUserName())) {
            throw new IdAlreadyExist("The username already exists, please try a new one");
        }
        getUsers().put(user.getUserName(), user);
    }

    public Users addUserInput(Scanner scanner) {
        System.out.println("Enter username: ");
        String username = scanner.nextLine().toUpperCase();

        System.out.println("Enter option for type of user:"
                + "\n1) Librarian"
                + "\n2) Administrator"
                + "\n3) Patron");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        String userType = null;
        boolean validChoice = false;

        while (!validChoice) {
            switch (choice) {
                case 1:
                    userType = "LIBRARIAN";
                    validChoice = true;
                    break;
                case 2:
                    userType = "ADMINISTRATOR";
                    validChoice = true;
                    break;
                case 3:
                    userType = "PATRON";
                    validChoice = true;
                    break;
                default:
                    System.out.println("Enter a valid option");
                    choice = scanner.nextInt();
                    scanner.nextLine();
            }
        }

        return new Users(username, userType);
    }

    public void defaultUsers() {
        try {
            addUser(new Users("MAINLIBRARIAN", "LIBRARIAN"));
        } catch (IdAlreadyExist e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            addUser(new Users("MAINADMINISTRATOR", "ADMINISTRATOR"));
        } catch (IdAlreadyExist e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            addUser(new Users("MAINPATRON", "PATRON"));
        } catch (IdAlreadyExist e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }

    public void editBook(String ISBN, Book updatedBook) {
        if (books.containsKey(ISBN)) {
            books.put(ISBN, updatedBook);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void deleteBook(String ISBN) {
        books.remove(ISBN);
    }

    public void registerPatron(Users patron) throws IdAlreadyExist {
        addUser(patron);
    }

    public void updatePatronInfo(String username, Users updatedPatron) {
        if (users.containsKey(username)) {
            users.put(username, updatedPatron);
        } else {
            System.out.println("Patron not found.");
        }
    }

    public void borrowBook(String username, String ISBN) {
        if (users.containsKey(username) && books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println("Book borrowed successfully.");
            } else {
                System.out.println("Book is not available.");
            }
        } else {
            System.out.println("User or book not found.");
        }
    }

    public void returnBook(String ISBN) {
        if (books.containsKey(ISBN)) {
            Book book = books.get(ISBN);
            book.setAvailable(true);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found.");
        }
    }
}