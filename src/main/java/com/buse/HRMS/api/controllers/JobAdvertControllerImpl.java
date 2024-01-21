package com.buse.HRMS.api.controllers;

import com.buse.HRMS.business.abstracts.JobAdvertService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.entities.requests.AddJobAdvertRequest;
import com.buse.HRMS.entities.responses.JobAdvertResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvert")
@RequiredArgsConstructor
public class JobAdvertControllerImpl {
    private final JobAdvertService jobAdvertService;

    @PostMapping("/add")
    public Result add(@Valid @RequestBody AddJobAdvertRequest jobAdvert){
        this.jobAdvertService.add(jobAdvert);
        return new SuccessResult();
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvertResponse>> getAll() {
        return this.jobAdvertService.getAll();
    }

}
