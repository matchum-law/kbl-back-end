package com.vjerksen.springwebservice.web;


import com.vjerksen.springwebservice.domain.posts.KblPlayer;
import com.vjerksen.springwebservice.domain.posts.KblPlayerRepository;
import com.vjerksen.springwebservice.domain.posts.Posts;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class KblRestController {

    private KblPlayerRepository kblPlayerRepository;

    @GetMapping(path = "/kbl_player")
    public List<KblPlayer> getAllPosts() {
        return kblPlayerRepository.findAll();
    }
}
