
public class Book {
    static int totalBooks;
    
    String title;
    String author;

    static {
        totalBooks = 0;
    }

   
   

    Book( String title,String author ){
        this.title = title;
        this.author = author;
        totalBooks++;
        
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
        
    }

    public static void main(String[] args) {
        

        Book javaBook = new Book("java bignner", "Robert");


      
       
         System.out.println(Book.getTotalBooks());
         javaBook.returnBook(" java biggener");
          System.out.println(Book.getTotalBooks());
    }
}

