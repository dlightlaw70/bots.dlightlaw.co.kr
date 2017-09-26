package com.dlightlaw.bots;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
	
	@Autowired
	BotService botService;
	
	@CrossOrigin("*")
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String test(Map<String, Object> model) {
		return "index";
	}

}
