package com.pawsome.petscare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pawsome.petscare.repo.Pet;
import com.pawsome.petscare.repo.PetRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pets")
@CrossOrigin("*")
public class PetController {
    @Autowired
    private PetRepository petRepository;

    @GetMapping("/{userId}")
    public List<Pet> getAllPets(@PathVariable Long userId) {
        return petRepository.findAllByUserId(userId);
    }

    @GetMapping("/{id}/{userId}")
    public Optional<Pet> getPetById(@PathVariable Long id, @PathVariable Long userId) {
        return petRepository.findByIdAndUserId(id, userId);
    }

    @PostMapping
    public Pet createPet(@RequestBody Pet pet) {
        return petRepository.save(pet);
    }

    @PutMapping("/{id}")
    public Pet updatePet(@PathVariable Long id, @RequestBody Pet petDetails) {
        Pet pet = petRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pet not found with id " + id));

        pet.setName(petDetails.getName());
        pet.setDob(petDetails.getDob());
        pet.setMedications(petDetails.getMedications());
        pet.setDietaryRequirements(petDetails.getDietaryRequirements());
        pet.setBreed(petDetails.getBreed());
        pet.setReceivedTickVaccine(petDetails.isReceivedTickVaccine());
        pet.setReceivedRabiesVaccine(petDetails.isReceivedRabiesVaccine());
        pet.setUserId(petDetails.getUserId());
        return petRepository.save(pet);
    }

    @DeleteMapping("/{id}/{userId}")
    public void deletePet(@PathVariable Long id, @PathVariable Long userId) {
        petRepository.deleteByIdAndUserId(id, userId);
    }
}
