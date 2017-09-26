package com.dlightlaw.bots;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class BotService {
	
	
	public String test() {
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("src/main/resources/static/json/test.json"));
			ObjectMapper objectMapper = new ObjectMapper();
			Map<String,Object> map = new HashMap<String, Object>();
			String jsonString = new String(jsonData, "utf-8");
			map = objectMapper.readValue(jsonString, new TypeReference<Map<String, Object>>(){});
			return jsonString;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

}
