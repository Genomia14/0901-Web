package org.zerock.verti.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.zerock.verti.dto.UserDTO;
import org.zerock.verti.mappers.UserMapper;
import org.zerock.verti.vo.UserVO;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public UserDTO login(UserDTO param) {
        UserVO vo = userMapper.selectLogin(param);
        if (vo == null) return null;
        return new UserDTO(vo);
    }

    @Override
    public void join(UserDTO userDTO) {
        userMapper.insert(userDTO.convertVO());
    }
}
