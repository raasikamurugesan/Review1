package com.example.demo.ValueAnn;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ValueAnn
{
	@Value("${carname}")
   public String car;
   @GetMapping("hi")
	@ResponseBody
   public String display()
   {
	   return "My fav car "+car;
   }
}
