package com.email.email_writer.Models;

import lombok.Data;

@Data
public class EmailRequest {
    private String content;
    private String tone;
}
