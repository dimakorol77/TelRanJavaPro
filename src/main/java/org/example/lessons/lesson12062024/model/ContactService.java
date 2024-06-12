package org.example.lessons.lesson12062024.model;

public interface ContactService {
  public void add (Contact contact);
  public void updateById (int id, Contact contact);
  public Contact getByName(String name);
  public Contact getById(int id);
  public void deleteById (int id);
  public void deleteByName (String name);
}
