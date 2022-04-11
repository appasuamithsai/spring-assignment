package com.amith.librarymanagementsystem.dao;

import com.amith.librarymanagementsystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface BookRepository extends JpaRepository<Book,Integer> {
}
