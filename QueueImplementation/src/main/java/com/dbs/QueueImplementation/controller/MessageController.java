package com.dbs.QueueImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.model.Message;
import com.dbs.QueueImplementation.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@RequestMapping(value="/message/add",method=RequestMethod.POST)
	public Message getMessage(@RequestBody Message message) {
		
		
		return messageService.addMessage(message);
		
		
	}
	
}