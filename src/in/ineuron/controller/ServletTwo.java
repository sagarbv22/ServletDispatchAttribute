package in.ineuron.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check2")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Control in Servlet-2");
		PrintWriter out = response.getWriter();
		out.println("<center>");
		out.println("<h1>Attributes from ServletOne</h1>");
		out.println("<table border='1'><tr><th>AttributeName</th><td>AttributeValue</td></tr>");
		Enumeration<String> attributeNames = request.getAttributeNames();

		while (attributeNames.hasMoreElements()) {
			String name = (String) attributeNames.nextElement();
			Object value = request.getAttribute(name);
			System.out.println(name+" "+value);
			out.println("<tr>");
			out.println("<th>" + name + "</th><td" + value + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
	}

}
