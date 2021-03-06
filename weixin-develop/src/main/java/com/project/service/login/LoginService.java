package com.project.service.login;

import com.project.model.sql.SystemUser;

/**
 * Create by Fenix_Bao on 2018/4/1.
 */
public interface LoginService {

    /**
     * 用户登录服务，如果用户不存在则插入到数据库
     * @param UserPrivilege
     */
    public SystemUser login(String username) throws Exception;

    /**
     * 用户登出服务（记录日志）
     * @param UserPrivilege
     */
    public boolean loginOut(SystemUser systemUser);
}
