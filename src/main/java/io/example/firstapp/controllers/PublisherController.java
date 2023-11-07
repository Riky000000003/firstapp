package io.example.firstapp.controllers;

import io.example.firstapp.services.PublisherService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/publisher/")
public class PublisherController
{
    private final PublisherService publisherService;
    public PublisherController(PublisherService publisherService)
    {
        this.publisherService = publisherService;
    }
    @RequestMapping("/publishers")
    public String getPublishers(Model model)
    {
        model.addAttribute("publishers", publisherService.findAll());
        return "publisher/publishers";
    }
    @RequestMapping("/firstpublisher")
    public String getFirstPublisher(Model model)
    {
        model.addAttribute("publisher", publisherService.getFirstPublisher());
        return "publisher/firstPublisher";
    }
}
