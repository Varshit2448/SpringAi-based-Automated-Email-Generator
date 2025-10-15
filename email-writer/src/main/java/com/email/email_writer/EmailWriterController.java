package com.email.email_writer;

import com.email.email_writer.Models.EmailRequest;
import com.email.email_writer.Service.EmailWriterService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**/
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailWriterController {

    private final EmailWriterService emailWriterService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest email){
        String response = emailWriterService.generateReply(email);
        return ResponseEntity.ok(response);
    }


}

