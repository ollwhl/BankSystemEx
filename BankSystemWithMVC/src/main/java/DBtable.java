import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtable {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	String URL="jdbc:mysql://localhost/db_u316541?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8";
    private String user = "u316541";
    private String sqlPassword = "p316541";
    public int put(String name,Account account) throws ClassNotFoundException, SQLException {
    	Connection conn = null;
    	Statement stmt = null;
    	int count=0;
    	String searchSQL="SELECT * FROM customer2 WHERE name = '"+name+"'";
    	String insertSQL="insert into customer2 (name ,balance,password) values('"+name+"','"+account.showBalance()+"','"+account.getPassword()+"')";
    	String updateSQL="UPDATE customer2 "+"SET balance='"+account.showBalance()+"',password='"+account.getPassword()+"' WHERE name='"+name+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(java.lang.ClassNotFoundException e) {
		}
    	try {
    		conn=DriverManager.getConnection(URL,user,sqlPassword);
	    	stmt = conn.createStatement();
	        ResultSet rs=stmt.executeQuery(searchSQL);
	        if(rs.next()) {
	        	count=stmt.executeUpdate(updateSQL);
	        }else {
	        	count=stmt.executeUpdate(insertSQL);
	        }
	        if(count==0) return -1;
	        else return 0;
	        
    	}catch(SQLException ex) {
    		return -1;
    	}finally {
    		try {
    			if(stmt!=null) stmt.close();
    			if(conn!=null) stmt.close();
    		}catch(SQLException e) {
    			return -1;
    		}
    	}
    }
    public Account get(String name) {
    	Connection conn = null;
    	Statement stmt = null;
    	int count=0;
    	String searchSQL="SELECT * FROM customer2 WHERE name = '"+name+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(java.lang.ClassNotFoundException e) {
		}
    	try {
    		conn=DriverManager.getConnection(URL,user,sqlPassword);
	    	stmt = conn.createStatement();
	        ResultSet rs=stmt.executeQuery(searchSQL);
	        Boolean bool=rs.next();
	        if(bool) {
	        	int balance=rs.getInt("balance");
	        	String password=rs.getString("password");
	        	Account account=new Account(name,balance,password);
	        	return account;
	        }else {
	        	return null;
	        }

	        
    	}catch(SQLException ex) {
    		return null;
    	}finally {
    		try {
    			if(stmt!=null) stmt.close();
    			if(conn!=null) stmt.close();
    		}catch(SQLException e) {
    			return null;
    		}
    	}
    }
    public int remove(String name) {
    	Connection conn = null;
    	Statement stmt = null;
    	int count=0;
    	String deleteSQL="DELETE FROM customer WHERE name = '"+name+"'";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(java.lang.ClassNotFoundException e) {
		}
    	try {
    		conn=DriverManager.getConnection(URL,user,sqlPassword);
    		stmt = conn.createStatement();
    		count=stmt.executeUpdate(deleteSQL);
	        if(count==0) return -1;
	        else return 0;

	        
    	}catch(SQLException ex) {
    		return -1;
    	}finally {
    		try {
    			if(stmt!=null) stmt.close();
    			if(conn!=null) stmt.close();
    		}catch(SQLException e) {
    			return -1;
    		}
    	}
    }
}
