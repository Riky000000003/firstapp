package io.example.firstapp.repositories;

import io.example.firstapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepositery extends CrudRepository<Publisher, Long> {
}
