package com.ibik.nameservices.nameservices.programsStudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programsStudy")
public class programStudyController {

    @Autowired
    private programStudyServices programStudyServices;

    @PostMapping
    public programStudy postPrograms(@RequestBody programStudy programStudy) {
        return programStudyServices.save(programStudy);
    }

    @GetMapping
    public Iterable<programStudy> fetchProgram() {
        return programStudyServices.findAll();
    }

    @GetMapping("/{id}")
    public programStudy fetchProgramsById(@PathVariable("id") int id) {
        return programStudyServices.findOne(id);
    }

    @PutMapping
    public programStudy updatePrograms(@RequestBody programStudy programStudy) {
        return programStudyServices.save(programStudy);

    }

    @DeleteMapping("/{id}")
    public void deleteProgramsById(@PathVariable("id") int id) {
        programStudyServices.removeOne(id);
    }

}
