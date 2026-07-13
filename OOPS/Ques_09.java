package OOPS;
import java.util.*;

class Book
{
    private int bookId;
    private String title;
    private String author;
    private int price;

    // Parameterized Constructor
    Book(int bookId, String title, String author, int price)
    {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter
    public int getBookId()
    {
        return bookId;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPrice()
    {
        return price;
    }

    // Setter
    public void setBookId(int bookId)
    {
        this.bookId=bookId;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
}

public class Ques_09
{

    public static int[] SearchBook(Book[] books, String SearchAuthor)
    {
        int[] result = new int[books.length];
        int count=0;

        // Filter
        for(Book book : books)
        {
            if(book.getAuthor().equalsIgnoreCase(SearchAuthor))
            {
                result[count] = book.getPrice();
                count++;
            }
        }

        if(count==0)
        {
            return null;
        }

        // Bubble Sort
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-i-1;j++)
            {
                if(result[j] > result[j+1])
                {
                    int temp = result[j];
                    result[j]=result[j+1];
                    result[j+1] = temp;
                }
            }
        }

        // Exact Size Array
        int[] ans = new int[count];
        for(int i=0;i<count;i++)
        {
            ans[i] = result[i];
        }
        return ans;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Book[] Books = new Book[3];

        // Input
        for(int i=0;i<Books.length;i++)
        {
            int BookId = sc.nextInt(); sc.nextLine();
            String Title = sc.nextLine();
            String Author = sc.nextLine();
            int Price = sc.nextInt(); sc.nextLine();

            Books[i] = new Book(BookId, Title, Author, Price);
        }

        // Question Start
        String SearhAuthor = sc.nextLine();
        int[] Ans = SearchBook(Books, SearhAuthor);

        // Condition
        if(Ans != null)
        {
            for(int price : Ans)
            {
                System.out.println(price);
            }
        }
    }
}
