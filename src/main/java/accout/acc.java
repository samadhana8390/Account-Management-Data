package accout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/acc")
public class acc extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse 
			response) throws ServletException, IOException 
	{
		response.setContentType("text.html");
		PrintWriter out=response.getWriter();
		
		String Acc_Name=request.getParameter("Acc_Name");
		String Acc_No=request.getParameter("Acc_No");
		String Contact=request.getParameter("Acc_No");
		String Email=request.getParameter("Email");
		String Acc_Type=request.getParameter("actype");
		String Address=request.getParameter("Address");
		String Gender=request.getParameter("optgender");
		String City=request.getParameter("City");
		
		out.print("<h1 style='color:green;'>");
		out.print("Account Name : "+Acc_Name);
		out.print("</h1> <br>");
		
		out.print("<h1 style='color:green;'>");
		out.print("Account No : "+Acc_No);
		out.print("</h1> <br>");

		
		out.print("<h1 style='color:green;'>");
		out.print("Email : "+Email);
		out.print("</h1> <br>");

		out.print("<h1 style='color:green;'>");
		out.print("Contact : "+Contact);
		out.print("</h1> <br>");

		out.print("<h1 style='color:green;'>");
		out.print("Account Type : "+Acc_Type);
		out.print("</h1> <br>");

		out.print("<h1 style='color:green;'>");
		out.print("Address : "+Address);
		out.print("</h1> <br>");

		out.print("<h1 style='color:green;'>");
		out.print("Gender : "+Gender);
		out.print("</h1> <br>");

		out.print("<h1 style='color:green;'>");
		out.print("City : "+City);
		out.print("</h1> <br>");

		

		
		
	}

}
