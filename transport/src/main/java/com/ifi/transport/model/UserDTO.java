package com.ifi.transport.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int id;
    private String fullname;
    private String username;
    private String password;
    private String email;
    private int phoneNumber;
    private String role;
}
