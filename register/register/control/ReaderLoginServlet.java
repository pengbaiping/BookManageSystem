package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.ReaderDAO;
import register.dao.ReaderDAOImpl;

public class ReaderLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		String 图书证号 = request.getParameter("图书证号");
		String 登录密码 = request.getParameter("登录密码");
		String role;
		String goForward;
		ReaderDAO readerDAO = new ReaderDAOImpl();
		role = readerDAO.validate(图书证号,登录密码);
		if(role.equals("读者")) {
		goForward = "Reader.jsp";
		}
		else {
			goForward="ReaderLogin.jsp";
		}
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher(goForward);
		requestDispatcher.forward(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}