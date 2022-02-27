package br.com.marcelbraghini.example.adapters.controller;

import br.com.marcelbraghini.example.adapters.controller.model.UserResponse;
import br.com.marcelbraghini.example.adapters.controller.model.UserResponseMapper;
import br.com.marcelbraghini.example.usecases.rules.FindAllUsersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UserController {

    private final FindAllUsersUseCase findAllUsersUseCase;

    public List<UserResponse> findAllUsers() {
        return UserResponseMapper.INSTANCE.entityToResponse(Optional.of(findAllUsersUseCase.execute()).get().orElseThrow(null));
    }
}
