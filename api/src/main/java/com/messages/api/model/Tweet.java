package com.messages.api.model;

import com.messages.api.dto.TweetDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
    public Tweet(TweetDTO dto, String avatar) {
        this.avatar = avatar;
        this.username = dto.username();
        this.tweet = dto.tweet();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String username;

    @Column
    private String avatar;

    @Column
    private String tweet;

}
