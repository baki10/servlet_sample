package com.bakigoal;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet extends HttpServlet {

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>Demo Servlet</head>");
    out.println("<body>");
    out.println("<h1>Demo Servlet Get</h1>");
    out.println("</body>");
    out.println("</html>");
  }
}
