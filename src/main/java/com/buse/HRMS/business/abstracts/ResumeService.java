package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.requests.AddResumeRequest;
import com.buse.HRMS.entities.responses.ResumeResponse;

import java.util.List;

public interface ResumeService {

    DataResult<List<ResumeResponse>> getAll();

    DataResult<Resume> getById(int id);

    DataResult<ResumeResponse> getByDetailedById(int id);
    DataResult<ResumeResponse> add(AddResumeRequest addResumeRequest);
}
