package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.opentrends.garage.dto.BookingDTO;
@Component
public class SearchValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}
	@Override
	public void validate(Object valid, Errors errors) {
        BookingDTO bookingDto=(BookingDTO) valid;
        if(bookingDto.getBrandId()==0){
			errors.rejectValue("brandId", "brand.empty", "select a brand");
        }if(bookingDto.getModelId()==0){
        	errors.rejectValue("modelId", "model.empty", "select model");
        }if(bookingDto.getF_Date().isEmpty()){
        	errors.rejectValue("F_Date", "fromDate.empty", "Enter starting date");
        }if(bookingDto.getT_Date().isEmpty()){
        	errors.rejectValue("T_Date", "toDate.empty", "enter ending date");
        }
	}

}
