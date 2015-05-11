/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ucb.talp.model.enums;

/**
 *
 * @author Jonathan
 */
public enum Role {
    ROLE_ADMIN("ROLE_ADMIN"),
    ROLE_USER("ROLE_USER");
    
    private String role;

    private Role(String role) {
        setRole(role);
    }

    public String getRole() {
        return role;
    }

    private void setRole(String role) {
        this.role = role;
    }
}
