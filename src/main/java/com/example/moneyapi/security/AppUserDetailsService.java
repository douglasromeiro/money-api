package com.example.moneyapi.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.moneyapi.model.Usuario;
import com.example.moneyapi.repository.UsuarioRepository;

@Service
public class AppUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Optional<Usuario> usuarioBusca = usuarioRepository.findByEmail(email);
		Usuario usuario = usuarioBusca.orElseThrow(() -> new UsernameNotFoundException("Usuario e/ou senha não encontrado..."));
		return new User(email, usuario.getSenha(), getPermissaoUsuario(usuario));
	}

	private Collection<? extends GrantedAuthority> getPermissaoUsuario(Usuario usuario) {
		Set<GrantedAuthority> authorities = new HashSet<>();
		usuario.getPermissoes().forEach(user -> authorities.add(new SimpleGrantedAuthority(user.getDescricao().toUpperCase())));
		return authorities;
	}

}
