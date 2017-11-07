package net.opentrends.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import net.opentrends.garage.model.Customer;
import net.opentrends.garage.service.CustomerService;
import net.opentrends.garage.validator.CustomerValidation;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@Autowired
	private CustomerValidation customerValidator;
	@RequestMapping(value = "/addCustomer", method = RequestMethod.GET)
	   public ModelAndView customer() {
	      return new ModelAndView("addCustomer", "command", new Customer());
	   }
	
	  @RequestMapping(value = "/CustomerValidation", method = RequestMethod.POST)
   public String validator(@ModelAttribute("command") @Validated Customer customer,  BindingResult results, Model model) {
		  customerValidator.validate(customer, results);
		  if(results.hasErrors()){
			  return "addCustomer";
}else{
	customerService.save(customer);
	  model.addAttribute("msg","Customer entry succesful");
    	return "home";
	}
}
}
