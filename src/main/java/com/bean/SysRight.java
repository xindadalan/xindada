package com.bean;

public class SysRight {
    private String rightcode;

    private String rightparentcode;

    private String righttype;

    private String righttext;

    private String righturl;

    public String getRightcode() {
        return rightcode;
    }

    public void setRightcode(String rightcode) {
        this.rightcode = rightcode == null ? null : rightcode.trim();
    }

    public String getRightparentcode() {
        return rightparentcode;
    }

    public void setRightparentcode(String rightparentcode) {
        this.rightparentcode = rightparentcode == null ? null : rightparentcode.trim();
    }

    public String getRighttype() {
        return righttype;
    }

    public void setRighttype(String righttype) {
        this.righttype = righttype == null ? null : righttype.trim();
    }

    public String getRighttext() {
        return righttext;
    }

    public void setRighttext(String righttext) {
        this.righttext = righttext == null ? null : righttext.trim();
    }

    public String getRighturl() {
        return righturl;
    }

    public void setRighturl(String righturl) {
        this.righturl = righturl == null ? null : righturl.trim();
    }
}