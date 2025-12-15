package org.zerock.verti.mappers;

import org.zerock.verti.vo.UserVO;
import org.zerock.verti.dto.UserDTO;

public interface UserMapper {

    UserVO selectLogin(UserDTO param);

    void insert(UserVO userVO);
}
