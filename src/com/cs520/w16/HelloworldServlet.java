package com.cs520.w16;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloworldServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, krunal");
	}
}
