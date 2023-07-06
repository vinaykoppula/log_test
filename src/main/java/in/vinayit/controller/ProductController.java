package in.vinayit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

	@GetMapping(value = { "/", "/loadForm" })
	public String loadForm() {
		return "index";
	}

	@PostMapping(value = "/data")
	public String handleSubmitButton(HttpServletRequest req, Model model) {
		// logic to save form data
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		String price = req.getParameter("price");
		System.out.println("Product Id : " + pid);
		System.out.println("Product Name :" + pname);
		System.out.println("Product price : " + price);
		model.addAttribute("msg", "Product Saved");
		return "success";
	}

}
