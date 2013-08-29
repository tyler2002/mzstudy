package org.mz.mzstudy.beans;

/**
 * 
 * @author mz.yyam
 * @date 2013-8-29 22:33:39
 */
public class StudyNote {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 学习的标题。e.g. angularJS
     */
    private String title;
    /**
     * 目前没想好怎么用。之前是想有个单独的页面，这里存url
     */
    private String href;
    /**
     * 学习笔记
     */
    private String noteContent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getNoteContent() {
        return noteContent;
    }

    public void setNoteContent(String noteContent) {
        this.noteContent = noteContent;
    }
}
