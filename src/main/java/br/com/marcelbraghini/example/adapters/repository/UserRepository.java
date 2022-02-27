package br.com.marcelbraghini.example.adapters.repository;

import br.com.marcelbraghini.example.adapters.repository.model.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<UserModel, String> {
    List<UserModel> findAll();
}
