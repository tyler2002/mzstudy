package org.mz.mzstudy.beans;

/**
 * 
 * @author mz.yyam
 * @date 2013-8-29 22:33:39
 */
public class StudyNote {
    /**
     * ����
     */
    private Integer id;
    /**
     * ѧϰ�ı��⡣e.g. angularJS
     */
    private String title;
    /**
     * Ŀǰû�����ô�á�֮ǰ�����и�������ҳ�棬�����url
     */
    private String href;
    /**
     * ѧϰ�ʼ�
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
