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
<h2>Add Brand</h2>
      <form:form commandName="command" action="BrandValidation.htm">
      <table>
            <tr>
               <td><form:label path = "brandname">Brand Name</form:label></td>
               <td><form:input path = "brandname"></form:input></td>
               <td><form:errors path="brandname" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td><form:label path = "country">Country of Orgin</form:label></td>
               <td><form:input path="country"></form:input></td>
               <td><form:errors path="country" cssClass="error"></form:errors></td>
            </tr>
                     
         </table>  
 <input type = "submit" value = "Add"/>  
      </form:form><h2></h2>
</body>
</html>