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
                        "<li><a href='/doctor/1'>Shinra Kishitani</a></li>" +
                        "<li><a href='/doctor/2'>Tony Tony Chopper</a></li>" +
                        "<li><a href='/doctor/3'>Wendy Marvell</a></li>" +
                        "<li><a href='/doctor/4'>Senku Ishigami</a></li>" +
                        "</ul>", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/1")
    public ResponseEntity<String> shinra() {
        return new ResponseEntity<>(
                "Shinra Kishitani - Durarara", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/2")
    public ResponseEntity<String> chopper() {
        return new ResponseEntity<>(
                "Tony Tony Chopper - One Piece", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/3")
    public ResponseEntity<String> wendy() {
        return new ResponseEntity<>(
                "Wendy Marvell - Fairy Tail", HttpStatus.OK
        );
    }

    @GetMapping("/doctor/4")
    public ResponseEntity<String> senku() {
        return new ResponseEntity<>(
                "Senku Ishigami - Dr. Stone", HttpStatus.OK
        );
    }

}
