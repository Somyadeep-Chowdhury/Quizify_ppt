package com.stackroute.quizify.userregistrationservice.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document(collection = "users")
@Data
public class User {
    @Id
    private long id;
    private String name;
    private String emailId;
    @Transient
    private String password;
    private List<Topic> topics;
    private List<Genre> genres;
    private List<Game> gamesPlayed;
    private String gender;
}
