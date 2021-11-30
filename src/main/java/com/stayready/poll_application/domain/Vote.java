package com.stayready.poll_application.domain;


import javax.persistence.*;


@Entity
public class Vote {
    @Id
    @GeneratedValue
    @Column(name = "VOTE_ID")
    private long Id;

    @ManyToOne
    @JoinColumn(name = "OPTION_ID")
    private Option option;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Option getOption() {
        return option;
    }

    public void setOption(Option option) {
        this.option = option;
    }
}
