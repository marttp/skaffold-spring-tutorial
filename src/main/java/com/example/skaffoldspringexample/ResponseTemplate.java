package com.example.skaffoldspringexample;

public class ResponseTemplate<T> {
    private final String status;
    private final Long timestamp;
    private final T data;

    public String getStatus() {
        return status;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public T getData() {
        return data;
    }

    public ResponseTemplate(String status, T data) {
        this.status = status;
        this.timestamp = System.currentTimeMillis();
        this.data = data;
    }
}
