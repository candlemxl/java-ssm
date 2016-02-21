package test.controller;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import test.pojo.User;
import test.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser.do")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	
	@RequestMapping("/insert.do")
	public void toInsert(HttpServletRequest request){
		User user = new User();
		user.setAge(Integer.parseInt(request.getParameter("age")));
		user.setPassword(request.getParameter("pd"));
		user.setUserName(request.getParameter("un"));
		userService.insert(user);
	}
}
