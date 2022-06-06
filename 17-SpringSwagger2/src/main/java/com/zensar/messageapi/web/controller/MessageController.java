package com.zensar.messageapi.web.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.zensar.messageapi.entity.Message;

@Controller
public class MessageController {

	private List<Message> messages;

    public MessageController()
    {
        this.messages = new ArrayList<Message>();
        Message m1 = new Message();
        m1.setId(1);
        m1.setMessage("Good Morning");
        this.messages.add(m1);
    }
    
    @GetMapping("/message")
    public String showAllMessages(Model m) 
    {
    	// In following statement all messages is used in html file to fetch values
    	m.addAttribute("allMessages", this.messages);
    	return "messages"; // This String is html page name
    }
	
	@GetMapping("/welcome")
	public String home(Model m) 
	{
		// Here we are returning name of html page (thymeleaf template)
		// This template must be present in src/main/resource/templates folder
		System.out.println("In Home");
		m.addAttribute("name", "Zensar India");
		// return "index";
		throw new RuntimeException();
	}
    
}