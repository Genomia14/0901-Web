package org.zerock.verti.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.zerock.verti.vo.UserVO;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String id;
    private String email;
    private String password;
    private String passwordCheck;
    private String name;
    private String phone;

    public UserDTO(UserVO vo) {
        this.id = vo.getId();
        this.email = vo.getEmail();
        this.password = vo.getPassword();
        this.name = vo.getName();
        this.phone = vo.getPhone();
    }

    public UserVO convertVO() {
        return UserVO.builder()
                .id(this.id)
                .email(this.email)
                .password(this.password)
                .name(this.name)
                .phone(this.phone)
                .build();
    }
}
