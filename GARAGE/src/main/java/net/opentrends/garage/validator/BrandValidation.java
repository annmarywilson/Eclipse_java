package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.opentrends.garage.model.Brand;
@Component
public class BrandValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object valid, Errors errors) {
         Brand brand=(Brand) valid;
         String brandname=brand.getBrandname();
         String country=brand.getCountry();
         
         if(brandname.isEmpty()){
        	 errors.rejectValue(brandname, "Invalid entry");
         }if(country.isEmpty()){
        	 errors.rejectValue(country, "invalid entry");
         }
         }
}

