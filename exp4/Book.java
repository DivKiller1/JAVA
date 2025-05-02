class Books{
    String title;
    String author;
    int publicationYear;
    public Books() {
        title = "Untitled";
        author = "Unknown Author";
        publicationYear = 0; 
    }

    public Books(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.publicationYear=year;
    }
    
    
}


public class Book {
    public static void main(String a[]){
Books obj=new Books("Hello","Bye",10);

System.out.println(obj.author);

Books book3 = new Books("1984", "George Orwell", 1949);
System.out.println(book3.author);

    }
    
}