package br.com.marcelbraghini.example.usecases;

import br.com.marcelbraghini.example.domain.domain.User;

import java.util.List;
import java.util.Optional;

public interface FindAllUsers {
    Optional<List<User>> findAllUsers();
}
