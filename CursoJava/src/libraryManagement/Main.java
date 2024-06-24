package libraryManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import payrollManagement.CustomExceptions.IdAlreadyExist;

public class Main {

    public static void main(String args[]) {
        UserManagement userM = new UserManagement();
        userM.defaultUsers();

        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        while (check) {
            System.out.println("Library Management System");
            System.out.println("1. Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                	System.out.println("Hello, looking for error...");
                    System.out.print("Please enter username: ");
                    String username = scanner.nextLine().toUpperCase();
                    if (userM.getUsers().containsKey(username)) {
                        Users user = userM.getUsers().get(username);
                        handleUserActions(user, userM, scanner);
                    } else {
                        System.out.println("Username not found.");
                    }
                    break;
                case 2:
                    check = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static void handleUserActions(Users user, UserManagement userM, Scanner scanner) {
        switch (user.getUserType()) {
            case "LIBRARIAN":
                handleLibrarianActions(userM, scanner);
                break;
            case "ADMINISTRATOR":
                handleLibrarianActions(userM, scanner); ///they have same privileges 
                break;
            case "PATRON":
                handlePatronActions(user, userM, scanner);
                break;
            default:
                System.out.println("Unknown user type.");
        }
    }

    public static void handleLibrarianActions(UserManagement userM, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Librarian actions:");
            System.out.println("1. Add Book");
            System.out.println("2. Edit Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Register Patron");
            System.out.println("5. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Book newBook = getBookDetails(scanner);
                    userM.addBook(newBook);
                    System.out.println("helloooo debug!");
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to edit: ");
                    String editISBN = scanner.nextLine();
                    if (userM.getBooks().containsKey(editISBN)) {
                        Book updatedBook = getBookDetails(scanner);
                        userM.editBook(editISBN, updatedBook);
                        System.out.println("Book edited successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to delete: ");
                    String deleteISBN = scanner.nextLine();
                    if (userM.getBooks().containsKey(deleteISBN)) {
                        userM.deleteBook(deleteISBN);
                        System.out.println("Book deleted successfully.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    Users newPatron = userM.addUserInput(scanner);
                    try {
                        userM.registerPatron(newPatron);
                        System.out.println("Patron registered successfully.");
                    } catch (IdAlreadyExist e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 5:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void handlePatronActions(Users user, UserManagement userM, Scanner scanner) {
        boolean back = false;
        while (!back) {
            System.out.println("Patron actions:");
            System.out.println("1. Search for Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Back");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    searchForBooks(userM, scanner);
                    break;
                case 2:
                    System.out.print("Enter ISBN of the book to borrow: ");
                    String borrowISBN = scanner.nextLine();
                    userM.borrowBook(user.getUserName(), borrowISBN);
                    break;
                case 3:
                    System.out.print("Enter ISBN of the book to return: ");
                    String returnISBN = scanner.nextLine();
                    userM.returnBook(returnISBN);
                    break;
                case 4:
                    back = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static Book getBookDetails(Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Enter book genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter publication date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date publicationDate = null;
        try {
            publicationDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
        System.out.print("Enter book location: ");
        String location = scanner.nextLine();

        return new Book(title, author, ISBN, genre, publicationDate, true, location);
    }

    public static void searchForBooks(UserManagement userM, Scanner scanner) {
        System.out.print("Enter search keyword: ");
        String keyword = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (var i : userM.getBooks().values()) {
            if (i.getTitle().toLowerCase().contains(keyword) ||
                i.getAuthor().toLowerCase().contains(keyword) ||
                i.getGenre().toLowerCase().contains(keyword) ||
                i.getISBN().toLowerCase().contains(keyword)) {
                System.out.println("Found book: " + i.getTitle() + " by " + i.getAuthor());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found matching the keyword.");
        }
    }
}