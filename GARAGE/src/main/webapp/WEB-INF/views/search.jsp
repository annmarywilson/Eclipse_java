<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>Search</title>

<script>
function getModel(){
    var brandName=document.getElementById("brandName").value;
    var model_options="";
    $.ajax({url: "getModelById?brandId="+brandName, success: function(result){
    	for (i = 0; i < result.length; i++) { 
    		model_options=model_options+"<option value='"+ result[i].modelid +"'>"+ result[i].modelno +"</option>";
		}  	  
    	console.log(model_options);
    	$("#model").html(model_options);
       }
    });
}
</script>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
<div align="center">

<form:form method="POST" commandName="command" action="${not empty checkmsg ? 'BookingValidation' : 'SearchValidation'}">
<table>
<tr><th colspan="2">Search Availablity</th></tr>
<tr><td colspan="2"><form:select path="brandId" name="brandName" id="brandName" onchange="getModel();">
<form:option value="0" label="Select Brand"/>
<c:forEach var="brand" items="${modellist}">
<form:option value="${brand.getBrandid()}" label="${brand.getBrandname()}"/>
</c:forEach>
</form:select>
<form:errors path="brandId" cssClass="error"/>
</td></tr>
<tr><td colspan="2"><form:select id="model" path="modelId" >
<option value="0" label="Select Model"/>
</form:select>
<form:errors path="modelId" cssClass="error"/>
</td></tr>
<tr><td colspan="2"><form:label path="F_Date">From Date</form:label></td></tr>
<tr><td colspan="2"><form:input type="date" path="F_Date"  />
<form:errors path="F_Date" cssClass="error"/>
</td></tr>
<tr><td colspan="2"><form:label path="T_Date">To Date</form:label></td></tr>
<tr><td colspan="2"><form:input type="date" path="T_Date" />
<form:errors path="T_Date" cssClass="error"/>
</td></tr>
<tr><td colspan="2"><input type="submit" value="Search"/></td></tr>
<tr><td colspan="2"><div align="center">${availablemsg }</div></td></tr>
</table>
</form:form>
</div>

<c:if test="${not empty checkmsg}">
<div  align="center">

<form:form  method="POST" action="BookingValidation" commandName="bookingDto">
<table>
<tr><td><form:select path="customerId">
<form:option value="0" label="Select Customer"/>
<c:forEach var="customer" items="${customerlist}">
<form:option value="${customer.getCustomerId()}" label="${customer.getCustomerName()}"></form:option>
</c:forEach>
</form:select>
<form:errors path="customerId" cssClass="error"/>
</td></tr>
<tr>
<td><form:hidden path="brandId" value="${bookingDto.getBrandId()}"/></td>
<td><form:hidden path="modelId" value="${bookingDto.getModelId()}"/></td>
<td><form:hidden path="T_Date" value="${bookingDto.getT_Date()}"/></td>
<td><form:hidden path="F_Date" value="${bookingDto.getF_Date()}"/></td>

</tr>
<tr><td><input type="submit" value="Book"></td></tr>
<tr><td colspan="2"></td></tr>
</table>
</form:form>
</div>
</c:if>
<table>
<tr>
<td >${bookingmsg}</td>
</tr>
</table>

</body>
</html>