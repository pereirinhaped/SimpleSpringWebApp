package com.pluralsight.spring.simpleWebApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.spring.simpleWebApp.model.ContactInfo;
import com.pluralsight.spring.simpleWebApp.model.User;
import com.pluralsight.spring.simpleWebApp.model.UserInfo;

@RestController
@RequestMapping("users")
public class UserServiceImpl implements UserService {

	@Override
	@RequestMapping(path = "/userinfo/", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<UserInfo> getUserInfo(@RequestBody User user) {

		UserInfo ui = new UserInfo();
		ui.setInformation(user.toString());

		return new ResponseEntity<>(ui, HttpStatus.OK);
	}

	@Override
	@RequestMapping(value = "/simpleuser/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<User> getSimpleUser() {
		ContactInfo c = new ContactInfo();
		c.setEmail("pereirinhaped@gmail.com");
		c.setCity("Lisboa");
		c.setCountry("Portugal");

		User u = new User();
		u.setFirstName("Pedro");
		u.setLastName("Pereirinha");
		u.setContact(c);
		
		System.out.println();
		
		return new ResponseEntity<>(u, HttpStatus.OK);
	}

}
