package hk.bi.test.service.impl;

import hk.bi.test.bean.SysUser;
import hk.bi.test.mapper.SysUserMapper;
import hk.bi.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

/** 表 SYS_USER service实现
*
* @author 自动生成
* date 2017-11-22 16:13:36
*/
@Service
public class SysUserServiceImpl implements SysUserService{

    @Autowired
    private SysUserMapper sysUserMapper;

    /**  按主键查询 **/
    public SysUser selectOne(SysUser sysUser){
    return sysUserMapper.selectOne(sysUser);
    }

    /**  插入 **/
    public int insert(SysUser sysUser){
        return sysUserMapper.insert(sysUser);
    }

    /**  按主键更新 **/
    public int update(SysUser sysUser){
        return sysUserMapper.update(sysUser);
    }

    /**  按主键删除 **/
    public int delete(SysUser sysUser){
        return sysUserMapper.delete(sysUser);
    }

    /**  查询列表 **/
    public List<SysUser> selectAll(){
        return sysUserMapper.selectAll();
    }

    /**  查询模板 **/
    public List selectExample(Map param){
        return sysUserMapper.selectExample(param);
    }

}