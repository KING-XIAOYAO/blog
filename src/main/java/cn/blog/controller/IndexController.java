package cn.blog.controller;

import cn.blog.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Coder XIAOYAO
 * @Time 2016年4月21日 下午10:09:05
 * 首页
 */
@Controller
public class IndexController {

    private ContentService contentService;

    @Autowired
    public IndexController(ContentService contentService) {
        this.contentService = contentService;
    }

    /**
     * 跳转到首页
     *
     * @return 博客首页
     */
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("contents", contentService.findContent());
        return "index";
    }
}
