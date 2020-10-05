package com.java.learning.restfullspringbootapplication.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.java.learning.restfullspringbootapplication.entities.Friends;
import com.java.learning.restfullspringbootapplication.models.FriendsModel;

@Component
public class FriendsService {

	@Autowired
	private FriendsDao friendsDAO;

	public List<FriendsModel> getFriendsList() {

		List<FriendsModel> friendsList = new ArrayList<FriendsModel>();

		FriendsModel friend1 = new FriendsModel();
		friend1.setFriendId(1);
		friend1.setName("Antony");
		friend1.setAddress("Andhra");

		friendsList.add(friend1);

		FriendsModel friend2 = new FriendsModel();
		friend2.setFriendId(2);
		friend2.setName("Vinayak");
		friend2.setAddress("Nizambad");

		friendsList.add(friend2);

		if (friendsList != null && !friendsList.isEmpty()
				&& friendsList.size() > 0) {
			return friendsList;
		} else {
			return friendsList;
		}

	}

	public FriendsModel updateFriend(FriendsModel friendsmodel) {
		Friends friends = null;

		if (friendsmodel != null && friendsmodel.getFriendId() > 0) {
			throw new Exception("n details exists wit th given id");
		} else {

			friends = friendsDAO.findById(friendsmodel.getFriendId());

			if (friends != null) {
				// friends.setFriendId(friendsmodel.getFriendId());
				friends.setName(friendsmodel.getName());
				friends.setAddress(friendsmodel.getAddress());

			}

			friends = friendsDAO.save(friends);

		}

		return friendsmodel1;
	}
}
