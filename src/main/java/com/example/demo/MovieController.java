package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RequestMapping("/movie")
@RestController
public class MovieController {

    @GetMapping
    public Movie getMovie(){
        return new Movie("Spiderman");
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie){
        return movie;
    }

    @GetMapping("/rp")
    public Movie requestParamExample(@RequestParam String title){
        return new Movie(title);
    }

    @GetMapping("/rp1")
    public Movie requestParam1Example(@RequestParam(required = false, value = "unknown") String title){
        return new Movie(title);
    }

    @GetMapping("/allParams")
    public Collection<String> getAllParams(@RequestParam Map<String, String> params){
        return params.values();
    }
    @GetMapping("/{title}")
    public Movie getById(@PathVariable String title){
        return new Movie(title);
    }


}
class Movie{
    private String title;

    public Movie() {
    }

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
