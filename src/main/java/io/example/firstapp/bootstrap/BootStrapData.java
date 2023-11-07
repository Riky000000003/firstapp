package io.example.firstapp.bootstrap;

import io.example.firstapp.domain.Author;
import io.example.firstapp.domain.Book;
import io.example.firstapp.domain.Publisher;
import io.example.firstapp.repositories.AuthorRepository;
import io.example.firstapp.repositories.BookRepository;
import io.example.firstapp.repositories.PublisherRepositery;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class BootStrapData implements CommandLineRunner
{
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepositery publisherRepositery;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepositery publisherRepositery)
    {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepositery = publisherRepositery;
    }


    @Override
    public void run(String... args) throws Exception
    {
        System.out.println("Bootstrap - Start");
        /*creare un publisher

        Publisher p1 = new Publisher();
        p1.setPublisherName("pippo");
        p1.setCity("Milano");
        p1.setAddress("via crespi 3");
        p1.setZipCode("20203021");
        p1.setState("italia");
        Publisher p1Saved = publisherRepositery.save(p1);

        //creare un autore
        Author a1 = new Author();
        a1.setFirstname("siiuumm");
        a1.setLastname("cregre");
        Author a1Saved = authorRepository.save(a1);

        //creare un libro
        Book b1 = new Book();
        b1.setTitle("Titolo di b1");
        b1.setIsbn("Isbn di b1");
        b1.setPublisher(p1Saved);
        b1.addAuthor(a1);
        //salvo il libro nel database
        Book b1Saved = bookRepository.save(b1);
         */

        for (int i = 0; i < 10; i++) {
            Publisher publisher = new Publisher();
            publisher.setPublisherName("Publisher Name " + i);
            publisher.setAddress("Address " + i);
            publisher.setCity("City " + i);
            publisher.setState("State " + i);
            publisher.setZipCode("Zip " + i);
            Publisher publisherSaved = publisherRepositery.save(publisher);

            Author author = new Author();
            author.setFirstname("Author First Name " + i);
            author.setLastname("Author Last Name " + i);
            Author authorSaved = authorRepository.save(author);

            Book book = new Book();
            book.setTitle("Book Title " + i);
            book.setIsbn("ISBN " + i);
            book.setPublisher(publisherSaved);
            book.addAuthor(author);
            Book bookSaved = bookRepository.save(book);

        }

        System.out.println("Bootstrap - End");
    }
}
