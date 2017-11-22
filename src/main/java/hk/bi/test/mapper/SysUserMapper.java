package hk.bi.test.mapper;

import hk.bi.test.bean.SysUser;
import java.util.*;

/** 表 SYS_USER mapper
*
* @author 自动生成
* date 2017-11-22 16:13:36
*/
public interface SysUserMapper {

    /**  按主键查询 **/
    SysUser selectOne(SysUser sysUser);

    /**  插入 **/
    int insert(SysUser record);

    /**  按主键更新 **/
    int update(SysUser sysUser);

    /**  按主键删除 **/
    int delete(SysUser sysUser);

    /**  查询全部 **/
    List<SysUser> selectAll();



    /**  查询模板 **/
    List selectExample(Map param);

}