package com.challenge.literalura.servicios;

public interface iDataConverter {
    <T> T getData(String json, Class<T> tClass);
}
