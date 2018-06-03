package register.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import register.dao.WorkerDAO;
import register.dao.WorkerDAOImpl;

public class WorkerLoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		String 工号 = request.getParameter("工号");
		String 密码 = request.getParameter("密码");
		String role;
		String goForward;
		WorkerDAO workerDAO = new WorkerDAOImpl();
		role = workerDAO.validate(工号,密码);
		if(role.equals("工作人员")) {
		goForward = "Worker.jsp";
		}
		else {
			goForward="WorkerLogin.jsp";
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