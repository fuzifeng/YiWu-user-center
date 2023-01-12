package com.yiwu.usercenterserver.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * 
 */
@Data
public class User implements Serializable {
    private Long id;

    private String name;

    private String username;

    private String password;

    private String token;

    private static final long serialVersionUID = 1L;
}