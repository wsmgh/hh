package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class insertDB extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain;charset=utf-8");
		String password=request.getParameter("password");
		String username=request.getParameter("username");
		
		System.out.println("insert users(username,password) values('"+username+"'"+","+"'"+password+"'"+")");
		
		try {
			// //////////
			// do something
			// //////////
			DBConnection db = new DBConnection();
			db.execute("insert users(username,password) values('"+username+"'"+","+"'"+password+"'"+")");
              db.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		String password="tt";
		String username="tt";
		DBConnection db = new DBConnection();
		
		db.execute("insert users(username,password) values('"+username+"'"+","+"'"+password+"'"+")");
		
		System.out.println("done");
		
	}
	
	
}
