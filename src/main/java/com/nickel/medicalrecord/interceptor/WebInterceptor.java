package com.nickel.medicalrecord.interceptor;

import com.nickel.medicalrecord.consts.ServerConsts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Objects;

@Component
@Slf4j
public class WebInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession(false);
        if (Objects.isNull(session)) {
            response.setStatus(401);
            return false;
        }
        Object user = session.getAttribute(ServerConsts.CURRENT_USER);
        if (Objects.isNull(user)) {
            response.setStatus(401);
            return false;
        }
        return true;
    }
}
