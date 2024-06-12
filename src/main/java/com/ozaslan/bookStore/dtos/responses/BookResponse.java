package com.ozaslan.bookStore.dtos.responses;

import com.ozaslan.bookStore.model.enums.BookStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.File;

@Data
@SuperBuilder
public class BookResponse {
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer totalPage;
    private Integer lastPageNumber;
    private File image;
    private Long categoryId;
    private String imageUrl;
}
