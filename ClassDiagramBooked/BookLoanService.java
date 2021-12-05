public interface IPersistency{
 public List<BookItem> getBooks();
 public List<BookItem> getBooksByCriteria(String title, List<Author> authors, String subject, Date dateOfPublication, String Isbn);
 public void storeBook(Account account, BookItem bookItem);
 public List<BooksByAccount> getBookByAccount(Account account, BookStatus status);
 public List<FineByBookItem> getFines();
 public void setFine(Account account, BookItem bookItem);
}

public class MySqlPersistency implements IPersistency {

 public List<BookItem> getBooks(){}
 public List<BookItem> getBooksByCriteria(String title, List<Author> authors, String subject, Date dateOfPublication, String Isbn){}
 public void storeBook(Account account, BookItem bookItem){}
 public List<BooksByAccount> getBookByAccount(Account account, BookStatus status){}
 public List<FineByBookItem> getFines(){}
  public void setFine(Account account, BookItem bookItem){}
}

public interface IBookLoanService {
  public boolean loanBook(Account account, BookItem bookItem);

  public void returnABook(BookItem bookItem);

  public void reserveBook(Account account, BookItem source);

  public void markBook(Account account, BookItem source);

  public List<BookItem> searchBook(String title, List<Author> authors, String subject, Date dateOfPublication, String Isbn);

  public BooksByAccount getLoanedBookByAccount(Account account);

  public List<BooksByAccount> getLoanedBook();

  public BooksByAccount getReservedBookByAccount(Account account);

  public List<BooksByAccount> getReservedBook();

  public BooksByAccount getMarkedBookByAccount(Account account);

  public List<BooksByAccount> getMarkedBook();

  public List<FineByBookItem> getOpenFees();

}

public class BookLoanService implements IBookLoanService {
  private IPersistency persistency;

  public BookLoanService(IPersistency persistency){

  }

 public void returnABook(BookItem bookItem){

 }

  public List<BookItem> searchBook(String title, List<Author> authors, String subject, Date dateOfPublication, String Isbn){

  }

  public boolean loanBook(Account account, BookItem source) {

  }

  public void reserveBook(Account account, BookItem bookItem) {

  }

  public void markBook(Account account, BookItem source) {
  }

  public BooksByAccount getLoanedBookByAccount(Account account) {
  }

  public List<BooksByAccount> getLoanedBook() {
  }

  public BooksByAccount getReservedBookByAccount(Account account) {
  }

  public List<BooksByAccount> getReservedBook() {
  }

  public BooksByAccount getMarkedBookByAccount(Account account) {
  }

  public List<BooksByAccount> getMarkedBook() {
  }

  public List<FineByBookItem> getOpenFees(){

  }
}