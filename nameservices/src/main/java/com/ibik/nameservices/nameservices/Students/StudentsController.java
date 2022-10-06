package com.ibik.nameservices.nameservices.Students;

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
@RequestMapping("/api/Students")
public class StudentsController {

    @Autowired
    private StudentsServices StudentsServices;

    @PostMapping
    public Students postPrograms(@RequestBody Students Students) {
        return StudentsServices.save(Students);
    }

    @GetMapping
    public Iterable<Students> fetchProgram() {
        return StudentsServices.findAll();
    }

    @GetMapping("/{id}")
    public Students fetchProgramsById(@PathVariable("id") int id) {
        return StudentsServices.findOne(id);
    }

    @PutMapping
    public Students updatePrograms(@RequestBody Students Students) {
        return StudentsServices.save(Students);

    }

    @DeleteMapping("/{id}")
    public void deleteProgramsById(@PathVariable("id") int id) {
        StudentsServices.removeOne(id);
    }

}
