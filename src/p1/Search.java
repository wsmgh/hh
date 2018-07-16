package p1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

import p1.DBConnection;

public class Search extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/plain;charset=utf-8");
		String user = request.getParameter("user");
		//System.out.println("id:" + student_id);
		
		try {
			////////////
			// do something
			////////////
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from users where username = '" +user+"'");
			

			String id = "";
			String score = "";
			String username = "";
			String password = "";
			//String c3 = "";
			//String c4="";
			//String an="";
			
			while(rs.next()){
				id=rs.getString(1);
				score=rs.getString(2);
				username=rs.getString(3);
				password=rs.getString(4);
//				c3=rs.getString(5);
//				c4=rs.getString(6);
//				an=rs.getString(7);
			}
			db.close();
			
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject obj = new JSONObject();
			
			obj.put("id", id);
			obj.put("score", score);
			obj.put("username", username);
			obj.put("password", password);
//			obj.put("c3", c3);
//			obj.put("c4", c4);
//			obj.put("an", an);
			
			System.out.println(obj.toString());
			out.print(obj.toString());
			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void doSearch(String student_id) {
		try {
			
			DBConnection db = new DBConnection();
			ResultSet rs = db.executeQuery("select * from qusetions where id = '" + student_id +"'");
			
			String id = "";
			String q = "";
			String c1 = "";
			String c2 = "";
			String c3 = "";
			String c4="";
			String an="";
			
			while(rs.next()){
				id=rs.getString(1);
				q=rs.getString(2);
				c1=rs.getString(3);
				c2=rs.getString(4);
				c3=rs.getString(5);
				c4=rs.getString(6);
				an=rs.getString(7);
			}
			db.close();
			
			JSONObject obj = new JSONObject();
			
			obj.put("id", id);
			obj.put("q", q);
			obj.put("c1", c1);
			obj.put("c2", c2);
			obj.put("c3", c3);
			obj.put("c4", c4);
			obj.put("an", an);
			
			System.out.println(obj.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		doSearch("1");
	}

}
