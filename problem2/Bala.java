package problem2;

public class Bala {

    final String name = "Balagurushami";
    final String BookName = "ProgrammingWithJava";
    private int Published =2000;
    String BookCover;


    public void setPublished(int published) {
        this.Published = Published;
    }

    public int getPublished(int i) {
        return Published;
    }



public void setBookCover(int BookCober){
        this.BookCover=BookCover;
        }

public String getBookCover(int i){
        return BookCover;
        }



                void display(){
                    System.out.println("name: "+name);
                    System.out.println("bookname :"+BookName);
                    System.out.println("Published :"+Published);
                    System.out.println(BookCover);
                }
            }


