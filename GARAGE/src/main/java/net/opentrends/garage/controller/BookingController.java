package net.opentrends.garage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import net.opentrends.garage.dto.BookingDTO;
import net.opentrends.garage.service.BookingService;
import net.opentrends.garage.service.BrandService;
import net.opentrends.garage.service.CustomerService;
import net.opentrends.garage.service.ModelService;
import net.opentrends.garage.validator.BookingValidation;

@Controller
public class BookingController {
	@Autowired
	private BrandService brandService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private BookingService bookingService;
	@Autowired
	private BookingValidation bookingValidator;
	@RequestMapping(value = "/BookingValidation",method=RequestMethod.POST)
	public String BookingValidator(@ModelAttribute("command") @Validated BookingDTO bookingDto,BindingResult result,
			Model model) {
		bookingValidator.validate(bookingDto, result);
		if(result.hasErrors()){
			model.addAttribute("customerlist", customerService.listAll());
			return "search";
		}else{
            
			bookingService.save(bookingDto);
			model.addAttribute("customerlist", customerService.listAll());
			model.addAttribute("bookingmsg","Booking Successful");
			return "search";
			
		}
	}
}
