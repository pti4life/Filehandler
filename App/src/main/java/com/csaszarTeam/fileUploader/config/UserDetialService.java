package com.csaszarTeam.fileUploader.config;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service("userDetailsService")
public class UserDetialService implements UserDetailsService {


    /*
    @Autowired
    private UserDao userDao;
    */

    @Override
    public UserDetails loadUserByUsername(final String username)
            throws UsernameNotFoundException {
        /*
       users user = userDao.findUserByUsername(username);
        List<GrantedAuthority> authorities =
                buildUserAuthority(user.getUserRole());

        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        try{
            buildUserForAuthentication(user,authorities);
        }catch (Exception e){
            System.out.println(e);
        }
        return buildUserForAuthentication(user,authorities);

             */
        return  null;
    }

    /*
    private User buildUserForAuthentication(users user,
                                            List<GrantedAuthority> authorities) {
        return new User(user.getUsername(), user.getPassword(),
                user.isEnabled(), true, true, true, authorities);
    }

    private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

        // Build user's authorities
        for (UserRole userRole : userRoles) {
            setAuths.add(new SimpleGrantedAuthority(userRole.getAuthority()));
        }

        List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

        return Result;
    }

     */
}
