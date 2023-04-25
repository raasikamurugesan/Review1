package com.skct.day1.cassEx1;

import org.springframework.stereotype.Controller;

@Controller
public class Welcome
{
	public String Welcome()
	{
		return"Welcome to REST API Class";
	}
}
