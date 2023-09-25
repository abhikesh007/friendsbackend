package com.friendsbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.friendsbackend.demo.entity.Friend;
import com.friendsbackend.service.FriendImpl;

@RestController
@CrossOrigin
public class FriendController {

	@Autowired
	private FriendImpl friendImpl;

	@GetMapping("/friends")
	public List<Friend> getAllFriends() {
		System.out.println(friendImpl.getAllFriends());
		return friendImpl.getAllFriends();
	}

	@PostMapping("/addFriend")
	public void addFriend(@RequestBody Friend friend) {
		System.out.println(friend);
		friendImpl.addFriend(friend);
	}

	@PutMapping("/updateFriend/{id}")
	public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend) {
		friendImpl.updateFriend(friend);
	}

	@DeleteMapping("/deleteFriend/{id}")
	public void deleteFriend(@PathVariable("id") Integer id) {
		friendImpl.deleteFriend(id);
	}

}
