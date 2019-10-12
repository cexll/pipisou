package com.pipisou.pipisou.model;

import java.io.Serializable;

public class QueryNums implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column querynums.id
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column querynums.link_name
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    private String linkName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column querynums.querynum
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    private Integer querynum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column querynums.id
     *
     * @return the value of querynums.id
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public QueryNums withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column querynums.id
     *
     * @param id the value for querynums.id
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column querynums.link_name
     *
     * @return the value of querynums.link_name
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public String getLinkName() {
        return linkName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public QueryNums withLinkName(String linkName) {
        this.setLinkName(linkName);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column querynums.link_name
     *
     * @param linkName the value for querynums.link_name
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void setLinkName(String linkName) {
        this.linkName = linkName == null ? null : linkName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column querynums.querynum
     *
     * @return the value of querynums.querynum
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public Integer getQuerynum() {
        return querynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public QueryNums withQuerynum(Integer querynum) {
        this.setQuerynum(querynum);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column querynums.querynum
     *
     * @param querynum the value for querynums.querynum
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void setQuerynum(Integer querynum) {
        this.querynum = querynum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table querynums
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", linkName=").append(linkName);
        sb.append(", querynum=").append(querynum);
        sb.append("]");
        return sb.toString();
    }
}