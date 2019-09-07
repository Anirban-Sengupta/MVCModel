package mvcmodel;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("/login")
//	public String display(HttpServletRequest req,Model m)  
//    {  
//        String name=req.getParameter("name");  
//        String pass=req.getParameter("pass"); 
    public String display(@RequestParam("name")String name,@RequestParam("pass")String pass,Model m)  
    {  
        if(pass.equals("admin"))  
        {  
            String msg="Hello "+ name + ", you have successfully logged in";  
            m.addAttribute("message", msg);  
            return "viewpage";  
        }  
        else  
        {  
            String msg="Sorry " + name +". You entered an incorrect password. Please try again";  
            m.addAttribute("message", msg);  
            return "errorpage";  
        }     
    }  

}
