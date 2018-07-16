package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

public class updateDB extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain;charset=utf-8");
		int score =Integer.parseInt(request.getParameter("score"));
		String username=request.getParameter("username");
		try {
			// //////////
			// do something
			// //////////
			DBConnection db = new DBConnection();
			db.execute("update users set score="+score+" where username='"+username+"'");
              db.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		int score=75;
		String username="hh";
		DBConnection db = new DBConnection();
		
		db.execute("update users set score="+score+" where username='"+username+"'");
		
		System.out.println("done");
		
	}
	
	
}
