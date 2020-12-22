package com.kisro.security.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

@Data
public class SysRole implements GrantedAuthority {
    private int id;
    private String roleName;

    @JsonIgnore
    @Override
    public String getAuthority() {
        return roleName;
    }
}
