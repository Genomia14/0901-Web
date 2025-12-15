package org.zerock.verti.controller;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.zerock.verti.dto.BoardDTO;
import org.zerock.verti.dto.UserDTO;
import org.zerock.verti.service.BoardService;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/list")
    public String list(@RequestParam(required = false) String searchWord, Model model) {
        List<BoardDTO> boardLists = boardService.getList(searchWord);
        model.addAttribute("boardLists", boardLists);
        model.addAttribute("totalCount", boardLists.size());
        return "board/list";
    }

    @GetMapping("/view")
    public String view(@RequestParam int num, Model model) {
        boardService.increaseVisitCount(num);
        BoardDTO board = boardService.getOne(num);
        model.addAttribute("board", board);
        return "board/view";
    }

    @GetMapping("/write")
    public String writeForm() {
        return "board/write";
    }

    @PostMapping("/write")
    public String write(BoardDTO boardDTO, HttpSession session) {
        UserDTO loginUser = (UserDTO) session.getAttribute("loginUser");
        if (loginUser == null) {
            session.setAttribute("returnURL", "/board/write");
            return "redirect:/user/login";
        }

        boardDTO.setId(loginUser.getId());

        boardService.register(boardDTO);
        return "redirect:/board/list";
    }


    @GetMapping("/edit")
    public String editForm(@RequestParam int num, Model model) {
        BoardDTO board = boardService.getOne(num);
        model.addAttribute("board", board);
        return "board/write";
    }

    @PostMapping("/edit")
    public String edit(BoardDTO boardDTO) {
        boardService.modify(boardDTO);
        return "redirect:/board/view?num=" + boardDTO.getNum();
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int num) {
        boardService.remove(num);
        return "redirect:/board/list";
    }
}
