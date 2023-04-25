package Day1Class1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day1Class1
{
	  public String name="IamNEO";
	  @GetMapping("setName")
	  public String getName()
	  {
		return "Welcome "+name;  
      }
}
