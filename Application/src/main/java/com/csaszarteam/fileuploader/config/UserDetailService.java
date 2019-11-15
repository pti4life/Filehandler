package com.csaszarteam.fileuploader.config;



import com.csaszarteam.fileuploader.database.entity.UserRole;
import com.csaszarteam.fileuploader.database.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UserDAO userDAO;


    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {
        System.out.println("futik");
       com.csaszarteam.fileuploader.database.entity.User user = userDAO.findByUsername(username);
        List<GrantedAuthority> authorities =
                buildUserAuthority(user.getUserRoles());
        System.out.println(user);
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());

        buildUserForAuthentication(user,authorities);
        System.out.println( buildUserForAuthentication(user,authorities));
        return buildUserForAuthentication(user,authorities);
    }


    private org.springframework.security.core.userdetails.User buildUserForAuthentication(com.csaszarteam.fileuploader.database.entity.User user,
                                                                                          List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                true, true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        for (UserRole userRole : userRoles) {
            System.out.println(userRole);
            setAuths.add(new SimpleGrantedAuthority(userRole.getAuthority()));
        }
        System.out.println("ez ni" + new ArrayList<GrantedAuthority>(setAuths));

        return  new ArrayList<GrantedAuthority>(setAuths);
    }


}
