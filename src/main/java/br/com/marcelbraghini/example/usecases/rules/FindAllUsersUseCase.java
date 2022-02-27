package br.com.marcelbraghini.example.usecases.rules;

import br.com.marcelbraghini.example.domain.domain.User;
import br.com.marcelbraghini.example.usecases.FindAllUsers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class FindAllUsersUseCase {

    private final FindAllUsers findAllUsers;

    public Optional<List<User>> execute() {
        return findAllUsers.findAllUsers();
    }
}
