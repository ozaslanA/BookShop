package com.ozaslan.bookStore.service;
import com.ozaslan.bookStore.dtos.request.SaveBookRequest;
import com.ozaslan.bookStore.dtos.responses.BookListItemResponse;
import com.ozaslan.bookStore.model.Book;
import com.ozaslan.bookStore.model.Category;
import com.ozaslan.bookStore.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookSaveService {

    private final BookRepository bookRepository;
    private final CategoryService categoryService;


    @Transactional
    public BookListItemResponse  saveBook(SaveBookRequest saveBookRequest){
        Category category= categoryService.loadCategory(saveBookRequest.getCategoryId());


        final Book book = Book.builder()
                .category(category)
                .bookStatus(saveBookRequest.getBookStatus())
                .title(saveBookRequest.getTitle())
                .totalPage(saveBookRequest.getTotalPage())
                .lastPageNumber(saveBookRequest.getLastPageNumber())
                .build();


        final Book fromDb = bookRepository.save(book);


       return   BookListItemResponse.builder()
                .categoryName(book.getCategory().getName())
                .id(fromDb.getId())
                .bookStatus(fromDb.getBookStatus())
                .publisher(fromDb.getPublisher())
                .authorName(fromDb.getAuthorName())
                .totalPage(fromDb.getTotalPage())
                .lastPageNumber(fromDb.getLastPageNumber())
                .build();

        }

}
