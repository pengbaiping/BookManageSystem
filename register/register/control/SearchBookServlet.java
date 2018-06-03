package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import register.dao.AdminDAO;
import register.dao.AdminDAOImpl;
import register.dao.SearchBookDAO;
import register.dao.SearchBookDAOImpl;
import register.model.Book;
public class SearchBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String 条件=request.getParameter("条件");
		String 字段名=request.getParameter("字段名");
		Book book=new Book();
		SearchBookDAO searchbookDAO=new SearchBookDAOImpl();
		if(条件.equals("书名"))
		{
			
			book=searchbookDAO.listBookBy书名(条件);
			request.setAttribute("book", book);
		}
		if(条件.equals("作者"))
		{
			book=searchbookDAO.listBookBy作者(条件);
			request.setAttribute("book", book);
		}
		if(条件.equals("出版社"))
		{
			book=searchbookDAO.listBookBy出版社(条件);
			request.setAttribute("book", book);
		}
		if(条件.equals("入库时间"))
		{
			book=searchbookDAO.listBookBy入库时间(条件);
			request.setAttribute("book", book);
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("SearchBook.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}	
}
