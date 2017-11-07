package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import net.opentrends.garage.model.Login;
@Component
public class LoginValidation implements Validator {

	public boolean supports(Class<?> arg0) {

		return false;
	}

	public void validate(Object valid, Errors errors) {
     Login login = (Login) valid;
     String username = login.getUsername();
     String password = login.getPwd();
     if(username.isEmpty()){
    	 errors.rejectValue(username, "Invalid username");
     }if(password.isEmpty()){
    	 errors.rejectValue(password, "invalid password");
     }
		
	}

}
