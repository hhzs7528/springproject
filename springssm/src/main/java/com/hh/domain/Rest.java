package com.hh.domain;

import lombok.Data;

@Data
public class Rest {
    private Integer code;
    private String message;
    private Object data;

    public Rest() {
    }

    public Rest(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Rest(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
