package com.huge;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class Student_Controller2 extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	int id = Integer.parseInt(request.getParameter("Id"));
PrintWriter out=response.getWriter();
Student_Model s=new Student_Model();
students k=new students();
k=s.getInfo(id);
out.println(k);
String Result="Name: "+k.getstudents_name()+", Age: "+k.getAge()+", Gender: "+k.getGender();
request.setAttribute("result",Result);
request.getRequestDispatcher("info_view.jsp").forward(request,response);
	}
}
