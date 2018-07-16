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
		int score =Integer.parseInt(request.getParameter("id"));
		try {
			// //////////
			// do something
			// //////////
			DBConnection db = new DBConnection();
			db.execute("insert users(score) values("+score+")");
              db.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		int score=75;
		
		DBConnection db = new DBConnection();
		
		db.execute("insert users(score) values("+score+")");
		
		System.out.println("done");
		
	}
	
	
}
