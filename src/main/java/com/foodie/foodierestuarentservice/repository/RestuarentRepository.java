package com.foodie.foodierestuarentservice.repository;

import com.foodie.foodierestuarentservice.model.Restuarent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by ryadav1 on 7/23/17.
 */
@RepositoryRestResource
public interface RestuarentRepository extends MongoRepository<Restuarent, String> {
    @RestResource(path = "by-name")
    public List<Restuarent> findByName(@PathParam("name") String name);
}
