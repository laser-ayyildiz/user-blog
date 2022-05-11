package com.laserayyildiz.userblog.service.impl;

import com.laserayyildiz.userblog.model.User;
import com.laserayyildiz.userblog.repository.UserRepository;
import com.laserayyildiz.userblog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getOne(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found!"));
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }
}
