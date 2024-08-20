package com.samsung.basicsecurity.services;

import com.samsung.basicsecurity.configuration.CustomUserDetails;
import com.samsung.basicsecurity.repositories.UserRepository;
import com.samsung.basicsecurity.repositories.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);
        if(user==null)
            throw new UsernameNotFoundException(username);

        else return new CustomUserDetails(user);
    }

    public void createUser(User newUser)
    {
        userRepository.save(newUser);
    }

    public User getUserByUserName(String username)
    {
        return userRepository.findByUsername(username);
    }
}
