package io.example.firstapp.controllers;

import io.example.firstapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController
{
    private final BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks(Model model)
    {
        System.out.println("sono in getBooks");
        model.addAttribute("books", bookService.findAll());
        return "books";
    }

    @RequestMapping("/firstbook")
    public String getFirstBook(Model model)
    {
        System.out.println("sono in getFirstBook");
        model.addAttribute("firstbook", bookService.getFirstBook());
        return "firstbook";
    }
}
