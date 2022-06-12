<%-- 
    Document   : student
    Created on : Jun 11, 2022, 11:26:23 PM
    Author     : Nhat Anh
--%>

<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript">
            function doDetele(Code){
                if(confirm("are U sure to delete Student with code"+code)){
                    window.location="delete?code"+code;
                }
            }
        </script>
    </head>
    <body>
        <h1><a href="add.jsp">Add Student</a></h1>
        <table border="1">
            <tr>
            <th>CODE</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>Birth_Day</th>
            <th>EMAIL</th>
            <th>Mobile Phone</th>
         </tr>
          
           
              <%
                                    List<Student> list = (List<Student>) request.getAttribute("listC");
                                    for (Student o : list) {
                                %>
           <tr>
            <td><%=o.getCode()%></td>
             <td><%=o.getName()%></td>
             <td><%=o.getGender()%></td>
             <td><%=o.getBirth_Day()%></td>
             <td><%=o.getEmail()%></td>
             <td><%=o.getMobilePhone()%></td>
                      
             <td>
                 <a href="#">Edit</a>
             </td>
             <td> <a href="#" onclick="doDetele('<%=o.getCode()%>')">Detele</a></td>
             </tr>
            <% }%>
            
        </table>
            
                    
                    
    </body>
</html>
