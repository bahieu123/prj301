<%-- 
    Document   : add
    Created on : Jun 11, 2022, 11:26:30 PM
    Author     : Nhat Anh
--%>
<%@page import="java.util.List"%>
<%@page import="model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="add" method="GET">
            <ul>
                <li>
                   <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">RollNo</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="rollno" >
                    </select>
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">Code</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="code" >
                    </select>
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">Name</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="name" >
                    </select>
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">Gender</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="gender" >
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">Birth_Day</div>
                    <input type="date" style="width: 706px;height: 22px;border: 1px solid grey;" name="birth" >
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">Email</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="email" >
                </li>
                <li>
                    <div style="font-weight: bold; font-family: Arial, Helvetica, sans-serif;">MobilePhone</div>
                    <input type="text" style="width: 706px;height: 22px;border: 1px solid grey;" name="phone" >
                </li>
                
                <div style="display: flex;">
                    <button type="button"  >Add Student</button>
                    <button style="background-color: #e6d08a" type="reset" id="reset_btn">Reset</button>
                </div>
            </ul>
        </form>
    </body>
</html>

