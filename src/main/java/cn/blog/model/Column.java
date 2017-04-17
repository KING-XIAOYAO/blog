package cn.blog.model;

import java.io.Serializable;

/**
 * Created by XIAOYAO on 2017/3/21/0021 by 17:57.
 * 栏目
 */
public class Column implements Serializable {

    private static final long serialVersionUID = -2302068932261236065L;

    /**
     * id
     */
    private int id;

    /**
     * 栏目ID
     */
    private int columnId;

    /**
     * 栏目名
     */
    private String name;

    /**
     * 栏目父Id
     */
    private int fid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getColumnId() {
        return columnId;
    }

    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }
}
