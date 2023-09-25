package com.friendsbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.friendsbackend.demo.entity.Friend;
import com.friendsbackend.repositories.FriendsRepo;

@Service
public class FriendService implements FriendImpl{

	@Autowired
	private FriendsRepo repo;

	public List<Friend> getAllFriends() {
		return repo.findAll();
	}

	public void addFriend(Friend friend) {
		repo.save(friend);
	}

	public void updateFriend(Friend friend) {
		repo.save(friend);
	}

	public void deleteFriend(Integer id) {
		repo.deleteById(id);
	}

}
