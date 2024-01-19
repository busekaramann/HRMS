package com.buse.HRMS.core.utilities.results;

public class Result {
    private boolean succeess;
    private String message;
    public Result(boolean succees){
        this.succeess=succees;
    }
    public Result(boolean succees,String message){
        this(succees);
        this.message=message;

    }
    public boolean isSuccees(){
        return this.succeess;
    }
    public boolean isError(){
        return !this.succeess;
    }
    public String getMessage(){
        return this.message;
    }
}
