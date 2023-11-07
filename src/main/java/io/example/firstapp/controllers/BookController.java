package io.example.firstapp.controllers;

import io.example.firstapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book/")
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
        return "book/books";
    }

    @RequestMapping("/firstbook")
    public String getFirstBook(Model model)
    {
        System.out.println("sono in getFirstBook");
        model.addAttribute("firstbook", bookService.getFirstBook());
        return "book/firstbook";
    }

    @RequestMapping(path = "/bookById/{idBook}")
    public ModelAndView getBookById(@PathVariable(value="idBook") long idBook)
    {
        System.out.println("Sono in getBookByID: " +idBook);
        ModelAndView modelAndView = new ModelAndView("book/bookById");
        modelAndView.addObject("book", bookService.getBookByID(idBook));
        return modelAndView;
    }
}
