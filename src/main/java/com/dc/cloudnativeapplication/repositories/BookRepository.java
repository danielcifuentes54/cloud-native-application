package com.dc.cloudnativeapplication.repositories;

import com.dc.cloudnativeapplication.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
