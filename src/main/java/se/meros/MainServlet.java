package se.meros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 2856903374369247329L;

	protected void doGet(HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
			throws ServletException, IOException {

		httpServletResponse.setContentType("text/plain");
		PrintWriter out = httpServletResponse.getWriter();
		out.println("This is a skeleton servlet built using gradle!");
		out.close();
	}
}
