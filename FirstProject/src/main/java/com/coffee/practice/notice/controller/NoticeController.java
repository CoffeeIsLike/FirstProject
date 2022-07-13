package com.coffee.practice.notice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.coffee.practice.notice.service.NoticeService;

@Controller
public class NoticeController {

	@Autowired
	private NoticeService service;
}
