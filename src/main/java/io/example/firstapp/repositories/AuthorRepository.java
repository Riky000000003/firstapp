package io.example.firstapp.repositories;

import io.example.firstapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>
{

}
