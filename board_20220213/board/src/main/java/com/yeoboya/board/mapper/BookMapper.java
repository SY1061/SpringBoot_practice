package com.yeoboya.board.mapper;

import com.yeoboya.board.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    List<Book> findAllBook();
    Book findById(long id);
    int createBook(Book book);
    int updateBook(Book book);
    int deleteBook(long id);

}
