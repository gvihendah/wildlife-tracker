package org.example.dao;

public class EndangeredAnimalDAO {
    void create(EndangeredAnimal animal);
    void update(EndangeredAnimal animal);
    List<EndangeredAnimal> getAll();
    EndangeredAnimal getById(Integer id);
    void delete(String id);
}
