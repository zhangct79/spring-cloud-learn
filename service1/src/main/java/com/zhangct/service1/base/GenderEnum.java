package com.zhangct.service1.base;

public enum GenderEnum {
    MAN(1,"男性"), WOMAN(2,"女性");

    private Integer code;
    private String description;

    GenderEnum(Integer code, String description) {
        this.code = code;
        this.description = description;
    }

    public Integer getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "GenderEnum{" +
                "code=" + code +
                ", description='" + description + '\'' +
                '}';
    }
}
