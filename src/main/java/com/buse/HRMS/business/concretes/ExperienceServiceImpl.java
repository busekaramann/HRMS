package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.ExperienceService;
import com.buse.HRMS.business.abstracts.ResumeService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.dataAccsess.abstracts.ExperienceDao;
import com.buse.HRMS.entities.concretes.Experience;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.mappers.ExperienceMapper;
import com.buse.HRMS.entities.requests.AddExperienceRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExperienceServiceImpl implements ExperienceService {
    private final ExperienceDao experienceDao;
    private final ExperienceMapper mapper;
    private final ResumeService resumeService;

    @Override
    @Transactional
    public Result add(AddExperienceRequest addExperienceRequest) {
        Experience entity = mapper.toEntity(addExperienceRequest);
        entity = this.experienceDao.save(entity);
        Resume resume = resumeService.getById(addExperienceRequest.getResumeId()).getData();
        resume.getExperiences().add(entity);
        return new SuccessResult();
    }

    @Override
    public Result update(Experience experience) {
        this.experienceDao.save(experience);
        return new SuccessResult();
    }

    @Override
    public Result delete(Experience experience) {
        this.experienceDao.delete(experience);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Experience>> getAll() {
        return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll());
    }
}
