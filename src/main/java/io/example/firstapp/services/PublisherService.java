package io.example.firstapp.services;

import io.example.firstapp.domain.Publisher;

public interface PublisherService
{
    Iterable <Publisher> findAll();
    Publisher getFirstPublisher();
}
