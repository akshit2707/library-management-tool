package com.library.users.service;

import com.library.users.entity.UserResponse;
import com.library.users.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.logging.Logger;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserResponse getUser(String id) {
        Optional<UserResponse> data = userRepository.findById(id);
        if (data.isPresent())
            return data.get();
        else
            log.error("No data present");
        return null;
    }
}
