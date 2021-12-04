package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.OngoingCare;
import com.ENSF607.AnimalProject.repository.OngoingCareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OngoingCareService {

	@Autowired
	OngoingCareRepository ongoingCareRepository;
	
	public List<OngoingCare> searchByanimalId(Integer id){
		return ongoingCareRepository.findByanimalid(id);
	}
	
	public String add(OngoingCare care){
        ongoingCareRepository.save(care);
        return "Successfully added: Ongoing Care for animal: " + care.getAnimalid();
    }
	
}
