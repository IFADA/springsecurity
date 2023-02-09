package com.ifada.securitydemolearn.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ifada.securitydemolearn.entity.Users;
import com.ifada.securitydemolearn.mapper.UsersMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("userDetailService")
//@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersMapper usersMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<Users> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        Users users = usersMapper.selectOne(wrapper);
        if(users==null){
            throw new UsernameNotFoundException("user not found");

        }
        List<GrantedAuthority>   auths = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new User(users.getUsername(),new BCryptPasswordEncoder().encode(users.getPassword()),auths);
    }
}
