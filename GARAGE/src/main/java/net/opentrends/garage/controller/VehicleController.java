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
import net.opentrends.garage.dto.VehicleDto;
import net.opentrends.garage.service.BrandService;
import net.opentrends.garage.service.ModelService;
import net.opentrends.garage.validator.VehicleValidation;

@Controller
public class VehicleController {
    @Autowired
	private BrandService brandService;
    @Autowired
	private ModelService modelService;
	@Autowired
	private VehicleValidation vehicleValidator;
	@RequestMapping(value="/addVehicle")
	public ModelAndView vehicleDtoForm(Model model){
		model.addAttribute("modellist", brandService.getAllBrands());
		return new ModelAndView("addVehicle","command",new VehicleDto());
	}
	@RequestMapping(value = "/VehicleValidation", method = RequestMethod.POST)
	public String vehicleValidator(@ModelAttribute("command") @Validated VehicleDto vehicle, BindingResult result,
			Model model) {
		vehicleValidator.validate(vehicle, result);
		if(result.hasErrors()){
			model.addAttribute("modellist", brandService.getAllBrands());
			return "addVehicle";
		}else{
			modelService.addModel(vehicle);
			model.addAttribute("msg", "Vehicle entry succesfull");
			return "home";
		}
	}
    }
	


