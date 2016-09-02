import java.io.*;
import javax.servlet.*;
import javax.servlethttp.*;
public class Compute extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
{
int n1=Integer.ParseInt(req.getParameter("t1"));
int n2=Integer.ParseInt(req.getParameter("t2"));
int result=0;
String submit=req.getParameter("click");
System.out.println("Submit");
if(submit.equals("add"))
result=n1+n2;
else if (submit.equals("sub"))
result=n1-n2;
else if (submit.equals("mul"))
result=n1*n2;
else
result=n1/n2;
res.setContentType("text/html");
printWriter out=res.getWriter();
out.println("<html>");
out.println("<body>");
out.println("<h3> the result is "+result+"</h3>");
out.println("</body>");
out.println("</html>");
out.close();
}
}
