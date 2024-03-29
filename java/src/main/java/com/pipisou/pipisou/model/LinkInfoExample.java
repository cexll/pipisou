package com.pipisou.pipisou.model;

import java.util.ArrayList;
import java.util.List;

public class LinkInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public LinkInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("link_name is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("link_name is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("link_name =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("link_name <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("link_name >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("link_name >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("link_name <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("link_name <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("link_name like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("link_name not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("link_name in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("link_name not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("link_name between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("link_name not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdIsNull() {
            addCriterion("link_passwd is null");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdIsNotNull() {
            addCriterion("link_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdEqualTo(String value) {
            addCriterion("link_passwd =", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdNotEqualTo(String value) {
            addCriterion("link_passwd <>", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdGreaterThan(String value) {
            addCriterion("link_passwd >", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("link_passwd >=", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdLessThan(String value) {
            addCriterion("link_passwd <", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdLessThanOrEqualTo(String value) {
            addCriterion("link_passwd <=", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdLike(String value) {
            addCriterion("link_passwd like", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdNotLike(String value) {
            addCriterion("link_passwd not like", value, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdIn(List<String> values) {
            addCriterion("link_passwd in", values, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdNotIn(List<String> values) {
            addCriterion("link_passwd not in", values, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdBetween(String value1, String value2) {
            addCriterion("link_passwd between", value1, value2, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkPasswdNotBetween(String value1, String value2) {
            addCriterion("link_passwd not between", value1, value2, "linkPasswd");
            return (Criteria) this;
        }

        public Criteria andLinkDataIsNull() {
            addCriterion("link_data is null");
            return (Criteria) this;
        }

        public Criteria andLinkDataIsNotNull() {
            addCriterion("link_data is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDataEqualTo(String value) {
            addCriterion("link_data =", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataNotEqualTo(String value) {
            addCriterion("link_data <>", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataGreaterThan(String value) {
            addCriterion("link_data >", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataGreaterThanOrEqualTo(String value) {
            addCriterion("link_data >=", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataLessThan(String value) {
            addCriterion("link_data <", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataLessThanOrEqualTo(String value) {
            addCriterion("link_data <=", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataLike(String value) {
            addCriterion("link_data like", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataNotLike(String value) {
            addCriterion("link_data not like", value, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataIn(List<String> values) {
            addCriterion("link_data in", values, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataNotIn(List<String> values) {
            addCriterion("link_data not in", values, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataBetween(String value1, String value2) {
            addCriterion("link_data between", value1, value2, "linkData");
            return (Criteria) this;
        }

        public Criteria andLinkDataNotBetween(String value1, String value2) {
            addCriterion("link_data not between", value1, value2, "linkData");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table linkinfo
     *
     * @mbg.generated do_not_delete_during_merge Thu Oct 03 21:33:11 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table linkinfo
     *
     * @mbg.generated Thu Oct 03 21:33:11 CST 2019
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}