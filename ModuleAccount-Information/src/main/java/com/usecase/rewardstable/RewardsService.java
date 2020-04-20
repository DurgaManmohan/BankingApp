package com.usecase.rewardstable;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class RewardsService {
	
	@Autowired
    RewardsRepository rewardsRepository;

    public List<Rewards> getAllRewards() {
        List<Rewards> reward = new ArrayList<Rewards>();
        rewardsRepository.findAll().forEach(rewards -> reward.add(rewards));
        return reward;
    }

    public Rewards  getRewardsById(String userid) {
        return rewardsRepository.findById(userid).get();
    }

    public void saveOrUpdate(Rewards rewards) {
    	rewardsRepository.save(rewards);
    }

    public void delete(String userid) {
    	rewardsRepository.deleteById(userid);
    }

}
