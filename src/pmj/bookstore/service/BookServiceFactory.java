package pmj.bookstore.service;

public class BookServiceFactory {
	
	public static BookService getService() {
		return new BookServiceImpl();
	}
	
}
