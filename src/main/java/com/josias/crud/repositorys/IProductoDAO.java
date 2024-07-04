package com.josias.crud.repositorys;

import com.josias.crud.modelo.producto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoDAO extends MongoRepository<producto, String> {
}
