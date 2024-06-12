package com.ozaslan.bookStore.service;

import com.ozaslan.bookStore.dtos.request.BookSearchRequest;
import com.ozaslan.bookStore.dtos.responses.BookResponse;
import com.ozaslan.bookStore.repository.BookRepository;
import com.ozaslan.bookStore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookListService {

    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;

    @Autowired
    public BookListService(CategoryRepository categoryRepository, BookRepository bookRepository) {
        this.categoryRepository = categoryRepository;
        this.bookRepository = bookRepository;
    }

    public List<BookResponse> listBooks(BookSearchRequest searchRequest) {
        return bookRepository.findAll(PageRequest.of(searchRequest.getPage(), searchRequest.getSize()))
                .getContent()
                .stream()
                .map(model -> BookResponse.builder()
                        .authorName(model.getAuthorName())
                        .title(model.getTitle())
                        .imageUrl(model.getImage().getImageUrl())
                        .build())
                .collect(Collectors.toList());
    }

}
