package com.java.learning.restfullspringbootapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.learning.restfullspringbootapplication.models.FriendsModel;
import com.java.learning.restfullspringbootapplication.service.FriendsService;

@RestController
@RequestMapping("/facebook/friends")
public class FriendsController {
	@Autowired
	FriendsService friendsService;

	@GetMapping("/list")
	public List<FriendsModel> getFriendsList() {

		return friendsService.getFriendsList();
	}

	@PutMapping("{friendId}/update")
	public FriendsModel updateFriend(@PathVariable("friendId") int friendId,
			@RequestBody FriendsModel friendsmodel) {
		
		friendsmodel.setFriendId(friendId);

		return friendsService.updateFriend(friendsmodel);

	}

}
