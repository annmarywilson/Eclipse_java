<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
          <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>Add vehicle</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<div align="center">
<form:form method="POST" commandName="command" action="VehicleValidation.htm">
<table>
           <tr><th colspan="2">Add new vehicle</th></tr>
           <tr><td colspan="2"><form:select name="brandName" id="brandName" path="brandId">
           <form:option value="0" label="Select Brand"/>
           <c:forEach var="brand" items="${modellist}">
           <form:option value="${brand.getBrandid()}" label="${brand.getBrandname()}"/>
           </c:forEach>
               </form:select>
               <form:errors path="brandId" cssClass="error"></form:errors>
               </td></tr>
            <tr>
               <td><form:label path = "modelNumber">Model Number</form:label></td>
               <td><form:input path = "modelNumber"></form:input></td>
               <td><form:errors path="modelNumber" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td><form:label path = "stock">Stock</form:label></td>
               <td><form:input path="stock"></form:input></td>
               <td><form:errors path="stock" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td><form:label path = "rentperDay">Rent per day</form:label></td>
               <td><form:input path="rentperDay"></form:input></td>
               <td><form:errors path="rentperDay" cssClass="error"></form:errors></td>
            </tr>
</table>
<input type = "submit" value = "Add"/>  
      </form:form>
</div>
</body>
</html>