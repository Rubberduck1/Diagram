public class Source {
  private String title;
  private String subject;
  private String publicationDate;
  private String publisher;
  private String city;
  private String language;
  private List<Author> authors;

  public Source(String title, String subject, String publicationDate, String publisher, String city, String language,
      List<Author> author) {

  }
}

public class Book extends Source {
  private String isbnNumber;

  public Book(String title, String subject, String publicationDate, String publisher, String city, String language,
      List<Author> author, String isbn) {
    super(title, subject, publicationDate, publisher, city, language, author);
  }
}

public class Article extends Source {
  private String page;

  public Article(String title, String subject, String publicationDate, String publisher, String city, String language,
      List<Author> author, String page) {
    super(title, subject, publicationDate, publisher, city, language, author);
  }
}

public class Journal extends Source {
  private String volume;
  private String issue;

  public Journal(String barcode, String title, String subject, String publicationDate, String publisher, String city,
      String language, List<Author> author, String volume, String issue) {
    super(title, subject, publicationDate, publisher, city, language, author);
  }
}

public class OnlineDocument extends Source {
  private String url;

  public OnlineDocument(String barcode, String title, String subject, String publicationDate, String publisher,
      String city, String language, List<Author> author, String url) {
    super(title, subject, publicationDate, publisher, city, language, author);
  }
}

public class BookItem {
  private String barcode;
  private Date dateCurrentState;
  private double purchasedPrice;
  private BookFormat format;
  private BookStatus status;
  private Date dateOfPurchase;
  private Rack placedAt;

  public BookItem(Source source, String barcode, Date dateCurrentState, BookStatus status) {

  }

  public BookItem(Source source, String barcode, Date dateCurrentState, BookStatus status, Rack rack) {

  }
}

public class Rack {
  private int number;
  private String locationIdentifier;
}

public class BooksByAccount {
  private Account account;
  private List<BookItem> bookItems;

  public LoanedBooksByAccount(Account account, List<BookItem> bookItem) {

  }
}

public class FineByBookItem {
  private Account account;
  private BookItem bookItem;
  private double fine;

  public FineByBookItem(Account account, BookItem bookItem, double fine) {

  }
}