package com.ozaslan.bookStore.model;


import com.ozaslan.bookStore.model.enums.BookStatus;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="book")
@Getter
@NoArgsConstructor
@SuperBuilder
public class Book  extends BaseEntity{


    private String title;
    private String authorName;

    @Enumerated(value = EnumType.STRING)
    private BookStatus bookStatus;
    private String publisher;
    private Integer totalPage;
    private Integer lastPageNumber;
    @OneToOne
    private Image image;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;
    private Long userId;
}
