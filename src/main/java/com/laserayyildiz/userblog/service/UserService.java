package com.laserayyildiz.userblog.service;

import com.laserayyildiz.userblog.model.User;

public interface UserService {
    User getOne(String id);

    User create(User user);
}
