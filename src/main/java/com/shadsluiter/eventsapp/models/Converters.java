package com.shadsluiter.eventsapp.models;

import com.shadsluiter.eventsapp.models.UserEntity;

public class Converters {

    public static UserEntity userModelToUserEntity(UserModel userModel) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userModel.getId());  // Already Long
        userEntity.setUsername(userModel.getUsername());
        userEntity.setPassword(userModel.getPassword());
        return userEntity;
    }

    public static UserModel userEntityToUserModel(UserEntity userEntity) {
        UserModel userModel = new UserModel();
        userModel.setId(userEntity.getId()); // Already Long
        userModel.setUsername(userEntity.getUsername());
        userModel.setPassword(userEntity.getPassword());
        return userModel;
    }
}
