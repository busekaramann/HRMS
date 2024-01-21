package com.buse.HRMS.api.controllers;

import com.buse.HRMS.business.abstracts.*;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.concretes.Experience;
import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.concretes.Talent;
import com.buse.HRMS.entities.requests.*;
import com.buse.HRMS.entities.responses.JobAdvertResponse;
import com.buse.HRMS.entities.responses.ResumeResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/resume")
@RequiredArgsConstructor
public class ResumeControllerImpl {
    private final ResumeService resumeService;
    private final TalentService talentService;
    private final EducationService educationService;
    private final LanguageService languageService;
    private final ExperienceService experienceService;

    @PostMapping("/add")
    public ResponseEntity<DataResult<ResumeResponse>> add(@Valid @RequestBody AddResumeRequest addResumeRequest) {
        return ResponseEntity.ok(this.resumeService.add(addResumeRequest));
    }


    @GetMapping("/getAll")
    public ResponseEntity<DataResult<List<ResumeResponse>>> getAllResumes() {
        return ResponseEntity.ok(this.resumeService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<DataResult<ResumeResponse>> getById(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(this.resumeService.getByDetailedById(id));
    }




    // talent
    @GetMapping("/talent/getAll")
    public ResponseEntity<DataResult<List<Talent>>> getAllTalents() {
        return ResponseEntity.ok(this.talentService.getAll());
    }

    @PostMapping("/talent/add")
    public ResponseEntity<Result> addTalent(@Valid @RequestBody AddTalentRequest addTalentRequest){
        Result result = this.talentService.add(addTalentRequest);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/talent/delete")
    public ResponseEntity<Result> deleteTalent(@Valid @RequestBody Talent talent){
        Result result = this.talentService.delete(talent);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/talent/update")
    public ResponseEntity<Result> updateTalent(@Valid @RequestBody Talent talent){
        Result result = this.talentService.update(talent);
        return ResponseEntity.ok(result);
    }

    //education

    @GetMapping("/education/getAll")
    public ResponseEntity<DataResult<List<Talent>>> getAllEducations() {
        return ResponseEntity.ok(this.talentService.getAll());
    }

    @PostMapping("/education/add")
    public ResponseEntity<Result> addEducation(@Valid @RequestBody AddEducationRequest addEducationRequest){
        Result result = this.educationService.add(addEducationRequest);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/education/delete")
    public ResponseEntity<Result> deleteEducation(@Valid @RequestBody Education education){
        Result result = this.educationService.delete(education);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/education/update")
    public ResponseEntity<Result> updateEducation(@Valid @RequestBody Education education){
        Result result = this.educationService.update(education);
        return ResponseEntity.ok(result);
    }


    //language

    @GetMapping("/language/getAll")
    public ResponseEntity<DataResult<List<Language>>> getAllLanguages() {
        return ResponseEntity.ok(this.languageService.getAll());
    }

    @PostMapping("/language/add")
    public ResponseEntity<Result> addLanguage(@Valid @RequestBody AddLanguageRequest addLanguageRequest){
        Result result = this.languageService.add(addLanguageRequest);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/language/delete")
    public ResponseEntity<Result> deleteLanguage(@Valid @RequestBody Language language){
        Result result = this.languageService.delete(language);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/language/update")
    public ResponseEntity<Result> updateLanguage(@Valid @RequestBody Language language){
        Result result = this.languageService.update(language);
        return ResponseEntity.ok(result);
    }

    //experience
    @GetMapping("/experience/getAll")
    public ResponseEntity<DataResult<List<Experience>>> getAllExperience() {
        return ResponseEntity.ok(this.experienceService.getAll());
    }

    @PostMapping("/experience/add")
    public ResponseEntity<Result> addExperience(@Valid @RequestBody AddExperienceRequest addExperienceRequest){
        Result result = this.experienceService.add(addExperienceRequest);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/experience/delete")
    public ResponseEntity<Result> deleteExperience(@Valid @RequestBody Experience experience){
        Result result = this.experienceService.delete(experience);
        return ResponseEntity.ok(result);
    }

    @PutMapping("/experience/update")
    public ResponseEntity<Result> updateExperience(@Valid @RequestBody Experience experience){
        Result result = this.experienceService.update(experience);
        return ResponseEntity.ok(result);
    }
}
