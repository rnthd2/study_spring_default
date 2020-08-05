package le11;

import java.util.HashMap;
import java.util.Map;

public class BookDao {
	private Map<String, Book> bookDB = new HashMap<String, Book>();

	public void insert(Book book){
		bookDB.put(book.getTitle(), book);
	}
}
