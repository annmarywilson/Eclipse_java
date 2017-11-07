package net.opentrends.garage.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.model.Customer;
@Component
public class VehicleValidation implements Validator{

	@Override
	public boolean supports(Class<?> arg0) {
		return false;
	}

	@Override
	public void validate(Object valid, Errors errors) {

		VehicleDto vehicleDto=(VehicleDto) valid;
		int brandId = vehicleDto.getBrandId();
        String modelNumber=vehicleDto.getModelNumber();
        Integer stock=vehicleDto.getStock();
        int rentPerday=vehicleDto.getRentperDay();
        
        if(brandId==0){
       	errors.rejectValue("brandId","brand.empty", "Enter a brand");
        }if(modelNumber.isEmpty()){
       	 errors.rejectValue(modelNumber, "invalid entry");
        }
        if(rentPerday==0){
        	errors.rejectValue("rentperDay", "rent.empty", "enter rent");
        }
        
        if(stock==0){
        	errors.rejectValue("stock", "stock.empty", "invalid stock");
        }
	}	
	}


