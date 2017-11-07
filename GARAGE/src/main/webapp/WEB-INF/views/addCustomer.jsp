<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Opentrends</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<h2>Add Customer</h2>
      <form:form commandName="command" action="CustomerValidation.htm">
      <table>
            <tr>
               <td><form:label path = "customerName">Customer Name</form:label></td>
               <td><form:input path = "customerName"></form:input></td>
               <td><form:errors path="customerName" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td><form:label path = "place">Place</form:label></td>
               <td><form:input path="place"></form:input></td>
               <td><form:errors path="place" cssClass="error"></form:errors></td>
            </tr>
                     
         </table>  
 <input type = "submit" value = "Add"/>  
      </form:form><h2></h2>
</body>
</html>