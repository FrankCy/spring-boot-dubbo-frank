package com.frank.dubbo.practice.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.frank.dubbo.practice.entity.User;
import com.frank.dubbo.practice.service.UserService;
import com.frank.dubbo.practice.util.ChineseToPinyinUtil;
import lombok.extern.log4j.Log4j;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import org.springframework.stereotype.Component;

@Service
@Log4j
@Component
public class UserServiceImpl implements UserService {
    @Override
    public User helloDubbo(String name) {
        User user = new User();
        user.setNickName(name);
        String email = "";
        email = ChineseToPinyinUtil.convertChineseToPinyin(name, false, HanyuPinyinCaseType.LOWERCASE);
        user.setEmail( email + "@qq.com");
        return user;
    }
}
