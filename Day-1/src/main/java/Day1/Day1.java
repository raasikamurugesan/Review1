package Day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Day1
{
  @GetMapping("/Welcome")
  @ResponseBody
 public String Welcome()
  {
	  return "Welcome to class";
  }
}
