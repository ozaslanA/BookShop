package com.ozaslan.bookStore.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name="category")
@SuperBuilder
@NoArgsConstructor
@Data
public class Category extends BaseEntity {
    private String name;
    @OneToMany
    @JoinColumn(name = "category_id")
    private List<Book> books;
}
