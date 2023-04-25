package com.skct.day1.cassEx1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DayIntro
{
@Value("${carname:creata}");
 public String car;
@GetMapping 
 @ResponseBody
 public String display();
 {
	 return "My fav car "+car;
 }
}
