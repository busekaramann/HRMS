package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.LanguageService;
import com.buse.HRMS.business.abstracts.ResumeService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.core.utilities.results.SuccessResult;
import com.buse.HRMS.dataAccsess.abstracts.LanguageDao;
import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.mappers.LanguageMapper;
import com.buse.HRMS.entities.requests.AddLanguageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LanguageServiceImpl implements LanguageService {
    private final LanguageDao languageDao;
    private final LanguageMapper mapper;
    private final ResumeService resumeService;

    @Override
    @Transactional
    public Result add(AddLanguageRequest addLanguageRequest) {
        Language entity = mapper.toEntitiy(addLanguageRequest);
        entity = this.languageDao.save(entity);
        Resume resume = resumeService.getById(addLanguageRequest.getResumeId()).getData();
        resume.getLanguages().add(entity);
        return new SuccessResult();
    }

    @Override
    public Result update(Language language) {
        this.languageDao.save(language);
        return new SuccessResult();
    }

    @Override
    public Result delete(Language language) {
        this.languageDao.delete(language);
        return new SuccessResult();
    }

    @Override
    public DataResult<List<Language>> getAll() {

        return new SuccessDataResult<List<Language>>(this.languageDao.findAll());
    }
}
