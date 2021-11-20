package com.ENSF607.AnimalProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ENSF607.AnimalProject.model.OngoingCare;

@Component
public interface OngoingCareRepository extends JpaRepository<OngoingCare, Integer>{

	public List<OngoingCare> findByanimalId(Integer animalId);
}
