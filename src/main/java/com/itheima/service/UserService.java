package com.itheima.service;

import com.itheima.pojo.User;

public interface UserService {
    User findByUsername(String username);

    void register(String username, String password);

    //更新
    void update(User user);

    //更新头像
    void updateAvatar(String avatarUrl);

    //更新密码
    void updatePwd(String newPwd);
}
