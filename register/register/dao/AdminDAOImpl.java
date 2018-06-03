package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Admin;
import register.model.Book;
import register.model.Reader;
import register.model.Worker;

public class AdminDAOImpl implements AdminDAO{
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public AdminDAOImpl(){

	}

	public Connection getConnection(){
		Connection con=null;
		try{
			Class.forName(dbClassName);
			con=DriverManager.getConnection(dbUrl,dbUser,dbPwd);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return con;
	}
	public void updateAdmin(Admin admin){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update admin set 管理密码=?where 用户名="+admin.get用户名()+"");
			stmt.setString(1,admin.get管理密码());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	@Override
	public String validate(String 用户名,String 管理密码){
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from admin where 用户名='"+用户名+"'and 管理密码='"+管理密码+"'");
			if(rs.next()){
				role=rs.getString("角色");
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return role;
	}
	
	public void saveReader(Reader reader){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into reader(图书证号,登录密码,姓名,院系,班级,角色)values(?,?,?,?,?,?)");
			stmt.setString(1,reader.get图书证号());
			stmt.setString(2,reader.get登录密码());
			stmt.setString(3,reader.get姓名());
			stmt.setString(4,reader.get院系());
			stmt.setString(5,reader.get班级());
			stmt.setString(6,"读者");
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public void deleteReader(String 图书证号){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from reader where 图书证号=?");
			stmt.setString(1,图书证号);
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public void saveWorker(Worker worker){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into worker(工号,密码,角色)values(?,?,?)");
			stmt.setString(1,worker.get工号());
			stmt.setString(2,worker.get密码());
			stmt.setString(3,"工作人员");
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public void deleteWorker(String 工号){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from worker where 工号=?");
			stmt.setString(1,工号);
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("insert into book(书号,书名,作者,出版社,入库时间,是否借出)values(?,?,?,?,?,?)");
			stmt.setString(1,book.get书号());
			stmt.setString(2,book.get书名());
			stmt.setString(3,book.get作者());
			stmt.setString(4,book.get出版社());
			stmt.setString(5,book.get入库时间());
			stmt.setString(6,book.get是否借出());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update book set 书名=?,作者=?,出版社=?,入库时间=?,是否借出=?where 书号="+book.get书号()+"");
			stmt.setString(1,book.get书名());
			stmt.setString(2,book.get作者());
			stmt.setString(3,book.get出版社());
			stmt.setString(4,book.get入库时间());
			stmt.setString(5,book.get是否借出());
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	@Override
	public void deleteBook(String 书号) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("delete from book where 书号=?");
			stmt.setString(1,书号);
			stmt.execute();
			con.commit();
		}catch(Exception e){
			try{
				con.rollback();
			}catch(SQLException sqlex){
				sqlex.printStackTrace();
			}
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}