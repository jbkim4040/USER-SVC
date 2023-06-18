package com.abacus.usersvc.jwt;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.SpringSecurityCoreVersion;

public final class SimpleGrantedAuthority implements GrantedAuthority {


    private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
    private static final String role;

    public SimpleGrantedAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return this.role;
    }
}