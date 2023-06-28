package com.messages.api.controller;

import com.messages.api.dto.TweetDTO;
import com.messages.api.model.Tweet;
import com.messages.api.service.TweetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping
    public Page<Tweet> getTweets(@PageableDefault(page = 0, size = 5) Pageable page){
        return service.findAll(page);
    }
}
