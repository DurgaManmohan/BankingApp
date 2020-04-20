package com.usecase.transcationtable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TranscationService {
	
	@Autowired
    TranscationRepository transcationRepository;

    public List<Transcation> getAllTranscations() {
        List<Transcation> transcations = new ArrayList<Transcation>();
        transcationRepository.findAll().forEach(transcation -> transcations.add(transcation));
        return transcations;
    }

    public Transcation  getTranscationById(int accountnumber) {
        return transcationRepository.findById(accountnumber).get();
    }

    public void saveOrUpdate(Transcation transcation) {
    	transcationRepository.save(transcation);
    }

    public void delete(int accountnumber) {
    	transcationRepository.deleteById(accountnumber);
    }

}
