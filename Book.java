/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefNumber, 
    boolean isCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        bookPages = pages;
        refNumber = bookRefNumber;
        courseText = isCourseText;
    }

    public String getAuthor()
       {
          return author;
       }
   public String getTitle()
   {
       return title;
   }
   public void printAuthor()
   {
       System.out.println(author);
    }
    public void printTitle()
    {
        System.out.println(title);
    }
    public void printDetails()
    {
        System.out.println("Title" + title);
        System.out.println("Author" + author);
        System.out.println("Pages" + pages);
        System.out.println(" The book has been borrowed " + borrowed + " times");
        if(refNumber.length() > 1) 
            {    
                System.out.print("ZZZ");
            }
            else
                System.out.print(refNumber);
    }
    public void setRefNumber(String ref)
    {
       if (refNumber.length() >=3)
       {
            refNumber = "";
        }
        else
            System.out.print("Please enter a number with more than 3 digits");
           
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    public void borrow()
   {
        borrowed = borrowed + 1;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
}        
