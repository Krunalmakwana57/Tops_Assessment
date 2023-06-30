import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Book {
    //declaring private variables of books
    private String title;
    private String author;
    private String category;
    private int qty;
    private int price;

    public Book(String title, String author, String category,int qty, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.qty = qty;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }
    public int getQty(){
        return qty;
    }
    public int getPrice(){
        return price;
    }
}
//using map interface setting the value for admin
//username : admin
//password : password
class Library {
    private List<Book> books;
    private Map<String, String> passwordMap;

    public Library() {
        books = new ArrayList<>();
        passwordMap = new HashMap<>();
        passwordMap.put("admin", "password");
    }

    public boolean authenticate(String username, String password) {
        String storedPassword = passwordMap.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
    //function to add book using collection framework arraylist
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }
    //msg to show when library is empty
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }
        //for each loop to show all book data if it's available
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Category: " + book.getCategory() + ", Qty: " + book.getQty() + ", Price: " + book.getPrice());
        }
    }
    //function to search for book by its title
    public void searchBook(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }

        if (foundBooks.isEmpty()) {
            System.out.println("No books found with the given title.");
            return;
        }
        //gives results if book available with given title
        System.out.println("Books found with the given title:");
        for (Book book : foundBooks) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Category: " + book.getCategory() + ", Qty: " + book.getQty() + ", Price: " + book.getPrice());
        }
    }
    //function to update book details by its index which starts with 0
    public void updateBook(int index, Book book) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        books.set(index, book);
        System.out.println("Book updated successfully!");
    }
    //delete book by its index
    public void deleteBook(int index) {
        if (index < 0 || index >= books.size()) {
            System.out.println("Invalid index!");
            return;
        }

        books.remove(index);
        System.out.println("Book deleted successfully!");
    }
    //function to change password
    public void changePassword(String username, String newPassword) {
        passwordMap.put(username, newPassword);
        System.out.println("Password changed successfully!");
    }

    public List<Book> getBooks() {
        return null;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Library library = new Library();

            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (!library.authenticate(username, password)) {
                System.out.println("Invalid username or password. Exiting the program...");
                System.exit(0);
            }

            while (true) {
                System.out.println("\nLibrary Management System");
                System.out.println("1. Add Book");
                System.out.println("2. Display Books");
                System.out.println("3. Search Book");
                System.out.println("4. Update Book");
                System.out.println("5. Delete Book");
                System.out.println("6. Change Password");
                System.out.println("7. Close Application");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:  
                        System.out.println("Select the category of the book:");
                        System.out.println("1. Computer");
                        System.out.println("2. Electronics");
                        System.out.println("3. Electrical");
                        System.out.println("4. Mechanical");
                        System.out.println("5. Civil");
                        System.out.print("Enter the category number: ");
                        int categoryChoice = scanner.nextInt();
                        String category;
                        switch (categoryChoice) {
                            case 1:
                                category = "Computer";
                                break;
                            case 2:
                                category = "Electronics";
                                break;
                            case 3:
                                category = "Electrical";
                                break;
                            case 4:
                                category = "Mechanical";
                                break;
                            case 5:
                                category = "Civil";
                                break;
                            default:
                                System.out.println("Invalid category. Adding the book without a category.");
                                category = "Uncategorized";
                                break;
                        }
                        scanner.nextLine(); // Clear the input buffer
                        System.out.print("Enter the title of the book: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter the author of the book: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter the Qty of the book: ");
                        int qty = scanner.nextInt();
                        System.out.print("Enter the Price of the book: ");
                        int price = scanner.nextInt();
                        Book book = new Book(title, author, category,qty,price);
                        library.addBook(book);
                        break;

                    case 2:
                        library.displayBooks();
                        break;

                    case 3:
                        scanner.nextLine(); // Clear the input buffer
                        System.out.print("Enter the title of the book to search: ");
                        String searchTitle = scanner.nextLine();
                        library.searchBook(searchTitle);
                        break;

                    case 4:
                        library.displayBooks();
                        System.out.print("Enter the index of the book to update: ");
                        int indexToUpdate = scanner.nextInt();
                        scanner.nextLine(); // Clear the input buffer
                        System.out.print("Enter the new title of the book: ");
                        String newTitle = scanner.nextLine();
                        System.out.print("Enter the new author of the book: ");
                        String newAuthor = scanner.nextLine();
                        System.out.print("Enter the new Qty of the book: ");
                        int newQty = scanner.nextInt();
                        System.out.print("Enter the new Price of the book: ");
                        int newPrice = scanner.nextInt();
                        System.out.println("Select the new category of the book:");
                        System.out.println("1. Computer");
                        System.out.println("2. Electronics");
                        System.out.println("3. Electrical");
                        System.out.println("4. Mechanical");
                        System.out.println("5. Civil");
                        System.out.print("Enter the new category number: ");
                        int newCategoryChoice = scanner.nextInt();
                        String newCategory;
                        switch (newCategoryChoice) {
                            case 1:
                                newCategory = "Computer";
                                break;
                            case 2:
                                newCategory = "Electronics";
                                break;
                            case 3:
                                newCategory = "Electrical";
                                break;
                            case 4:
                                newCategory = "Mechanical";
                                break;
                            case 5:
                                newCategory = "Civil";
                                break;
                            default:
                                System.out.println("Invalid category. Updating the book without changing the category.");
                                newCategory = library.getBooks().get(indexToUpdate).getCategory();
                                break;
                        }
                        Book updatedBook = new Book(newTitle, newAuthor, newCategory,newQty,newPrice);
                        library.updateBook(indexToUpdate, updatedBook);
                        break;

                    case 5:
                        library.displayBooks();
                        System.out.print("Enter the index of the book to delete: ");
                        int indexToDelete = scanner.nextInt();
                        library.deleteBook(indexToDelete);
                        break;

                    case 6:
                        scanner.nextLine(); // Clear the input buffer
                        System.out.print("Enter the new password: ");
                        String newPassword = scanner.nextLine();
                        library.changePassword(username, newPassword);
                        break;

                    case 7:
                        System.out.println("Closing the application...");
                        try {
                            Thread.sleep(3000); // Delay for 3 seconds
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
        }
    }
}
