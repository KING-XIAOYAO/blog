package cn.blog.model;

import java.io.Serializable;

/**
 * Created by XIAOYAO on 2017/3/22/0022 by 14:56.
 * 文章信息
 */
public class Content implements Serializable {

    private static final long serialVersionUID = 1235275676190402330L;

    /**
     * 文章id
     */
    private int id;

    /**
     * 栏目id
     */
    private int cid;

    /**
     * 创建人id
     */
    private int createId;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 文章简介
     */
    private String introduction;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 创建时间
     */
    private String createtime;

    /**
     * 最后编辑时间
     */
    private String lastedittime;

    /**
     * 发布时间
     */
    private String releasetime;

    /**
     * 最后编辑人id
     */
    private String lasteditid;

    /**
     * 发布人id
     */
    private String publishid;

    /**
     * 访问次数
     */
    private int visits;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCreateId() {
        return createId;
    }

    public void setCreateId(int createId) {
        this.createId = createId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getLastedittime() {
        return lastedittime;
    }

    public void setLastedittime(String lastedittime) {
        this.lastedittime = lastedittime;
    }

    public String getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(String releasetime) {
        this.releasetime = releasetime;
    }

    public String getLasteditid() {
        return lasteditid;
    }

    public void setLasteditid(String lasteditid) {
        this.lasteditid = lasteditid;
    }

    public String getPublishid() {
        return publishid;
    }

    public void setPublishid(String publishid) {
        this.publishid = publishid;
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {
        this.visits = visits;
    }
}
