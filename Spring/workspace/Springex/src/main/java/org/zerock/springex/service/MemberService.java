package org.zerock.springex.service;

import org.springframework.stereotype.Service;
import org.zerock.springex.dto.MemberDTO;


public interface MemberService {
    MemberDTO login(MemberDTO dto);
    MemberDTO join(MemberDTO dto);
}
