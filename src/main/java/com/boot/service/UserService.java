package com.boot.service;

import com.boot.domain.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {

    List<User> getUserList();
}
