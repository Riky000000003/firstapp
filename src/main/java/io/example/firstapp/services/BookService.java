package io.example.firstapp.services;

import io.example.firstapp.domain.Book;

public interface BookService
{
    Iterable<Book> findAll();
    Book getFirstBook();
}
