package com.compliment.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="compliment")
public class Compliment {

    @javax.persistence.Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "compliment_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date complimentDate;

    public Compliment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getComplimentDate() {
        return complimentDate;
    }

    public void setComplimentDate(Date complimentDate) {
        this.complimentDate = complimentDate;
    }
}
