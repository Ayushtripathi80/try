package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.DBConnect;

public final class PostRequirements_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "customerHeader.jspf", out, false);
      out.write("\n");
      out.write("        <h3>Customer</h3>\n");
      out.write("        <h2>Welcome ");
      out.print( session.getAttribute("username"));
      out.write("</h2>\n");
      out.write("       <h2>POST REQUIREMENTS</h2>\n");
      out.write("       \n");
      out.write("          ");

        try {
            if (session.getAttribute("username") == null) {
                response.sendRedirect("login.jsp");
            }
        } catch (Exception ex) {

        }
    
      out.write("\n");
      out.write("    <form> <table border=\"1\">\n");
      out.write("           <thead>\n");
      out.write("               <tr>\n");
      out.write("                   <th>Reqirement Of?</th>\n");
      out.write("               </tr>\n");
      out.write("           </thead>\n");
      out.write("           <tbody>\n");
      out.write("               <tr>\n");
      out.write("                   <td><select name=\"t1\" required>\n");
      out.write("                            <option>Electrician</option>\n");
      out.write("                                <option>Plumber</option>\n");
      out.write("                                <option>Painter</option>\n");
      out.write("                                <option>Carpenter</option>\n");
      out.write("                                <option>Medical</option>\n");
      out.write("                                <option>Other</option>\n");
      out.write("                       </select></td>\n");
      out.write("               </tr>\n");
      out.write("               <thead>\n");
      out.write("               <tr>\n");
      out.write("                   <th>DESCRIPTION</th>\n");
      out.write("               </tr>\n");
      out.write("           </thead>\n");
      out.write("               <tr>\n");
      out.write("                   <td><textarea name=\"t2\" rows=\"4\" cols=\"20\"   >\n");
      out.write("                       </textarea></td>\n");
      out.write("               </tr>\n");
      out.write("                <thead>\n");
      out.write("               <tr>\n");
      out.write("                   <th>Required ON DATE</th>\n");
      out.write("               </tr>\n");
      out.write("           </thead>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"date\" name=\"t3\" ></td>\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("                   <td><input type=\"submit\" value=\"SUBMIT\" name=\"b1\" /></td>\n");
      out.write("               </tr>\n");
      out.write("           </tbody>\n");
      out.write("       </table>\n");
      out.write("    </form>\n");
      out.write("       ");

        if(request.getParameter("b1")!=null)
        {
            
           DBConnect x = new DBConnect();
            x.queryExecuter(
          "insert into requirements(postbyname,postbyemail,mobile,servitortype,description,city,requireddate) values ('"+
                  session.getAttribute("username")+"','"+
                   session.getAttribute("useremail")+"','"+
                  session.getAttribute("usermobile")+"','"+
                   
                  request.getParameter("t1")+"','"+
                  request.getParameter("t2")+"','"+
                  session.getAttribute("usercity")+"','"+
                          request.getParameter("t3")+"')");
        out.println("Requirement  posted successfully");            
        }
        
        
        
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
