package com.messages.api.service;

import com.messages.api.dto.TweetDTO;
import com.messages.api.model.Tweet;
import com.messages.api.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public void save(TweetDTO dto) {
        repository.save(new Tweet(dto));
    }
}
