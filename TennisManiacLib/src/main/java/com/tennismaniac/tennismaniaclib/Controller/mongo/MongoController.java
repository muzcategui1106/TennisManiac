package com.tennismaniac.tennismaniaclib.Controller.mongo;

import com.tennismaniac.tennismaniaclib.model.MongoObject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by muzcategui1106 on 1/24/2017.
 */

@Component
public class MongoController {
    public <T extends MongoRepository, E extends MongoObject> E getObjectById(T repository, E mongoObject) {
        return (E) repository.findOne(mongoObject.getId());
    }

    public <T extends MongoRepository, E extends MongoObject> E createObject(T repository, E mongoObject) {
        return (E) repository.save(mongoObject);
    }

    public <T extends MongoObject> List<T> getAllObjects(MongoRepository repository, Class<T> type) {
        return repository.findAll();
    }
}
