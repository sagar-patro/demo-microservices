package com.sagarp.meetingRoom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MeetingRoomService {

	@Autowired
	private MeetingRoomRepository repository;

	public List<MeetingRoom> getAllMeetingRooms() {
		List<MeetingRoom> allMeetingRooms = new ArrayList<MeetingRoom>();
		repository.findAll().forEach(allMeetingRooms::add);
		return allMeetingRooms;
	}
}
