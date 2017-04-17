package cn.blog.controller;

import cn.blog.model.Content;
import cn.blog.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by XIAOYAO on 2017/3/22/0022 by 14:06.
 * 文章内容处理
 */
@Controller
public class ContentController {

    private ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @RequestMapping(value = "text", method = RequestMethod.POST)
    public String text(String title, String editor) {
        System.out.println("testatat===============>>" + editor);
        Content content = new Content();
        content.setCid(1);
        content.setCreateId(2);
        content.setTitle(title);
        content.setContent(editor);
        int bl = contentService.saveContent(content);
        System.out.println("========================>" + bl);
        return null;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        System.out.println("test----------------->>>>>");
        return null;
    }
}
