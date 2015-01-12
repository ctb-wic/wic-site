package org.wic.site.support.common;

public enum AttendanceStatus {

    APPLIED("applied", "신청"),
    PRESENT("present", "참석"),
    ABSENT("absent", "불참");
    
    private String code;
    private String description;
    
    AttendanceStatus(String code, String description) {
        this.code = code;
        this.description = description;
    }
    
    public String getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    

}
