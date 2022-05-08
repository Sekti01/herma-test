package id.rsa.services;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

import id.rsa.entity.UserEntity;
import id.rsa.mapper.UserMapper;
import id.rsa.model.UserModel;

public class UserServices {
    @Inject
    UserMapper userMapper;

    public UserModel getUserEntity(Integer id) {
        return userMapper.toUserModel(UserEntity.findById(id));
    }

    public List<UserModel> getAllUser() {
        return userMapper.toUserEntityList(UserEntity.findAll().list());
    }

    @Transactional
    public UserModel createUser(UserModel userModel) {

        UserEntity entity = userMapper.toModelEntity(userModel);
        UserEntity.persist(entity);

        entity.persistAndFlush();
       // either use persistAndFlush or persist method
       // entity.persist();
        if(entity.isPersistent()) {
            Optional<UserEntity> optionalUsr = UserEntity.findByIdOptional(entity.id);
            entity = optionalUsr.orElseThrow(NotFoundException::new);
            return userMapper.toUserModel(entity);
        } else {
            throw new PersistenceException();
        }

    }
}
