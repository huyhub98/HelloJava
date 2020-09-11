package com.trungtamjava.springbootdemo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.trungtamjava.springbootdemo.dao.UserRepository;
import com.trungtamjava.springbootdemo.entity.User;

@Controller
public class UserController {
//	@Autowired
//	private UserDao userDao;
//	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/user/add")
	public String addUser() {
		return "add-user";
	}

	@PostMapping("/user/add")
	public String addUser(@RequestParam(value = "age") int age, @RequestParam(value = "name") String name) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

		// userDao.add(user);
		userRepository.save(user);

		return "redirect:/user/search";
	}

	// map thang vao model, thuoc tinh model trung ten voi input name
	@PostMapping("/user/add-model")
	public String addUser(@ModelAttribute User user) {
//		userDao.add(user);
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		userRepository.save(user);
		return "redirect:/user/search";
	}

	@GetMapping("/user/search")
	public String searchUser(HttpServletRequest req,
			@RequestParam(value = "keyword", required = false) String keyword) {
		if (keyword == null) {
			keyword = "";
		}
		List<User> userList = userRepository.search("%" + keyword + "%");
		// tuong tu jsp forward
		req.setAttribute("users", userList);

		return "search-user";
	}

	@GetMapping("/user/update")
	public String update(@RequestParam(value = "id") int id, Model model) {
		model.addAttribute("user", userRepository.getOne(id));
		return "update-user";
	}

	// map thang vao model, thuoc tinh model trung ten voi input name
	@PostMapping("/user/update")
	public String update(@ModelAttribute User user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		userRepository.save(user);
		return "redirect:/user/search";
	}

	@GetMapping("/user/delete")
	public String delete(@RequestParam(value = "id") int id) {
		userRepository.deleteById(id);
		return "redirect:/user/search";
	}

	// dung path variable
	@GetMapping("/user/delete/{id}")
	public String deletePath(@PathVariable(value = "id") int id) {
		userRepository.deleteById(id);
		return "redirect:/user/search";
	}

}
