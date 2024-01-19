package com.buse.HRMS.core.business;

import com.buse.HRMS.core.utilities.results.Result;

import java.util.List;

public class BusinessRule {
    public static Result run(List<Result> logics) {
        return logics.stream()
                .filter(Result::isError)
                .findFirst()
                .orElse(null);
    }
}
