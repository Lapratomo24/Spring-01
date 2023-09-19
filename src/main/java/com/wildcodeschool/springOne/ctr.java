package com.wildcodeschool.springOne;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class ctr {
    @GetMapping
    public ResponseEntity<String> index() {
        return new ResponseEntity<>(
                "<ul>" +
                        "<li><a href='/doctor/1'>William Hartnett</a></li>" +
                        "<li><a href='/doctor/2'>Patrick Troughton</a></li>" +
                        "<li><a href='/doctor/3'>John Pertwee</a></li>" +
                        "<li><a href='/doctor/4'>Peter Davison</a></li>" +
                        "</ul>", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/1")
    public ResponseEntity<String> shinra() {
        return new ResponseEntity<>(
                "First Doctor - William Hartnett", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/2")
    public ResponseEntity<String> chopper() {
        return new ResponseEntity<>(
                "Second Doctor - Patrick Troughton", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/3")
    public ResponseEntity<String> wendy() {
        return new ResponseEntity<>(
                "Third Doctor - John Pertwee", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/4")
    public ResponseEntity<String> senku() {
        return new ResponseEntity<>(
                "Fourth Doctor - Peter Davison", HttpStatus.OK
        );
    }

}
