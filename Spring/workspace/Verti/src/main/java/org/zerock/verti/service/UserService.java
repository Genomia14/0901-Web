package org.zerock.verti.service;

import org.zerock.verti.dto.UserDTO;

public interface UserService {
    UserDTO login(UserDTO param);
    void join(UserDTO userDTO);
}
