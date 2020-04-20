package com.usecase.rewardstable;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RewardsController {
	
	@Autowired
    RewardsService rewardsService;

    @GetMapping("/rewards")
    private List<Rewards> getAllRewards() {
        return rewardsService.getAllRewards();
    }

    @GetMapping("/rewards/{userid}")
    private Rewards getRewards(@PathVariable("userid") String userid) {
        return rewardsService.getRewardsById(userid);
    }

    
	@DeleteMapping("/rewards/{userid}")
    private void deleteRewards(@PathVariable("userid") String userid) {
        rewardsService.delete(userid);
    }

    @PostMapping("/rewards")
    private String saveRewards(@RequestBody Rewards rewards) {
        rewardsService.saveOrUpdate(rewards);
        return rewards.getUserid();
    }
	
	

}
