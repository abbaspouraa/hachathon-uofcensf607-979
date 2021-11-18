package com.ENSF607.AnimalProject.service;

import com.ENSF607.AnimalProject.model.Animal;
import com.ENSF607.AnimalProject.model.AnimalStatus;
import com.ENSF607.AnimalProject.model.Comment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    ArrayList<Comment> commentList;
    ArrayList<Animal> animalList;
    ArrayList<AnimalStatus> animalStatusesList;

    //    password??
    public ArrayList<Animal> SearchAnimal(String name, String spc, Character sex){
        ArrayList<Animal> animalQuery = new ArrayList<Animal>(0);
        for (Animal anm:animalList){
            if (name.equals("") || name.equals(anm.getName())){
                if (spc.equals("") || spc.equals(anm.getSpecies())){
                    if (sex.compareTo((char) 0)==0 || sex.compareTo(anm.getSex())==0){
                        animalQuery.add(anm);
                    }
                }
            }
        }
        return animalQuery;
    }

    public void makeComment(Comment comment){
//        Time time, Integer ucid, Integer animalId, String comment
        commentList.add(comment);
    }

    public ArrayList<Comment> seeComments(Integer animalId){
        return commentList;
    }

    ArrayList<Animal> seeAlertedAnimals(){
        ArrayList<Animal> animalQuery = new ArrayList<Animal>(0);
        for (Animal anm:animalList){
            if (anm.getStatus().equals("Alerting")){
                animalQuery.add(anm);
            }
        }
        return animalQuery;
    }

    ArrayList<AnimalStatus> seeAnimalsTreatment(){
        return animalStatusesList;
    }
}
