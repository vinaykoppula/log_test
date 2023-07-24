package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
	@RequestMapping("/hello")
    @ResponseBody
	public String getTodoResponse()
    {
        return "todoresponse";
    }

}
