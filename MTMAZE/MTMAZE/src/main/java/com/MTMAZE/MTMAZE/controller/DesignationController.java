package com.MTMAZE.MTMAZE.controller;
import com.MTMAZE.MTMAZE.entity.Designation;
import com.MTMAZE.MTMAZE.service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/home5")
public class DesignationController {
        @Autowired
        private DesignationService designationService;

        @PostMapping("/addDesignation")
        public Designation addDesignation(@RequestBody Designation designation) {
            return designationService.saveDesignation(designation);
        }



        @GetMapping("/designation")
        public List<Designation> getAllDesignation() {
            return designationService.getAllDesignation();
        }

        @GetMapping("/Designation/{id}")
        public Designation findDesignationById(@PathVariable int id) {
            return designationService.getDesignationById(id);
        }

        @PutMapping("/updateDesignation")
        public Designation updateDesignation(@RequestBody Designation designation) {
            return designationService.updateDesignation(designation);
        }

        @DeleteMapping("/delete/{id}")
        public String deleteDesignation(@PathVariable int id) {
            return designationService.deleteDesignation(id);
        }
    }
