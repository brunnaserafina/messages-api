package com.messages.api.controller;

import com.messages.api.dto.TweetDTO;
import com.messages.api.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/tweets")
public class TweetController {

    @Autowired
    private TweetService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void createTweet(@RequestBody TweetDTO req){
        service.save(req);
    }

}
