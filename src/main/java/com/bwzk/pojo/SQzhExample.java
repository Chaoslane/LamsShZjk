package com.bwzk.pojo;

import java.util.ArrayList;
import java.util.List;

public class SQzhExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SQzhExample() {
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

        public Criteria andDidIsNull() {
            addCriterion("DID is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("DID is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("DID =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("DID <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("DID >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DID >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("DID <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("DID <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("DID in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("DID not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("DID between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("DID not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andQzhIsNull() {
            addCriterion("QZH is null");
            return (Criteria) this;
        }

        public Criteria andQzhIsNotNull() {
            addCriterion("QZH is not null");
            return (Criteria) this;
        }

        public Criteria andQzhEqualTo(String value) {
            addCriterion("QZH =", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotEqualTo(String value) {
            addCriterion("QZH <>", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThan(String value) {
            addCriterion("QZH >", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhGreaterThanOrEqualTo(String value) {
            addCriterion("QZH >=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThan(String value) {
            addCriterion("QZH <", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLessThanOrEqualTo(String value) {
            addCriterion("QZH <=", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhLike(String value) {
            addCriterion("QZH like", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotLike(String value) {
            addCriterion("QZH not like", value, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhIn(List<String> values) {
            addCriterion("QZH in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotIn(List<String> values) {
            addCriterion("QZH not in", values, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhBetween(String value1, String value2) {
            addCriterion("QZH between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzhNotBetween(String value1, String value2) {
            addCriterion("QZH not between", value1, value2, "qzh");
            return (Criteria) this;
        }

        public Criteria andQzmcIsNull() {
            addCriterion("QZMC is null");
            return (Criteria) this;
        }

        public Criteria andQzmcIsNotNull() {
            addCriterion("QZMC is not null");
            return (Criteria) this;
        }

        public Criteria andQzmcEqualTo(String value) {
            addCriterion("QZMC =", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcNotEqualTo(String value) {
            addCriterion("QZMC <>", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcGreaterThan(String value) {
            addCriterion("QZMC >", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcGreaterThanOrEqualTo(String value) {
            addCriterion("QZMC >=", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcLessThan(String value) {
            addCriterion("QZMC <", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcLessThanOrEqualTo(String value) {
            addCriterion("QZMC <=", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcLike(String value) {
            addCriterion("QZMC like", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcNotLike(String value) {
            addCriterion("QZMC not like", value, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcIn(List<String> values) {
            addCriterion("QZMC in", values, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcNotIn(List<String> values) {
            addCriterion("QZMC not in", values, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcBetween(String value1, String value2) {
            addCriterion("QZMC between", value1, value2, "qzmc");
            return (Criteria) this;
        }

        public Criteria andQzmcNotBetween(String value1, String value2) {
            addCriterion("QZMC not between", value1, value2, "qzmc");
            return (Criteria) this;
        }

        public Criteria andIsdefIsNull() {
            addCriterion("ISDEF is null");
            return (Criteria) this;
        }

        public Criteria andIsdefIsNotNull() {
            addCriterion("ISDEF is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefEqualTo(Integer value) {
            addCriterion("ISDEF =", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefNotEqualTo(Integer value) {
            addCriterion("ISDEF <>", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefGreaterThan(Integer value) {
            addCriterion("ISDEF >", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISDEF >=", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefLessThan(Integer value) {
            addCriterion("ISDEF <", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefLessThanOrEqualTo(Integer value) {
            addCriterion("ISDEF <=", value, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefIn(List<Integer> values) {
            addCriterion("ISDEF in", values, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefNotIn(List<Integer> values) {
            addCriterion("ISDEF not in", values, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefBetween(Integer value1, Integer value2) {
            addCriterion("ISDEF between", value1, value2, "isdef");
            return (Criteria) this;
        }

        public Criteria andIsdefNotBetween(Integer value1, Integer value2) {
            addCriterion("ISDEF not between", value1, value2, "isdef");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andQzhLikeInsensitive(String value) {
            addCriterion("upper(QZH) like", value.toUpperCase(), "qzh");
            return (Criteria) this;
        }

        public Criteria andQzmcLikeInsensitive(String value) {
            addCriterion("upper(QZMC) like", value.toUpperCase(), "qzmc");
            return (Criteria) this;
        }

        public Criteria andBzLikeInsensitive(String value) {
            addCriterion("upper(BZ) like", value.toUpperCase(), "bz");
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