package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Talent;
import com.buse.HRMS.entities.requests.AddTalentRequest;

import java.util.List;


public interface TalentService {
    Result add(AddTalentRequest addTalentRequest);
    Result delete(Talent talent);
    Result update(Talent talent);
    DataResult<List<Talent>> getAll();




}
