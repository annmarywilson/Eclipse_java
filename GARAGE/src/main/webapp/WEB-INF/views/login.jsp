<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
   <head>
      <title>Garage-Rental Services</title>
      <style type="text/css">
.error {
	color: red;
}
</style>
   </head>

   <body>
      <h2>Users Login</h2>
      <form:form commandName="command" action="validator.htm">
		<table>
            <tr>
               <td><form:label path = "username">Username</form:label></td>
               <td><form:input path = "username"></form:input></td>
               <td><form:errors path="username" cssClass="error"></form:errors></td>
            </tr>
            <tr>
               <td><form:label path = "pwd">Password</form:label></td>
               <td><form:password path="pwd"></form:password></td>
               <td><form:errors path="pwd" cssClass="error"></form:errors></td>
            </tr>
                     
         </table>    
 <input type = "submit" value = "Login"/>  
      </form:form><h2></h2>
      <h2>${msg}</h2>
   </body>
</html>
