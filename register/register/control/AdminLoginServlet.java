package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.AdminDAO;
import register.dao.AdminDAOImpl;

public class AdminLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		String 用户名 = request.getParameter("用户名");
		String 管理密码 = request.getParameter("管理密码");
		String role;
		String goForward;
		AdminDAO adminDAO = new AdminDAOImpl();
		role = adminDAO.validate(用户名,管理密码);
		if(role.equals("管理员")) {
		goForward = "Admin.jsp";
		}
		else {
			goForward="AdminLogin.jsp";
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