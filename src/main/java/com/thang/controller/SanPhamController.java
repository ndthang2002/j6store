package com.thang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SanPhamController {
@RequestMapping("/sanpham")
public String index() {
	return "sanpham";
}
}
