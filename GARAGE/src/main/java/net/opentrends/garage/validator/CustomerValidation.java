package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.opentrends.garage.model.Customer;
@Component
public class CustomerValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object valid, Errors errors) {
		Customer customer=(Customer) valid;
        String customerName=customer.getCustomerName();
        String place=customer.getPlace();
        
        if(customerName.isEmpty()){
       	 errors.rejectValue("customerName", "customername.empty", "empty field");
        }if(place.isEmpty()){
       	 errors.rejectValue("place", "place.empty", "empty field");
        }		
	}

}
