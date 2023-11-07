package io.example.firstapp.controllers;

import io.example.firstapp.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/author/")
public class AuthorController
{
    private final AuthorService authorService;
    public AuthorController(AuthorService authorService)
    {
        this.authorService = authorService;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model)
    {
        model.addAttribute("authors", authorService.findAll());
        return "author/authors";
    }
    @RequestMapping("/firstauthor")
    public String getFirstAuthor(Model model)
    {
        model.addAttribute("author", authorService.getFirstAuthor());
        return "author/firstAuthor";
    }
}
