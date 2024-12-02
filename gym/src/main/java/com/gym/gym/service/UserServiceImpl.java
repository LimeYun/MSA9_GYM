package com.gym.gym.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gym.gym.domain.UserAuth;
import com.gym.gym.domain.Users;
import com.gym.gym.mapper.UserMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<Users> list() throws Exception {
        List<Users> userList = userMapper.list();

                return userList;
    }

    @Override
    public Users select(Long no) throws Exception {
        Users user = userMapper.select(no);
        return user;
    }

    @Override
    @Transactional // 트랜잭션 처리 설정(회원정보, 회원 권한)
    public int join(Users user) throws Exception {
        String password = user.getPassword();
        
        String encodePassword = passwordEncoder.encode(password);
        user.setPassword(encodePassword);
        user.setEnabled(1);
        int result = userMapper.join(user);
        
        Long userNo = user.getNo();
        
        if(result > 0){
            UserAuth userAuth = new UserAuth();
            userAuth.setUserNo(userNo);
            userAuth.setAuth("ROLE_USER");
            result = userMapper.insertAuth(userAuth);
        }
        return result;
    }

    @Override
    public int update(Users user) throws Exception {
        int result = userMapper.update(user);
        return result;
    }

    @Override
    public int insertAuth(UserAuth userAuth) throws Exception {
        int result = userMapper.insertAuth(userAuth);
        return result;
    }

    @Override
    public int updateAuth(UserAuth userAuth) throws Exception {
        int result = userMapper.updateAuth(userAuth);
        return result;
    }

    @Override
    public int delete(Users user) throws Exception {
        int result = userMapper.delete(user);
        return result;
    }

    @Override
    public int delteAuth(UserAuth userAuth) throws Exception {
        int result = userMapper.delteAuth(userAuth);
        return result;
    }
    



      @Autowired
    private AuthenticationManager authenticationManager;
 
    @Override
    public boolean login(Users user, HttpServletRequest request) throws Exception {
       // // 💍 토큰 생성
       String username = user.getId();    // 아이디
       String password = user.getPassword();    // 암호화되지 않은 비밀번호
       UsernamePasswordAuthenticationToken token 
           = new UsernamePasswordAuthenticationToken(username, password);
       
       // 토큰을 이용하여 인증
       Authentication authentication = authenticationManager.authenticate(token);

       // 인증 여부 확인
       boolean result = authentication.isAuthenticated();

       if(result){
           // 시큐리티 컨텍스트에 등록
           SecurityContextHolder.getContext().setAuthentication(authentication);

            HttpSession session = request.getSession(true); // 세션이 없으면 새로 생성
            session.setAttribute("SPRING_SECURITY_CONTEXT", SecurityContextHolder.getContext());
       }
       else{
           log.error("바로 로그인 인증에 실패하였습니다.");
       }


       return result;
   }

    @Override
    public Users selectId(String id) throws Exception {
        Users user = userMapper.selectId(id);
        return user;
    }




}
