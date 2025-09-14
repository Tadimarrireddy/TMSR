package com.tmsr.service;

import com.tmsr.model.Contact;
import com.tmsr.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository repository;

    public void save(Contact contact) {
        repository.save(contact);
    }

    public List<Contact> findAll() {
        return repository.findAll();
    }
}
