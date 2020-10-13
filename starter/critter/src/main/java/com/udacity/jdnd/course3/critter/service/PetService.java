package com.udacity.jdnd.course3.critter.service;

import com.udacity.jdnd.course3.critter.model.Pet;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PetService {

    Pet savePet(Pet pet);
    Pet getPetById(long id);
    List<Pet> getAllPets();
    List<Pet> getAllByOwnerId(long ownerId);
    List<Pet> getAllPetsByIds(List<Long> ids);

}
