package com.hellodamar.Damar.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}