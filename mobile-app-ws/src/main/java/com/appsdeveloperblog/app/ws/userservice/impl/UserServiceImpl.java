package com.appsdeveloperblog.app.ws.userservice.impl;

import com.appsdeveloperblog.app.ws.ui.model.request.UserDetailsRequestModel;
import com.appsdeveloperblog.app.ws.ui.model.response.UserRest;
import com.appsdeveloperblog.app.ws.userservice.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


@Service
public class UserServiceImpl implements UserService {

    Map<String,UserRest> users;
    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());

        String userId = UUID.randomUUID().toString();
        returnValue.setUserId(userId);
        if(users == null)
            users = new HashMap<>();
        users.put(userId , returnValue);

        return returnValue;
    }
}
