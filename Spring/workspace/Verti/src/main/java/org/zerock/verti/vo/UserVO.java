package org.zerock.verti.vo;

import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {

    private String id;
    private String email;
    private String password;
    private String name;
    private String phone;
}
