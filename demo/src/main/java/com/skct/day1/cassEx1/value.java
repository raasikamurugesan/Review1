package com.skct.day1.cassEx1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class value 
{
	@Value("Hello world!")
	private String message()
	{
		System.out.println(message);
	}
}
