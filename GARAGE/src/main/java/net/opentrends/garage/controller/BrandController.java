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
import net.opentrends.garage.model.Brand;
import net.opentrends.garage.service.BrandService;
import net.opentrends.garage.validator.BrandValidation;

@Controller
public class BrandController {
	@Autowired
	private BrandService brandService;
	@Autowired
	private BrandValidation brandValidator;
	@RequestMapping(value = "/addBrand", method = RequestMethod.GET)
	public ModelAndView brand() {
	   return new ModelAndView("addBrand", "command", new Brand());
    }
   @RequestMapping(value = "/BrandValidation", method = RequestMethod.POST)
   public String validator(@ModelAttribute("command") @Validated Brand brand,BindingResult result, Model model) {
		  brandValidator.validate(brand, result);
		  if(result.hasErrors()){
		  return "addBrand";
    }else{
	brandService.addBrand(brand);
	model.addAttribute("msg","Brand entry succesfull");
	return "home";
	}
    }
}