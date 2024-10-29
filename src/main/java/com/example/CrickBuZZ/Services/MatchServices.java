package com.example.CrickBuZZ.Services;

import com.example.CrickBuZZ.Converter.MatchConverter;
import com.example.CrickBuZZ.model.match1;
import com.example.CrickBuZZ.repositoty.MatchRepository;
import com.example.CrickBuZZ.requestdto.MatchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MatchServices {
    @Autowired
    MatchRepository matchRepository;
    public match1 addMatch(MatchDto matchDto) {
        match1 match= MatchConverter.match1Converter(matchDto);
        return matchRepository.save(match);
    }

    public match1 getMatc() {
       Optional<match1>c1= matchRepository.findById(1);
       if(c1.isEmpty()){
           throw  new RuntimeException("No details are found");
       }
       return c1.get();
    }
}
