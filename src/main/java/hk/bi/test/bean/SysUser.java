package hk.bi.test.bean;

import java.math.*;
import java.sql.*;

/** 表 SYS_USER 模型
*
* @author 自动生成
* date 2017-11-22 16:13:36
*/

public class SysUser {

    // 
    private  int id;
    // 
    private  String username;
    // 
    private  Timestamp createTime;

    public int getId() {
    return this.id;
    }
    public void setId(int id) {
    this.id = id;
    }
    public String getUsername() {
    return this.username;
    }
    public void setUsername(String username) {
    this.username = username;
    }
    public Timestamp getCreateTime() {
    return this.createTime;
    }
    public void setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    }

}