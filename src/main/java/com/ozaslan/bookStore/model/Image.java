package com.ozaslan.bookStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "images")
@Getter
@NoArgsConstructor
@SuperBuilder
public class Image extends BaseEntity{

    private String imageUrl;



}
