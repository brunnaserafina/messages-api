package com.messages.api.service;

import com.messages.api.dto.TweetDTO;
import com.messages.api.model.Tweet;
import com.messages.api.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TweetService {
    @Autowired
    private TweetRepository repository;

    public void save(TweetDTO dto) {
        repository.save(new Tweet(dto));
    }

    public Page<Tweet> findAll(Pageable pageable) {
        Sort sort = pageable.getSort().and(Sort.by(Sort.Direction.DESC, "id"));
        PageRequest pageableWithSort = PageRequest.of(pageable.getPageNumber(), pageable.getPageSize(), sort);
        return repository.findAll(pageableWithSort);
    }

    public List<Tweet> getTweetsByUsername(String username) {
        return repository.findByUsername(username);
    }
}
