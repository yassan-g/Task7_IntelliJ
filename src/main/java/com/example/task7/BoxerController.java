package com.example.task7;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

@RestController
public class BoxerController {

    @GetMapping("/boxers/{id}")
    public Boxer getBoxers(@PathVariable int id) {
        return new Boxer(id, "幕之内一歩", 25, "鴨川ボクシングジム");
    }

    @PostMapping("/boxers")
    public ResponseEntity<Map<String, String>> create(@Validated @RequestBody BoxerCreateForm boxerCreateForm) {
        /*Locationの設定*/
        URI uri = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/boxers/id")
                .build()
                .toUri();
        return ResponseEntity.created(uri).body(Map.of("message", "name successfully created"));
    }

    @PatchMapping("/boxers/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @Validated @RequestBody BoxerUpdateForm boxerUpdateForm) {
        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/boxers/{id}")
    public ResponseEntity<Map<String, String>> delete(@PathVariable("id") int id) {
        return  ResponseEntity.ok(Map.of("message", "name successfully deleted"));
    }
}
