package com.ibik.nameservices.nameservices.programsStudy;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class programStudyServices {

    @Autowired
    private programStudyRepo programStudyRepo;

    public programStudy save(programStudy programStudy) {
        return programStudyRepo.save(programStudy);

    }

    public programStudy findOne(int id) {
        return programStudyRepo.findById(id).get();

    }

    public Iterable<programStudy> findAll() {
        return programStudyRepo.findAll();

    }

    public void removeOne(int id) {
        programStudyRepo.deleteById(id);
    }

}
