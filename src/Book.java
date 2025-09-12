
public class Book {
    String title;
    String author;
    static int totalBooks = 2;

    Book( String title,String author ){
        this.title = title;
        this.author = author;
        
    }

    public static int  getTotalBooks(){
        
        return Book.totalBooks;
       
    }

    public void borrowBook(String title){

        if(Book.totalBooks ==0){
            System.out.println("No book available");
        }else{
            System.out.println("You borrowed book successfully");
            Book.totalBooks--;
        }


    }

    
    public void returnBook(String title){

        System.out.println("Thanks for returning the book ");
        Book.totalBooks++;
    }

    public static void main(String[] args) {
        System.out.println(Book.getTotalBooks());

        Book javaBook = new Book("java bignner", "Robert");


      
        javaBook.borrowBook("java biggner");
         System.out.println(Book.getTotalBooks());
         javaBook.returnBook(" java biggener");
          System.out.println(Book.getTotalBooks());
    }
}

