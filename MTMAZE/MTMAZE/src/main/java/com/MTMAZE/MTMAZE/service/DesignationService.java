package com.MTMAZE.MTMAZE.service;
import com.MTMAZE.MTMAZE.entity.Designation;
import com.MTMAZE.MTMAZE.respository.DesignationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    public Designation saveDesignation(Designation designation) {
        return designationRepository.save(designation);// Use instance instead of class name
    }

    public List<Designation> getAllDesignation() {
        return designationRepository.findAll();
    }

    public Designation getDesignationById(int id) {
        return designationRepository.findById(id).orElse(null); // Use instance instead of class name
    }

    public String deleteDesignation(int id) {
        designationRepository.deleteById(id); // Use instance instead of class name
        return "Designation Removed!! " + id;
    }

    public Designation updateDesignation(Designation designation) {
        Designation existingDesignation = designationRepository.findById(designation.getId()).orElse(null); // Use instance instead of class name

        existingDesignation.setRole(designation.getRole());

        return designationRepository.save(existingDesignation); // Use instance instead of class name

    }
}
