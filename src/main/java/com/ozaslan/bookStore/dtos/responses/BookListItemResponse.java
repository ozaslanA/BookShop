package com.ozaslan.bookStore.dtos.responses;

import com.ozaslan.bookStore.model.enums.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.File;

@Data
@SuperBuilder


public class BookListItemResponse {
    private Long id;
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer totalPage;
    private Integer lastPageNumber;
    private File image;
    private String categoryName;
}
