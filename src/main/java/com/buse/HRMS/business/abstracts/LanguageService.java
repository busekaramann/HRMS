package com.buse.HRMS.business.abstracts;

import com.buse.HRMS.core.utilities.results.DataResult;
import com.buse.HRMS.core.utilities.results.Result;
import com.buse.HRMS.entities.concretes.Language;
import com.buse.HRMS.entities.requests.AddLanguageRequest;

import java.util.List;

public interface LanguageService {
    Result add(AddLanguageRequest addLanguageRequest);
    Result update(Language language);
    Result delete(Language language);
    DataResult<List<Language>> getAll();
}
