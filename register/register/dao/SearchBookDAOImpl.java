package register.dao;
import java.sql.*;
import java.util.*;
import register.model.Book;

public class SearchBookDAOImpl implements SearchBookDAO {
	private String dbClassName="com.mysql.jdbc.Driver";
	private String dbUrl="jdbc:mysql://localhost:3306/bms";
	private String dbUser="root";
	private String dbPwd="1505010604";
	public SearchBookDAOImpl(){

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
	@Override
	public Book listBookBy书名(String 书名) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where 书名="+书名+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set书号(rs.getString(1));
				book.set书名(rs.getString(2));
				book.set作者(rs.getString(3));
				book.set出版社(rs.getString(4));
				book.set入库时间(rs.getString(5));
				book.set是否借出(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy作者(String 作者) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where 作者="+作者+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set书号(rs.getString(1));
				book.set书名(rs.getString(2));
				book.set作者(rs.getString(3));
				book.set出版社(rs.getString(4));
				book.set入库时间(rs.getString(5));
				book.set是否借出(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy出版社(String 出版社) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where 出版社="+出版社+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set书号(rs.getString(1));
				book.set书名(rs.getString(2));
				book.set作者(rs.getString(3));
				book.set出版社(rs.getString(4));
				book.set入库时间(rs.getString(5));
				book.set是否借出(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
	@Override
	public Book listBookBy入库时间(String 入库时间) {
		// TODO Auto-generated method stub
		Book book=new Book();
		Connection con=null;
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try{
			con=getConnection();
			stmt=con.prepareStatement("select * from myuser where 入库时间="+入库时间+"");
			rs=stmt.executeQuery();
			if(rs.next()){
				book.set书号(rs.getString(1));
				book.set书名(rs.getString(2));
				book.set作者(rs.getString(3));
				book.set出版社(rs.getString(4));
				book.set入库时间(rs.getString(5));
				book.set是否借出(rs.getString(6));
			}
			rs.close();
			stmt.close();
			con.close();
		}catch(SQLException sqlex){
			sqlex.printStackTrace();
		}
		return book;
	}
}
