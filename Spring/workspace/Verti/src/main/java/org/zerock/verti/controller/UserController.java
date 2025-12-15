package org.zerock.verti.controller;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.verti.dto.UserDTO;
import org.zerock.verti.service.UserService;

@Controller
@RequiredArgsConstructor
@Log4j2
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/login")
    public String loginGET() {
        return "user/login";
    }

    @PostMapping("/login")
    public String loginPOST(
            UserDTO param,
            HttpSession session,
            RedirectAttributes redirectAttributes) {

        UserDTO loginUser = userService.login(param);

        if (loginUser == null) {
            redirectAttributes.addFlashAttribute(
                    "msg", "아이디 또는 비밀번호가 올바르지 않습니다."
            );
            return "redirect:/user/login";
        }

        session.setAttribute("loginUser", loginUser);
        return "redirect:/";
    }

    @GetMapping("/join")
    public String joinGET() {
        return "user/join";
    }

    @PostMapping("/join")
    public String joinPOST(
            @Valid UserDTO userDTO,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {

        // 유효성 검사
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute(
                    "errors",
                    bindingResult.getAllErrors()
            );
            return "redirect:/user/join";
        }

        if (!userDTO.getPassword().equals(userDTO.getPasswordCheck())) {
            redirectAttributes.addFlashAttribute(
                    "msg", "비밀번호가 일치하지 않습니다."
            );
            return "redirect:/user/join";
        }

        userService.join(userDTO);

        redirectAttributes.addFlashAttribute(
                "msg", "회원가입이 완료되었습니다. 로그인 해주세요."
        );

        return "redirect:/user/login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/user/login";
    }
}
