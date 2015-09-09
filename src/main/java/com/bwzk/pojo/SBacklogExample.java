package com.bwzk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SBacklogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SBacklogExample() {
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

        public Criteria andUrgencyIsNull() {
            addCriterion("URGENCY is null");
            return (Criteria) this;
        }

        public Criteria andUrgencyIsNotNull() {
            addCriterion("URGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andUrgencyEqualTo(Integer value) {
            addCriterion("URGENCY =", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotEqualTo(Integer value) {
            addCriterion("URGENCY <>", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThan(Integer value) {
            addCriterion("URGENCY >", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyGreaterThanOrEqualTo(Integer value) {
            addCriterion("URGENCY >=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThan(Integer value) {
            addCriterion("URGENCY <", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyLessThanOrEqualTo(Integer value) {
            addCriterion("URGENCY <=", value, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyIn(List<Integer> values) {
            addCriterion("URGENCY in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotIn(List<Integer> values) {
            addCriterion("URGENCY not in", values, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyBetween(Integer value1, Integer value2) {
            addCriterion("URGENCY between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andUrgencyNotBetween(Integer value1, Integer value2) {
            addCriterion("URGENCY not between", value1, value2, "urgency");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPtableIsNull() {
            addCriterion("PTABLE is null");
            return (Criteria) this;
        }

        public Criteria andPtableIsNotNull() {
            addCriterion("PTABLE is not null");
            return (Criteria) this;
        }

        public Criteria andPtableEqualTo(String value) {
            addCriterion("PTABLE =", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableNotEqualTo(String value) {
            addCriterion("PTABLE <>", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableGreaterThan(String value) {
            addCriterion("PTABLE >", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableGreaterThanOrEqualTo(String value) {
            addCriterion("PTABLE >=", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableLessThan(String value) {
            addCriterion("PTABLE <", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableLessThanOrEqualTo(String value) {
            addCriterion("PTABLE <=", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableLike(String value) {
            addCriterion("PTABLE like", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableNotLike(String value) {
            addCriterion("PTABLE not like", value, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableIn(List<String> values) {
            addCriterion("PTABLE in", values, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableNotIn(List<String> values) {
            addCriterion("PTABLE not in", values, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableBetween(String value1, String value2) {
            addCriterion("PTABLE between", value1, value2, "ptable");
            return (Criteria) this;
        }

        public Criteria andPtableNotBetween(String value1, String value2) {
            addCriterion("PTABLE not between", value1, value2, "ptable");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhIsNull() {
            addCriterion("OPERMODULEZH is null");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhIsNotNull() {
            addCriterion("OPERMODULEZH is not null");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhEqualTo(String value) {
            addCriterion("OPERMODULEZH =", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhNotEqualTo(String value) {
            addCriterion("OPERMODULEZH <>", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhGreaterThan(String value) {
            addCriterion("OPERMODULEZH >", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhGreaterThanOrEqualTo(String value) {
            addCriterion("OPERMODULEZH >=", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhLessThan(String value) {
            addCriterion("OPERMODULEZH <", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhLessThanOrEqualTo(String value) {
            addCriterion("OPERMODULEZH <=", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhLike(String value) {
            addCriterion("OPERMODULEZH like", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhNotLike(String value) {
            addCriterion("OPERMODULEZH not like", value, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhIn(List<String> values) {
            addCriterion("OPERMODULEZH in", values, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhNotIn(List<String> values) {
            addCriterion("OPERMODULEZH not in", values, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhBetween(String value1, String value2) {
            addCriterion("OPERMODULEZH between", value1, value2, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhNotBetween(String value1, String value2) {
            addCriterion("OPERMODULEZH not between", value1, value2, "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerIsNull() {
            addCriterion("OPERMODULEOWNER is null");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerIsNotNull() {
            addCriterion("OPERMODULEOWNER is not null");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerEqualTo(String value) {
            addCriterion("OPERMODULEOWNER =", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerNotEqualTo(String value) {
            addCriterion("OPERMODULEOWNER <>", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerGreaterThan(String value) {
            addCriterion("OPERMODULEOWNER >", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerGreaterThanOrEqualTo(String value) {
            addCriterion("OPERMODULEOWNER >=", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerLessThan(String value) {
            addCriterion("OPERMODULEOWNER <", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerLessThanOrEqualTo(String value) {
            addCriterion("OPERMODULEOWNER <=", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerLike(String value) {
            addCriterion("OPERMODULEOWNER like", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerNotLike(String value) {
            addCriterion("OPERMODULEOWNER not like", value, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerIn(List<String> values) {
            addCriterion("OPERMODULEOWNER in", values, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerNotIn(List<String> values) {
            addCriterion("OPERMODULEOWNER not in", values, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerBetween(String value1, String value2) {
            addCriterion("OPERMODULEOWNER between", value1, value2, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerNotBetween(String value1, String value2) {
            addCriterion("OPERMODULEOWNER not between", value1, value2, "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andOpertypeIsNull() {
            addCriterion("OPERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpertypeIsNotNull() {
            addCriterion("OPERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpertypeEqualTo(Integer value) {
            addCriterion("OPERTYPE =", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotEqualTo(Integer value) {
            addCriterion("OPERTYPE <>", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThan(Integer value) {
            addCriterion("OPERTYPE >", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("OPERTYPE >=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThan(Integer value) {
            addCriterion("OPERTYPE <", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeLessThanOrEqualTo(Integer value) {
            addCriterion("OPERTYPE <=", value, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeIn(List<Integer> values) {
            addCriterion("OPERTYPE in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotIn(List<Integer> values) {
            addCriterion("OPERTYPE not in", values, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeBetween(Integer value1, Integer value2) {
            addCriterion("OPERTYPE between", value1, value2, "opertype");
            return (Criteria) this;
        }

        public Criteria andOpertypeNotBetween(Integer value1, Integer value2) {
            addCriterion("OPERTYPE not between", value1, value2, "opertype");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNull() {
            addCriterion("OPERDATE is null");
            return (Criteria) this;
        }

        public Criteria andOperdateIsNotNull() {
            addCriterion("OPERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperdateEqualTo(Date value) {
            addCriterion("OPERDATE =", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotEqualTo(Date value) {
            addCriterion("OPERDATE <>", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThan(Date value) {
            addCriterion("OPERDATE >", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPERDATE >=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThan(Date value) {
            addCriterion("OPERDATE <", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateLessThanOrEqualTo(Date value) {
            addCriterion("OPERDATE <=", value, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateIn(List<Date> values) {
            addCriterion("OPERDATE in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotIn(List<Date> values) {
            addCriterion("OPERDATE not in", values, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateBetween(Date value1, Date value2) {
            addCriterion("OPERDATE between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andOperdateNotBetween(Date value1, Date value2) {
            addCriterion("OPERDATE not between", value1, value2, "operdate");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNull() {
            addCriterion("USERCODE is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("USERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("USERCODE =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("USERCODE <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("USERCODE >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("USERCODE >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("USERCODE <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("USERCODE <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("USERCODE like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("USERCODE not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("USERCODE in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("USERCODE not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("USERCODE between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("USERCODE not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andIsoperIsNull() {
            addCriterion("ISOPER is null");
            return (Criteria) this;
        }

        public Criteria andIsoperIsNotNull() {
            addCriterion("ISOPER is not null");
            return (Criteria) this;
        }

        public Criteria andIsoperEqualTo(Integer value) {
            addCriterion("ISOPER =", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperNotEqualTo(Integer value) {
            addCriterion("ISOPER <>", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperGreaterThan(Integer value) {
            addCriterion("ISOPER >", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISOPER >=", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperLessThan(Integer value) {
            addCriterion("ISOPER <", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperLessThanOrEqualTo(Integer value) {
            addCriterion("ISOPER <=", value, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperIn(List<Integer> values) {
            addCriterion("ISOPER in", values, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperNotIn(List<Integer> values) {
            addCriterion("ISOPER not in", values, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperBetween(Integer value1, Integer value2) {
            addCriterion("ISOPER between", value1, value2, "isoper");
            return (Criteria) this;
        }

        public Criteria andIsoperNotBetween(Integer value1, Integer value2) {
            addCriterion("ISOPER not between", value1, value2, "isoper");
            return (Criteria) this;
        }

        public Criteria andDetailIsNull() {
            addCriterion("DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andDetailIsNotNull() {
            addCriterion("DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andDetailEqualTo(String value) {
            addCriterion("DETAIL =", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotEqualTo(String value) {
            addCriterion("DETAIL <>", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThan(String value) {
            addCriterion("DETAIL >", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL >=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThan(String value) {
            addCriterion("DETAIL <", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLessThanOrEqualTo(String value) {
            addCriterion("DETAIL <=", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailLike(String value) {
            addCriterion("DETAIL like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotLike(String value) {
            addCriterion("DETAIL not like", value, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailIn(List<String> values) {
            addCriterion("DETAIL in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotIn(List<String> values) {
            addCriterion("DETAIL not in", values, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailBetween(String value1, String value2) {
            addCriterion("DETAIL between", value1, value2, "detail");
            return (Criteria) this;
        }

        public Criteria andDetailNotBetween(String value1, String value2) {
            addCriterion("DETAIL not between", value1, value2, "detail");
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

        public Criteria andPtableLikeInsensitive(String value) {
            addCriterion("upper(PTABLE) like", value.toUpperCase(), "ptable");
            return (Criteria) this;
        }

        public Criteria andTitleLikeInsensitive(String value) {
            addCriterion("upper(TITLE) like", value.toUpperCase(), "title");
            return (Criteria) this;
        }

        public Criteria andOpermodulezhLikeInsensitive(String value) {
            addCriterion("upper(OPERMODULEZH) like", value.toUpperCase(), "opermodulezh");
            return (Criteria) this;
        }

        public Criteria andOpermoduleownerLikeInsensitive(String value) {
            addCriterion("upper(OPERMODULEOWNER) like", value.toUpperCase(), "opermoduleowner");
            return (Criteria) this;
        }

        public Criteria andUsercodeLikeInsensitive(String value) {
            addCriterion("upper(USERCODE) like", value.toUpperCase(), "usercode");
            return (Criteria) this;
        }

        public Criteria andDetailLikeInsensitive(String value) {
            addCriterion("upper(DETAIL) like", value.toUpperCase(), "detail");
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