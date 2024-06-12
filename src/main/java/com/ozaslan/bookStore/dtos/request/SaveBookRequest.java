package com.ozaslan.bookStore.dtos.request;

import com.ozaslan.bookStore.model.enums.BookStatus;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveBookRequest {
    @NotEmpty(message = "title not empty")
    private String title;
    @NotEmpty(message = "authorName not empty")
    private String authorName;
    @NotEmpty(message = "bookStatus not empty")
    private BookStatus bookStatus;
    @NotEmpty(message = "publisher not empty")
    private String publisher;
    @NotEmpty(message = "totalPage not empty")
    private Integer totalPage;
    @NotEmpty(message = "lastPageNumber not empty")
    private Integer lastPageNumber;
    private File image;
    @NotEmpty(message = "categoryId not empty")
    private Long categoryId;

}
