package com.sagarp.meetingRoom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingRoomController {
	@Autowired
	private MeetingRoomService meetingRoomService;

	@RequestMapping(value = "/meetingroom", method = RequestMethod.GET)
	public List<MeetingRoom> getAllMeetingRoom() {
		return meetingRoomService.getAllMeetingRooms();
	}
}
