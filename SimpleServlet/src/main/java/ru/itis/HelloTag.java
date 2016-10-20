package ru.itis;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HelloTag extends TagSupport {
    private String name = null;

    public int doStartTag() throws JspException {
        try {
            if (name == null ) {
                pageContext.getOut().write("hello world!");
            } else {
                pageContext.getOut().write("Hello, " + name);
            }
        } catch (IOException e) {
            throw new IllegalStateException();
        }
        return SKIP_BODY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // вместо конструктора
    public void release() {
        super.release();
        name = null;
    }
}
