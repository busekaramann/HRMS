package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.EducationService;
import com.buse.HRMS.business.abstracts.ResumeService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.dataAccsess.abstracts.EducationDao;
import com.buse.HRMS.entities.concretes.Education;
import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.mappers.EducationMapper;
import com.buse.HRMS.entities.requests.AddEducationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationServiceImpl implements EducationService {
    private final EducationDao educationDao;
    private final EducationMapper mapper;
    private final ResumeService resumeService;

    @Override
    @Transactional
    public Result add(AddEducationRequest addEducationRequest) {
        Education entity = mapper.toEntity(addEducationRequest);
        entity = this.educationDao.save(entity);
        Resume resume = resumeService.getById(addEducationRequest.getResumeId()).getData();
        resume.getEducations().add(entity);
        return new SuccessResult();
    }

    @Override
    public Result update(Education education) {
        this.educationDao.save(education);
        return new SuccessResult();
    }

    @Override
    public Result delete(Education education) {
        this.educationDao.delete(education);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Education>> getAll() {
        return new SuccessDataResult<List<Education>>(this.educationDao.findAll());
    }
}
