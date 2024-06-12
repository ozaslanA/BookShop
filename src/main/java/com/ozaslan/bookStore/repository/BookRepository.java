package com.ozaslan.bookStore.repository;

import com.ozaslan.bookStore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<Book,Long>, JpaSpecificationExecutor<Book> {
}
