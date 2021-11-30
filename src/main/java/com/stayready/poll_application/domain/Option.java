package com.stayready.poll_application.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Option {

    @Id
    @GeneratedValue
    @Column(name = "OPTION_ID")
    private long Id;

    @Column(name = "OPTION_VALUE")
    private String value;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
