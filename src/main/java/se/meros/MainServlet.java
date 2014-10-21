package se.meros;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import se.meros.methods.UserService;

import com.googlecode.jsonrpc4j.JsonRpcServer;

public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 2856903374369247329L;

	private UserService userService;
	private JsonRpcServer jsonRpcServer;

	public MainServlet() {
		userService = new UserService();
		jsonRpcServer = new JsonRpcServer(this.userService, UserService.class);
	}

	protected void doPost(
			HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse)
			throws ServletException, IOException {
		jsonRpcServer.handle(httpServletRequest, httpServletResponse);
	}
}
