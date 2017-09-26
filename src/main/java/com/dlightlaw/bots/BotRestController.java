package com.dlightlaw.bots;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BotRestController {
	
	@Autowired
	BotService botService;
	
	@CrossOrigin("*")
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(Map<String, Object> model) {
		return botService.test();
	}
}
