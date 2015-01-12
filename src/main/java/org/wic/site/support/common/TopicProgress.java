package org.wic.site.support.common;

public enum TopicProgress {

    QUEUED("queued", "대기중"),
    ONGOING("ongoing", "진행중"),
    COMPLETION("completion", "완료");
    
    private String code;
    private String description;
    
    TopicProgress(String code, String description) {
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