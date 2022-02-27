package br.com.marcelbraghini.example.adapters;

import br.com.marcelbraghini.example.adapters.repository.UserRepository;
import br.com.marcelbraghini.example.adapters.repository.model.UserModelMapper;
import br.com.marcelbraghini.example.domain.domain.User;
import br.com.marcelbraghini.example.usecases.FindAllUsers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserGateway implements FindAllUsers {

    private final UserRepository userRepository;

    @Override
    public Optional<List<User>> findAllUsers() {
        return Optional.ofNullable(UserModelMapper.INSTANCE.modelToEntity(userRepository.findAll()));
    }
}
