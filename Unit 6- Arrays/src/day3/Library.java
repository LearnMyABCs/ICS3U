package day3;

public class Library {
        private Book[] books;
        private int numBooks;
    
        // Constructor for Library
        public Library(int size) {
            books = new Book[size];
            numBooks = 0;
        }
    
        // Method to add a book to the library
        public void addBook(Book book) {
            if (numBooks < books.length) {
                books[numBooks] = book;
                numBooks++;
            } else {
                System.out.println("No more space in the library!");
            }
        }
    
    
        public void displayBooks(){
        //    for (Book book : books) {
        //         if(book != null)
        //              System.out.println(book);
        //    }
           for (int i = 0; i < numBooks; i++) {
                System.out.println(books[i]);
            
           }
        }

        public void displayAvailableBooks(){
            // for (Book book : books) {
            //     if (book!= null && !book.isBorrowed())
            //     System.out.println(book);
                
            // }

            for (int i = 0; i < numBooks; i++) {
                if (!books[i].isBorrowed())
                    System.out.println(books[i]);
                
            }
        }


        public Book borrowBook (String title){
            for (int i = 0; i < numBooks; i++) {
                if (books[i].getTitle().equals(title) && !books[i].isBorrowed()){
                books[i].setBorrowed(true);
                return books[i];
                }

               
            }
            System.out.println("Unable to borrow book.");
            return null;
           
        }
    }
    

