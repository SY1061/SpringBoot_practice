package com.yeoboya.board.service;

import com.yeoboya.board.dto.BookDto;
import com.yeoboya.board.entity.Book;
import com.yeoboya.board.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookMapper bookMapper;

    public List<Book> findAllBookService() {
        return bookMapper.findAllBook();
    }

    public Book findBookService(long id) {
        return bookMapper.findById(id);
    }

    public int createBookService(BookDto bookDto) {
        Book book = new Book(bookDto.getId(), bookDto.getName());
        return bookMapper.createBook(book);
    }

    public int modifyBookService(BookDto bookDto) {
        Book book = new Book(bookDto.getId(), bookDto.getName());
        return bookMapper.updateBook(book);
    }

    public int deleteBookService(long id) {
        return bookMapper.deleteBook(id);
    }
}
