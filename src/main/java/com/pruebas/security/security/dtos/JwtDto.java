package com.pruebas.security.security.dtos;
/**
 *
 * @author Luis
 */
public class JwtDto {
    private String token;

    public JwtDto(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
