package com.hnzs.service;

import com.hnzs.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName SysUserRepository
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/20 15:10
 * @Version
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);
}