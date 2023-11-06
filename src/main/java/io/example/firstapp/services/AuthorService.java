package io.example.firstapp.services;

import io.example.firstapp.domain.Author;

public interface AuthorService
{
    Iterable<Author> findAll();
    Author getFirstAuthor();
}
