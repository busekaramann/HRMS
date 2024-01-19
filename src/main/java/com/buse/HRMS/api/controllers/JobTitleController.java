package com.buse.HRMS.api.controllers;

import com.buse.HRMS.business.abstracts.JobTitleService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.entities.concretes.JobTitle;
import com.buse.HRMS.entities.requests.AddJobTitleRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobtitles")
@RequiredArgsConstructor
public class JobTitleController {
    private final JobTitleService jobTitleService;

    @PostMapping("/add")
    public ResponseEntity<DataResult<Boolean>> add(@RequestBody @Valid AddJobTitleRequest addJobTitleRequest){
        DataResult<Boolean> result = jobTitleService.add(addJobTitleRequest);
        if (result.isError()) {
            // TODO Response etity dönme, Exception at handler yapınca
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.ok(result);
    }

    @GetMapping("getall")
    public ResponseEntity<DataResult<List<JobTitle>>> getAll() {
        return ResponseEntity.ok(jobTitleService.getAll());
    }
}
