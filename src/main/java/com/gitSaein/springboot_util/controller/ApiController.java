package com.gitSaein.springboot_util.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gitSaein.springboot_util.vo.ParamsVo;

@RestController
@RequestMapping("/api")
public class ApiController {

	@GetMapping(path="/{param1}")
	public String paramsFunc(@PathVariable String param1, ParamsVo paramsVo) {
		paramsVo.setParam1(param1);
		return paramsVo.getParam1();
	}
}
