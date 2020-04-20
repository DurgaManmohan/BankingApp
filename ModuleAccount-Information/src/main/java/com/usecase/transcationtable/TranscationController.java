package com.usecase.transcationtable;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranscationController {
	
	@Autowired
    TranscationService transcationService;

    @GetMapping("/transcations")
    private List<Transcation> getAllTranscations() {
    	System.out.println("In transcations GET");
        return transcationService.getAllTranscations();
    }

    @GetMapping("/transcations/{accountnumber}")
    private Transcation getTranscation(@PathVariable("accountnumber") int accountnumber) {
        return transcationService.getTranscationById(accountnumber);
    }

    @DeleteMapping("/transcations/{accountnumber}")
    private void deleteTranscation(@PathVariable("accountnumber") int accountnumber) {
        transcationService.delete(accountnumber);
    }

    @PostMapping("/transcations")
    private int saveTranscation(@RequestBody Transcation transcation) {
    	System.out.print("you have enetered transcations");
        transcationService.saveOrUpdate(transcation);
        return transcation.getAccountnumber();
    }

}
