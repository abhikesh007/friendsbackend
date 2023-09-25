package com.friendsbackend.service;

import java.util.List;

import com.friendsbackend.demo.entity.Friend;

public interface FriendImpl {
	
	public List<Friend> getAllFriends();

	public void addFriend(Friend friend);

	public void updateFriend(Friend friend);
	
	public void deleteFriend(Integer id);
}
