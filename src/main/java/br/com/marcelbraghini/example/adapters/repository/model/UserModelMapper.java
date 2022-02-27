package br.com.marcelbraghini.example.adapters.repository.model;

import br.com.marcelbraghini.example.domain.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserModelMapper {
    UserModelMapper INSTANCE = Mappers.getMapper(UserModelMapper.class);

    List<User> modelToEntity(final List<UserModel> userModels);
}
