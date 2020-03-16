/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
 public class AjaxServlet extends HttpServlet {

     
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
        //show the table of number 
        
        String friends[] ={"amit","suresh","mukesh","ganesh","mohan","sohan","ramakant","anit",
            "babita","monika"};
        
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op=request.getParameter("op");
        
        if(op!=null && op.equalsIgnoreCase("table")){
        int n =Integer.parseInt(request.getParameter("n"));
        for(int i=1;i<=10;i++)
            out.println("<br/>" + (n*i));    
        }
    
    if (op!=null && op.equalsIgnoreCase("sqr") ){
         int n =Integer.parseInt(request.getParameter("n"));
         out.println(n*n);
    }
    if (op!=null && op.equalsIgnoreCase("search")){
        String name = request.getParameter("name");
        for (String s : friends)
            if (s.contains(name))
                out.println("<option value=\""+ s +"\"></option>");
    }
    
    
    if(op!=null && op.equalsIgnoreCase("loadcity")){
        int state_id = Integer.parseInt(request.getParameter("sid"));
        
          Connection con = null;
          PreparedStatement smt = null;
          try { 
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "root");
                String sql = "select * from cities where sid=?";
                smt = con.prepareStatement(sql);
                smt.setInt(1, state_id);
                                
                ResultSet rs = smt.executeQuery();
                String output = "<option value='-1'>Select City </option>";
                while (rs.next()) { 
                    output += "<option value='"+rs.getString("cid")+"'>"+ rs.getString("city_name") +"</option>";
                }
                out.println(output); 
                                 
                con.close();
                smt.close();

                } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
                }
    }
    

        
    
    if(op!=null && op.equalsIgnoreCase("searchsubject"))
    {
        int courseid=Integer.parseInt(request.getParameter("courseid"));
        String output="";
        Connection con=null;
        PreparedStatement smt=null;
        try{
             Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "root");
                String sql = "select name from subject where id in(select subject_id from scr where course_id=?)";
                smt = con.prepareStatement(sql);
                smt.setInt(1,courseid);
                ResultSet rs=smt.executeQuery();
                output="<h2>Subjects are :</h2><br> <ul>";
                while(rs.next())
                {
                    output+="<li>"+rs.getString("name")+"</li>";
                    
                }
                
                output+="</ul>";
                out.println(output);
                con.close();
                smt.close();
                
          
            } catch (Exception e) {
                     System.out.println("Error " + e.getMessage());
                    }
        
    }
 }
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
}