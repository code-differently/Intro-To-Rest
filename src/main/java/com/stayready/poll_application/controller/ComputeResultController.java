package com.stayready.poll_application.controller;

import com.stayready.poll_application.domain.Vote;
import com.stayready.poll_application.repositories.VoteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.inject.Inject;
//page 75
public class ComputeResultController {

    @Inject
    private VoteRepository voteRepository;

    @RequestMapping(value="/computeresult", method= RequestMethod.GET)
    public ResponseEntity<?> computeResult(@RequestParam Long pollId) {
        //Changed voteResult() to Vote to match domains
        Vote voteResult = new Vote();
        Iterable<Vote> allVotes = voteRepository.findByPoll(pollId);
        // Algorithm to count votes

        return new ResponseEntity<Vote>(voteResult, HttpStatus.OK);
    }
}
