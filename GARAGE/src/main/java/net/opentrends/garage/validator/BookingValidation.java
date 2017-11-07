package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import net.opentrends.garage.dto.BookingDTO;
@Component
public class BookingValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object validate, Errors errors) {
		BookingDTO bookingDto=(BookingDTO)validate;
		if(bookingDto.getCustomerId()==0) {
			errors.rejectValue("customerId", "customer.empty","select a customer");
		}
	}
}
