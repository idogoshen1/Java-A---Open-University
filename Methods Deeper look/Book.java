
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private string _title;
    private String _author;
    private int _yearPublished;
    private int _noOfPages;
    private boolean _borrowed;
    private String _studentName;
    private Date _borrowDate;
    private Date retuenDate;
    private final int BORROWEDMAX_DAYS=30;
    private final int FINRFOR_DAY= 5;

    public Book (String title, String author, int yearPublished, int noOfPages) {
        if(this._title= this._author
        &&( this._yearPublished>999 && this._yearPublished<2018) 
        && this._noOfPages>0) {
        }else{
            return (this._title && this._author)= null;
            this._borrowed= false;
            _yearPublished==2000 && noOfPages==1;
        }
    }
}
public Book(Book other) {
this._tile=other.getTitle;
this._author= other.getAuthor();
this._yearPublished= other.getYearPublished();
this._noOfPages= other.getNoOfPages();
this._borrowed= other.getBorrowed();
this._studentName= other.getStudentName();
this._borrowedDate= other.getBorrowDate();
this._returnDate= other.getReturnDate();
}
public String getTitle() {
return this._title;
}
public String getTitle() {
public String getAothor() {
retuen this._author;
}
public int getYear() {
return this.year();
}
public int getPages() {
return this._pages;
}

public boolean getBorrowed() {
    retuen this._borrowed;
}
public String getStudentName() {
    return this._studentName;
}
public Date getReturnDate() {
    return this._returnDate;
}
public Date getBorrowDate() {
    return this._borrowDate;
}
public void setTitke(String s) {
    this._title= title;
}
public void setAouthor(String s) {
    this._author= author;
}
public void setYear(int n) {
    this._year= year;
}
public void setPages(int n) {
    this._pages=pages;
}
public boolean equals(Book other) {
    if(this._title== othe.getTitle() &&
    this._author== other.getAuthor() &&
    this._yearPublished== other.getYearPublshed() &&
    this._noOfPages== other.gerNoOfPages() {
        return true;
    }else{
        retuen false;
    }
    public boolean olderBook(Book other) {
       if(this._yearPulished.after(other.getYearPublished()) == true {
        }
        return false;
    public boolean sameAuthor(Book other) {
        if(this._author.equals(other.getAuthor()) == true {
        }
        return false;
    }
}
   public String toString() {
       return(this._title + "Title: " + "\t" + this._author + "Author: " + "\t" + this._year + " Year: ") 
    }
    
       


    

              
           
       

