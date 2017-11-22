package hk.bi.test.web;

import hk.bi.test.bean.SysUser;
import hk.bi.test.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

/** 表 SYS_USER 控制层
*
* @author 自动生成
* date 2017-11-22 16:13:36
*/
@Controller
@RequestMapping("/sysUser")
public class SysUserController{

    @Autowired
    private SysUserService sysUserService;

    /**  主页 **/
    @RequestMapping(value = "/index")
    public ModelAndView index(){
        return new ModelAndView("sysUser");
    }


    /**  按主键查询 **/
    @RequestMapping(value = "/pk", method = RequestMethod.GET)
    @ResponseBody
    public SysUser selectOne(SysUser sysUser){
        return sysUserService.selectOne(sysUser);
    }

    /**  插入 **/
    @RequestMapping(value = "/pk", method = RequestMethod.PUT)
    @ResponseBody
    public int insert(SysUser sysUser){
        return sysUserService.insert(sysUser);
    }

    /**  按主键更新 **/
    @RequestMapping(value = "/pk", method = RequestMethod.POST)
    @ResponseBody
    public int update(SysUser sysUser){
        return sysUserService.update(sysUser);
    }

    /**  按主键删除 **/
    @RequestMapping(value = "/pk", method = RequestMethod.DELETE)
    @ResponseBody
    public int delete(SysUser sysUser){
        return sysUserService.delete(sysUser);
    }

    /**  查询全部 **/
    @RequestMapping(value = "/selectAll", method = RequestMethod.GET)
    @ResponseBody
    List<SysUser> selectAll(){
        return sysUserService.selectAll();
    }



    /**  查询模板 **/
    @RequestMapping(value = "/selectExample", method = RequestMethod.GET)
    @ResponseBody
    List selectExample(Map param){
    return sysUserService.selectExample(param);
    }

}