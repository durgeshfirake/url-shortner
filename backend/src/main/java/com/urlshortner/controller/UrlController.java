package com.urlshortner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UrlController {

	@PostMapping
	public String shorten() {
		return "OK";
	}
}
