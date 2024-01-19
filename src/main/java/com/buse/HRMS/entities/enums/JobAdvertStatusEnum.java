package com.buse.HRMS.entities.enums;

import lombok.Getter;

@Getter
public enum JobAdvertStatusEnum {
    PENDING("PENDING"),
    CONFIRMED("CONFIRMED"),
    REJECTED("REJECTED"),
    DELETED("DELETED"),
    ARCHIVED("ARCHIVED");

    String status;

    JobAdvertStatusEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
