package io.example.firstapp.services;

import io.example.firstapp.domain.Author;
import io.example.firstapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService
{
    private final AuthorRepository authorRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author getFirstAuthor() {
        if(authorRepository.count()!=0)
        {
            return authorRepository.findAll().iterator().next();
        }
        else
        {
            return new Author();
        }
    }
}
