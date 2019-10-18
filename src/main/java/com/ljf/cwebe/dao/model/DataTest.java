package com.ljf.cwebe.dao.model;

import javax.persistence.*;

@Table(name = "data_test")
public class DataTest {
    /**
     * ID
     */
    @Id
    private Integer id;

    private String code;

    private String text;

    public DataTest(Integer id, String code, String text) {
        this.id = id;
        this.code = code;
        this.text = text;
    }

    public DataTest() {
        super();
    }

    /**
     * 获取ID
     *
     * @return id - ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     */
    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }
}