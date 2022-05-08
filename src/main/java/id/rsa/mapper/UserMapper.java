package id.rsa.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import id.rsa.entity.UserEntity;
import id.rsa.model.UserModel;

@Mapper(componentModel = "cdi")
public interface UserMapper {
    UserModel toUserModel(UserEntity user);

    UserEntity toModelEntity(UserModel userModel);

    List<UserModel> toUserEntityList(List<UserEntity> userEntity);

    void updateUserEntityFromDto(UserModel dto, @MappingTarget UserEntity userEntity);
}
