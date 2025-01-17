package day1;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Book (String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    public Book (String title, String author){
        this.title = title;
        this.author = author;
        this.yearPublished = 2000;
        this.price = 9.99;

    }

    public Book (String title){
        this.title = title;
        this.author = "Unknown Author";
        this.yearPublished = 2000;
        this.price = 9.99;

    }
    public void displayDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(yearPublished);
        System.out.println(price);
    }
    public void displayDetails(boolean showTitleAndAuthorOnly){
        if (showTitleAndAuthorOnly){
            System.out.println(title);
            System.out.println(author);
        }
        else
            displayDetails();
        }
    
    public void displayDetails(String showTitleOnly){
        if (showTitleOnly.equals("title")){
            System.out.println(title);
        }

    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String newAuthor){
        author = newAuthor;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public void setYearPublished(int newYearPublished){
        yearPublished = newYearPublished;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double newPrice){
        price = newPrice; 
    }



    }



