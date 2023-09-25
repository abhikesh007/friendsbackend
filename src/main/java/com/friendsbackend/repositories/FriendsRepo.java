package com.friendsbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.friendsbackend.demo.entity.Friend;

@Repository
public interface FriendsRepo extends JpaRepository<Friend, Integer> {

}
