package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.ResumeService;
import com.buse.HRMS.business.abstracts.TalentService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.dataAccsess.abstracts.TalentDao;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.concretes.Talent;
import com.buse.HRMS.entities.mappers.TalentMapper;
import com.buse.HRMS.entities.requests.AddTalentRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TalentServiceImpl implements TalentService {
    private final TalentDao talentDao;
    private final TalentMapper mapper;
    private final ResumeService resumeService;
    @Override
    @Transactional
    public Result add(AddTalentRequest addTalentRequest) {
        Talent entity = mapper.toEntity(addTalentRequest);
        entity = this.talentDao.save(entity);
        Resume resume = resumeService.getById(addTalentRequest.getResumeId()).getData();
        resume.getTalents().add(entity);
        return new SuccessResult();
    }

    @Override
    public Result delete(Talent talent) {
        this.talentDao.delete(talent);
        return new SuccessResult();
    }

    @Override
    public Result update(Talent talent) {
        this.talentDao.save(talent);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Talent>> getAll() {

        return  new SuccessDataResult<List<Talent>>(this.talentDao.findAll());
    }
}
