package io.sys.application.controller;

import io.sys.application.domain.PubMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public PubMessage greeting(PubMessage message) throws Exception {
        System.out.println("message: " + message.getName());
        Thread.sleep(1000); // simulated delay
        return new PubMessage(HtmlUtils.htmlEscape(message.getName()) + " 님", message.getMessage());
    }
}
