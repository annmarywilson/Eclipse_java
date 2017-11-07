package net.opentrends.garage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import net.opentrends.garage.dto.BookingDTO;
import net.opentrends.garage.dto.ModelDTO;
import net.opentrends.garage.service.BookingService;
import net.opentrends.garage.service.BrandService;
import net.opentrends.garage.service.CustomerService;
import net.opentrends.garage.service.ModelService;
import net.opentrends.garage.validator.SearchValidation;
@Controller
public class searchController {
	@Autowired
	private BrandService brandService;
	@Autowired
	private ModelService modelService;
	@Autowired
	private BookingService bookingService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private SearchValidation searchValidator;
	
	@RequestMapping(value = "/search")
	public ModelAndView newSearchPage(Model model) {
		model.addAttribute("modellist",brandService.getAllBrands());
		return new ModelAndView("search", "command", new BookingDTO());
	}
	
	@RequestMapping(value = "/getModelById")
	@ResponseBody
	List<ModelDTO> getModelById(@RequestParam(name="brandId") int brandId) {
	    List<ModelDTO> modellist=modelService.getModelListById(brandId);
		return modellist;
	}
	
	@RequestMapping(value = "/SearchValidation", method = RequestMethod.POST)
	public String searchValidator(@ModelAttribute("command") @Validated BookingDTO bookingDto,BindingResult result,
			Model model,ModelMap modelmap) {
		String checkmsg=null;
		searchValidator.validate(bookingDto, result);
		if(result.hasErrors()){
			model.addAttribute("modellist", brandService.getAllBrands());
			return "search";
		}else{
			bookingDto=bookingService.setDates(bookingDto);
			//bookingDto=bookingService.findAvailable(bookingDto);
			int available = bookingService.findAvailable(bookingDto);
			String availablemsg="";
			if(available==0){
				availablemsg="<p class=\"error\">No vehicles available<p>";
			}else{
				availablemsg="<p class=\"success\">"+available+"Vehicles available";
				model.addAttribute("customerlist", customerService.listAll());
				checkmsg="success";
			}
		    model.addAttribute("availablemsg",availablemsg);
		    model.addAttribute("modellist", brandService.getAllBrands());
		    model.addAttribute("checkmsg", checkmsg);
		    modelmap.put("bookingDto", bookingDto);
			return "search";
		}
	}
}
