package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Admin;
import register.model.Book;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddBookServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		Book book=new Book();
		AdminDAO adminDAO=new AdminDAOImpl();
		book.set书号(request.getParameter("书号"));
		book.set书名(request.getParameter("书名"));
		book.set作者(request.getParameter("作者"));
		book.set出版社(request.getParameter("出版社"));
		book.set入库时间(request.getParameter("入库时间"));
		book.set是否借出(request.getParameter("是否借出"));
		adminDAO.saveBook(book);
		request.setAttribute("book",book);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("AddBooksuccess.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
