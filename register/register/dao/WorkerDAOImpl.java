package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Worker;

public class WorkerDAOImpl implements WorkerDAO{
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public WorkerDAOImpl(){

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

	

	public void updateWorker(Worker worker){
		Connection con=null;
		PreparedStatement stmt=null;
		try{
			con=getConnection();
			con.setAutoCommit(false);
			stmt=con.prepareStatement("update worker set √‹¬Î=?where π§∫≈="+worker.getπ§∫≈()+"");
			stmt.setString(1,worker.get√‹¬Î());
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
	public String validate(String π§∫≈, String √‹¬Î) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		String role="";
		try{
			con=getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from worker where π§∫≈='"+π§∫≈+"'and √‹¬Î='"+√‹¬Î+"'");
			if(rs.next()){
				role=rs.getString("Ω«…´");
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return role;
	}
	
}