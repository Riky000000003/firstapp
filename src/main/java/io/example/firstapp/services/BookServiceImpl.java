package io.example.firstapp.services;

import io.example.firstapp.domain.Book;
import io.example.firstapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getFirstBook() {
        if(bookRepository.count()!=0) //serve per controllare se esistono i libri
        {
            //questo metodo ritorna il primo elemento
            //il metodo findAll riprende tutti i libri
            // il metodo iterator serve per iterare tutti i libri
            // il metodo next prende un elemento
            return bookRepository.findAll().iterator().next();
        }
        else
        {
            return new Book();
        }
    }
    @Override
    public Book getBookByID(long id) {
        if(bookRepository.count()!=0) //serve per controllare se esistono i libri
        {
            for (Book b: bookRepository.findAll())
            {
                if(b.getId()==id)
                {
                    return b;
                }
            }
            return new Book();
        }
        else
        {
            return new Book();
        }
    }
}
