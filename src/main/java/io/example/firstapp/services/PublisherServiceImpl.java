package io.example.firstapp.services;

import io.example.firstapp.domain.Publisher;
import io.example.firstapp.repositories.PublisherRepositery;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService
{
    private final PublisherRepositery publisherRepositery;
    public PublisherServiceImpl(PublisherRepositery publisherRepositery)
    {
        this.publisherRepositery = publisherRepositery;
    }
    @Override
    public Iterable<Publisher> findAll() {
        return publisherRepositery.findAll();
    }
    @Override
    public Publisher getFirstPublisher() {
        if(publisherRepositery.count()!=0)
        {
            return publisherRepositery.findAll().iterator().next();
        }
        else
        {
            return new Publisher();
        }
    }
}
