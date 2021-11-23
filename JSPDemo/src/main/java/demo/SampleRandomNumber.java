package demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
* Servlet implementation class SampleRandomNumber
*/
public class SampleRandomNumber extends HttpServlet
{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
response.setContentType("text/html");
PrintWriter out=response.getWriter();

out.println("Result is "+(int)(((Math.random())*6)+1)); // random number With in 6 except 0.

}
}

