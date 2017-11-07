package net.opentrends.garage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.opentrends.garage.model.Login;
import net.opentrends.garage.validator.LoginValidation;
@Controller
public class LoginController {
	@Autowired
	private LoginValidation loginValidator;
		@RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView login() {
	      return new ModelAndView("login", "command", new Login());
	   }
	  @RequestMapping(value = "/validator", method = RequestMethod.POST)
      public String validator(@ModelAttribute("command") @Validated Login login,  BindingResult result, ModelMap model) {
		  loginValidator.validate(login, result);
		  if(result.hasErrors()){
			  return "login";
		  }else{
		  String strUserName = login.getUsername();
		  String strPwd = login.getPwd();
	      boolean validUser = false;
	    	  if(strUserName.equals("ann")&& strPwd.equals("password")){
	    		validUser=true;
	      }
	      if(validUser){
	    	  model.addAttribute("Welcome", login.getUsername());
              return "home";
	      }else{
	    	  model.addAttribute("msg","invalid username and password");
	      return "login";
	      }
	      }
      }
	     @RequestMapping(value="/logout",method=RequestMethod.GET)
	     public String logout(ModelMap model ){
			return "login";
	    	 
	     }
}
