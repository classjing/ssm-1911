package cn.zj.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zj.ssm.pojo.User;
import cn.zj.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/list")
	public String list(Model m) {
		
		List<User> users = userService.selectList();
		
		m.addAttribute("users", users);
		
		return "userList";
	}
	
	
	@RequestMapping("/insert")
	public String insert(User user) {
		
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/update")
	public String update(User user) {
		
		return "redirect:/user/list.do";
	}
	
	@RequestMapping("/delete")
	public String delete(Integer id) {
		
		userService.deleteByPrimaryKey(id);
		
		
		return "redirect:/user/list.do";
	}
}
