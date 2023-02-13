package com.yeoboya.board.controller;

import com.yeoboya.board.dto.BookDto;
import com.yeoboya.board.entity.Book;
import com.yeoboya.board.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;


    @GetMapping
    public List<Book> getAllBook() {
        return bookService.findAllBookService();
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable long bookId) {
        return bookService.findBookService(bookId);
    }

    @PostMapping
    public int createBook(@RequestBody BookDto bookDto) {
        return bookService.createBookService(bookDto);
    }

    @PutMapping
    public int modifyBook(@RequestBody BookDto bookDto) {
        return bookService.modifyBookService(bookDto);
    }

    @DeleteMapping("/{bookId}")
    public int deleteBook(@PathVariable long bookId) {
        return bookService.deleteBookService(bookId);
    }
}

