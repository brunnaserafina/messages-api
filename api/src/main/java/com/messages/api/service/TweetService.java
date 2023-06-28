package com.messages.api.service;

import com.messages.api.dto.TweetDTO;
import com.messages.api.model.Tweet;
import com.messages.api.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TweetService {
    List<Tweet> tweets = new ArrayList<>();

    @Autowired
    private TweetRepository repository;

    public void save(TweetDTO dto) {
        repository.save(new Tweet(dto));
        tweets.add(new Tweet(dto));
    }

    public Page<Tweet> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
