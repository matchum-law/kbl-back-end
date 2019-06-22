package com.vjerksen.springwebservice.web;


import com.vjerksen.springwebservice.domain.posts.KblPlayer;
import com.vjerksen.springwebservice.domain.posts.KblPlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class KblRestController {

    private KblPlayerRepository kblPlayerRepository;


    // Example
    @RequestMapping(path = "/hello")
    public String hello(){
        return "hello world!";
    }

    @GetMapping(path = "/kbl_player")
    public List<KblPlayer> getAllPosts() {
        System.out.println("connection");
        return kblPlayerRepository.findAll();
    }
}
