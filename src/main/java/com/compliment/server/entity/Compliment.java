package com.compliment.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="compliment")
public class Compliment {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Column(name = "compliment_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date complimentDate;

    public Compliment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
