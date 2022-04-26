package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloworldController {
	@RequestMapping("/")
	private String index() {
		return "hello";
	}

	@GetMapping("/get-message")
//    private String getMessage(@RequestParam("message") String message, Model model) {
	private String getMessage(@RequestParam(required = false) String message, Model model) {
		model.addAttribute("message", message);
		return "get_message";
	}

	@GetMapping("/post-message")
	private String postMessage() {
		return "post_message";
	}

	@PostMapping("/confirm-message")
	private String confirmMessage(@RequestParam String message, Model model) {
		model.addAttribute("message", message);
		return "confirm_message";
	}
}
