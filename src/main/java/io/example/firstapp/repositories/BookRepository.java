package io.example.firstapp.repositories;

import org.springframework.data.repository.CrudRepository;
import io.example.firstapp.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long>
{

}
