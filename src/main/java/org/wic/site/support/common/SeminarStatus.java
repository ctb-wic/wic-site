package org.wic.site.support.common;

public enum SeminarStatus {

    CREATED("created", "생성"),
    COMPLETION("completion", "완료");
    
    private String code;
    private String description;
    
    SeminarStatus(String code, String description) {
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
