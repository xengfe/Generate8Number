package com.yskj.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmDeviceCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmDeviceCodeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCIdIsNull() {
            addCriterion("C_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("C_ID =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("C_ID <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("C_ID >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_ID >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("C_ID <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("C_ID <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("C_ID in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("C_ID not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("C_ID between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("C_ID not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCNumberIsNull() {
            addCriterion("C_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCNumberIsNotNull() {
            addCriterion("C_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCNumberEqualTo(String value) {
            addCriterion("C_NUMBER =", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberNotEqualTo(String value) {
            addCriterion("C_NUMBER <>", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberGreaterThan(String value) {
            addCriterion("C_NUMBER >", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberGreaterThanOrEqualTo(String value) {
            addCriterion("C_NUMBER >=", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberLessThan(String value) {
            addCriterion("C_NUMBER <", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberLessThanOrEqualTo(String value) {
            addCriterion("C_NUMBER <=", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberLike(String value) {
            addCriterion("C_NUMBER like", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberNotLike(String value) {
            addCriterion("C_NUMBER not like", value, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberIn(List<String> values) {
            addCriterion("C_NUMBER in", values, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberNotIn(List<String> values) {
            addCriterion("C_NUMBER not in", values, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberBetween(String value1, String value2) {
            addCriterion("C_NUMBER between", value1, value2, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCNumberNotBetween(String value1, String value2) {
            addCriterion("C_NUMBER not between", value1, value2, "cNumber");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNull() {
            addCriterion("C_CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIsNotNull() {
            addCriterion("C_CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeEqualTo(Date value) {
            addCriterion("C_CreateTime =", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotEqualTo(Date value) {
            addCriterion("C_CreateTime <>", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThan(Date value) {
            addCriterion("C_CreateTime >", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_CreateTime >=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThan(Date value) {
            addCriterion("C_CreateTime <", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("C_CreateTime <=", value, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeIn(List<Date> values) {
            addCriterion("C_CreateTime in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotIn(List<Date> values) {
            addCriterion("C_CreateTime not in", values, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeBetween(Date value1, Date value2) {
            addCriterion("C_CreateTime between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("C_CreateTime not between", value1, value2, "cCreatetime");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("C_STATE is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("C_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(Integer value) {
            addCriterion("C_STATE =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(Integer value) {
            addCriterion("C_STATE <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(Integer value) {
            addCriterion("C_STATE >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_STATE >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(Integer value) {
            addCriterion("C_STATE <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(Integer value) {
            addCriterion("C_STATE <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<Integer> values) {
            addCriterion("C_STATE in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<Integer> values) {
            addCriterion("C_STATE not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(Integer value1, Integer value2) {
            addCriterion("C_STATE between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(Integer value1, Integer value2) {
            addCriterion("C_STATE not between", value1, value2, "cState");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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