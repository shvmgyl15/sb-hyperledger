package com.elite.digiwallet;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api")
public class PublicController {

    @GetMapping("/readLedger")
    public ResponseEntity<String> readLedger() {
        return ResponseEntity.ok("Hello World!");
    }
}
