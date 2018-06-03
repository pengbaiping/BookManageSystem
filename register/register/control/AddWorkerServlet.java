package register.control;
import register.dao.AdminDAOImpl;
import register.dao.AdminDAO;
import register.model.Admin;
import register.model.Worker;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;


public class AddWorkerServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从视图index.jsp读取请求参数
		Worker worker=new Worker();
		AdminDAO adminDAO=new AdminDAOImpl();
		worker.set工号(request.getParameter("工号"));
		worker.set密码(request.getParameter("密码"));
		worker.set角色("工作人员");
		adminDAO.saveWorker(worker);
		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("Admin.jsp");
		requestDispatcher.forward(request, response);
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
}
