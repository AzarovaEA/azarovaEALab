package com.example.azarovaILab.service;


import com.example.azarovaILab.dto.UserDto;
import com.example.azarovaILab.entity.User;

import java.time.LocalDate;

public interface UserService {
    UserDto createUser(String fullName, LocalDate birthDate, String workplace);

    User getUserById(Long id);

    UserDto getUserByIdDto(Long id);

    UserDto updateUser(Long id, String fullName, String workplace);

    void deleteUser(Long id);
}
