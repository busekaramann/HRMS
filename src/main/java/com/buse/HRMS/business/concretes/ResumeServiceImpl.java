package com.buse.HRMS.business.concretes;

import com.buse.HRMS.business.abstracts.ResumeService;
import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.SuccessDataResult;
import com.buse.HRMS.dataAccsess.abstracts.ResumeDao;
import com.buse.HRMS.entities.concretes.Resume;
import com.buse.HRMS.entities.mappers.ResumeMapper;
import com.buse.HRMS.entities.requests.AddResumeRequest;
import com.buse.HRMS.entities.responses.ResumeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeServiceImpl implements ResumeService {

    private final ResumeDao resumeDao;
    private final ResumeMapper mapper;

    @Override
    public DataResult<List<ResumeResponse>> getAll() {
        return new SuccessDataResult<>(
          this.resumeDao.findAll().stream().map(mapper::toResponse).toList()
        );
    }

    @Override
    public DataResult<Resume> getById(int id) {
        return new SuccessDataResult<Resume>(resumeDao.findById(id).get());
    }

    @Override
    public DataResult<ResumeResponse> getByDetailedById(int id) {
        return new SuccessDataResult<ResumeResponse>(mapper.toResponse(this.resumeDao.findById(id).get()));
    }

    @Override
    public DataResult<ResumeResponse> add(AddResumeRequest addResumeRequest) {

        Resume entity = mapper.toEntity(addResumeRequest);

        entity =this.resumeDao.save(entity);

        ResumeResponse resumeResponse = mapper.toResponse(entity);
        return new SuccessDataResult<ResumeResponse>(resumeResponse);
    }
}
