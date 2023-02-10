package in.ineuron.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check1")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Control in Servlet-1");
		request.setAttribute("username", "sagarbv");
		request.setAttribute("password", "sag");

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/check2");

		requestDispatcher.forward(request, response);

	}

}
