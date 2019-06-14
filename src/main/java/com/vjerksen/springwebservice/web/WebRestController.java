package com.vjerksen.springwebservice.web;

import com.vjerksen.springwebservice.domain.posts.Posts;
import com.vjerksen.springwebservice.domain.posts.PostsRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class WebRestController {

    /*
    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }

    @GetMapping(path = "/post/{id}")
    public Optional<Posts> getPost(@PathVariable("id") Long id) {
        return postsRepository.findById(id);
    }

    @GetMapping(path = "/posts")
    public List<Posts> getAllPosts() {
        return postsRepository.findAll();
    }

     */
}
