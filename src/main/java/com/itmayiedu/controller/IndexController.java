
package com.itmayiedu.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

	@RequestMapping("/indexController")
	public String indexController(Map<String, Object> result) {
		System.out.println("IndexController...index");
		result.put("name", "yushengjun");
		result.put("sex",0);
		List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("list");
		result.put("userlist", list);
		return "index";
	}

}
