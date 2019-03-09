package com.local.vkPoster.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Schedule {

    @Id
    @GeneratedValue
    private long id;
    private LocalDateTime time;

}
