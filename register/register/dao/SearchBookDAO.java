package register.dao;
import register.model.Book;
public interface SearchBookDAO {
	public Book listBookBy书名(String 书名);
	public Book listBookBy作者(String 作者);
	public Book listBookBy出版社(String 出版社);
	public Book listBookBy入库时间(String 入库时间);
}
