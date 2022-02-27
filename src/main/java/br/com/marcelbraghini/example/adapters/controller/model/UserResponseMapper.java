package br.com.marcelbraghini.example.adapters.controller.model;

import br.com.marcelbraghini.example.domain.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserResponseMapper {
    UserResponseMapper INSTANCE = Mappers.getMapper(UserResponseMapper.class);

    List<UserResponse> entityToResponse(final List<User> users);
}
