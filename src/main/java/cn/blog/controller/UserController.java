package cn.blog.controller;

import cn.blog.model.User;
import cn.blog.service.UserService;
import cn.blog.util.MD5Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @Coder XIAOYAO
 * @Time 2016年4月21日 下午10:07:51
 * 用户信息controller
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 跳转到登录页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "user/login";
    }

    /**
     * 用户登录后跳转到blog首页
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(User user, Model model) {
        if (null == userService.getUser(user.getUsername(), MD5Helper.encodeByMD5(user.getPassword()))) {
            model.addAttribute("msg", "用户名或密码错误");
            return "user/login";
        } else {
            return "columns/bloghome";
        }
    }

    /**
     * 跳转到注册页面
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(Model model) {
        User user = new User();
        user.setUsername("zhangsan");
        model.addAttribute(user); //注册页面设置默认值
        return "user/register";
    }

    /**
     * 用户注册并返回到首页
     *
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(User user, RedirectAttributes model) {
        user.setPassword(MD5Helper.encodeByMD5(user.getPassword()));
        //save
        userService.save(user);
        //重定向后用model传递比较简单的数据
        model.addFlashAttribute("user", user);
        return "redirect:/";  //提交表单后重定向以防重复提交
    }
}
