package com.stayready.poll_application.repositories;

import com.stayready.poll_application.domain.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

public interface VoteRepository extends CrudRepository<Vote, Long> {
    //@query uses a SQL query
    @Query(value="select v.* from Option o, Vote v where o.POLL_ID = ?1 and v.OPTION_ID = o.OPTION_ID", nativeQuery = true)

            public Iterable<Vote> findByPoll(Long pollId);



}