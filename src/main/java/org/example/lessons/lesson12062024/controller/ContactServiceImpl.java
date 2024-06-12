package org.example.lessons.lesson12062024.controller;

import org.example.lessons.lesson12062024.model.Contact;
import org.example.lessons.lesson12062024.model.ContactService;
import org.example.lessons.lesson12062024.model.Repository;

public class ContactServiceImpl implements ContactService {

    Repository repository = new Repository();

    @Override
    public void add(Contact contact) {

        repository.getContacts().add(contact);
    }

    @Override
    public void updateById(int id, Contact newContact) {
        Contact contact = getById(id);
        if (newContact.getName() != null && !newContact.getName().isEmpty()) {
            contact.setName(newContact.getName());
        }

        if (newContact.getEmail() != null && !newContact.getEmail().isEmpty()) {
            contact.setEmail(newContact.getEmail());
        }

        if (newContact.getPhoneNumber() != null && !newContact.getPhoneNumber().isEmpty()) {
            contact.setPhoneNumber(newContact.getPhoneNumber());
        }



    }
    @Override
    public Contact getByName(String name) {
        for (Contact contact : repository.getContacts()) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public Contact getById(int id) {
        return repository.getContacts().get(id);
    }

    @Override
    public void deleteById(int id) {
        repository.getContacts().remove(id);
    }

    @Override
    public void deleteByName(String name) {
      Contact  contact = getByName(name);
      repository.getContacts().remove(contact);
    }
}
