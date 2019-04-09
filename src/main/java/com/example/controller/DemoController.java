package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Employee;
import com.example.util.CustomValidationException;
import com.expamle.service.UserService;

import lombok.extern.log4j.Log4j;

@RestController
@CrossOrigin 
@Log4j
public class DemoController {

	@Autowired
	private UserService userService;

	Logger logger = LoggerFactory.getLogger(DemoController.class);


	@RequestMapping(value = "finduser", method = RequestMethod.GET, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Object findUser(HttpServletRequest req, HttpServletResponse res) {
		try {
		return new ResponseEntity<>(userService.finduser(Integer.parseInt(req.getParameter("id"))), HttpStatus.OK );
		} catch (CustomValidationException e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "createuser", method = RequestMethod.POST, consumes = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE }, produces = { MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Object createUser(HttpServletRequest req, HttpServletResponse res, @RequestBody Employee emp) {
		try {
		return userService.createUser(emp);
		} catch (CustomValidationException e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			return res;
		}
	}

	@RequestMapping(value = "finduserwithfname", method = RequestMethod.GET, consumes = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE }, produces = {
					MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	@ResponseBody
	public Object finduserwithfname(HttpServletRequest req, HttpServletResponse res) {
		try {
			return userService.finduserwithfname(req.getParameter("fname"), req.getParameter("fname"));
		} catch (CustomValidationException e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			return res;
		} catch (Exception e) {
			// TODO: handle exception
			logger.error("error occured : {}", e.getMessage());
			return res;
		}

	}
}
