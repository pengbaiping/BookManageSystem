package register.dao;
import register.model.Admin;
import register.model.Worker;
import register.model.Reader;
import register.model.Book;
public interface AdminDAO {
	public void saveWorker(Worker worker);//添加工作人员
	public void saveReader(Reader reader);//添加读者
	public void updateAdmin(Admin admin);//更新信息
	public void deleteWorker(String 工号);//删除工作人员信息
	public void deleteReader(String 图书证号);//删除读者信息
	public void saveBook(Book book);//图书入库
	public void updateBook(Book book);//更新图书信息
	public void deleteBook(String 书号);//图书下架
	public String validate(String 用户名,String 管理密码);
}
