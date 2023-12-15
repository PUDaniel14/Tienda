package com.tienda.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author Daniel
 */
public interface UsuarioDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
