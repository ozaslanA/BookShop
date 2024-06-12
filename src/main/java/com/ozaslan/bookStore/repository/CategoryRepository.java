package com.ozaslan.bookStore.repository;

import com.ozaslan.bookStore.model.Book;
import com.ozaslan.bookStore.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category,Long>, JpaSpecificationExecutor<Book> {

}
