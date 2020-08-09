package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam String user, @RequestParam String password) {//Welcome page, non-rest]
		System.out.println("user ---------"+user);
		System.out.println("password ---------"+password);
		if(user.equals("parth") && password.equals("parth@123"))
			return "Welcome "+user+ " , login successful";
        return "Login failed. Please try again...";
    }
	
	
}
