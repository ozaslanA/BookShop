package com.ozaslan.bookStore.dtos.request;

import lombok.Getter;

@Getter
public class BookSearchRequest {
    private int size;
    private int page;
}
