package com.bwzk.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SUserExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNull() {
            addCriterion("PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andPasswdIsNotNull() {
            addCriterion("PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswdEqualTo(String value) {
            addCriterion("PASSWD =", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotEqualTo(String value) {
            addCriterion("PASSWD <>", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThan(String value) {
            addCriterion("PASSWD >", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWD >=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThan(String value) {
            addCriterion("PASSWD <", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLessThanOrEqualTo(String value) {
            addCriterion("PASSWD <=", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdLike(String value) {
            addCriterion("PASSWD like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotLike(String value) {
            addCriterion("PASSWD not like", value, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdIn(List<String> values) {
            addCriterion("PASSWD in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotIn(List<String> values) {
            addCriterion("PASSWD not in", values, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdBetween(String value1, String value2) {
            addCriterion("PASSWD between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andPasswdNotBetween(String value1, String value2) {
            addCriterion("PASSWD not between", value1, value2, "passwd");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTelOIsNull() {
            addCriterion("TEL_O is null");
            return (Criteria) this;
        }

        public Criteria andTelOIsNotNull() {
            addCriterion("TEL_O is not null");
            return (Criteria) this;
        }

        public Criteria andTelOEqualTo(String value) {
            addCriterion("TEL_O =", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelONotEqualTo(String value) {
            addCriterion("TEL_O <>", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOGreaterThan(String value) {
            addCriterion("TEL_O >", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_O >=", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOLessThan(String value) {
            addCriterion("TEL_O <", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOLessThanOrEqualTo(String value) {
            addCriterion("TEL_O <=", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOLike(String value) {
            addCriterion("TEL_O like", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelONotLike(String value) {
            addCriterion("TEL_O not like", value, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOIn(List<String> values) {
            addCriterion("TEL_O in", values, "telO");
            return (Criteria) this;
        }

        public Criteria andTelONotIn(List<String> values) {
            addCriterion("TEL_O not in", values, "telO");
            return (Criteria) this;
        }

        public Criteria andTelOBetween(String value1, String value2) {
            addCriterion("TEL_O between", value1, value2, "telO");
            return (Criteria) this;
        }

        public Criteria andTelONotBetween(String value1, String value2) {
            addCriterion("TEL_O not between", value1, value2, "telO");
            return (Criteria) this;
        }

        public Criteria andTelHIsNull() {
            addCriterion("TEL_H is null");
            return (Criteria) this;
        }

        public Criteria andTelHIsNotNull() {
            addCriterion("TEL_H is not null");
            return (Criteria) this;
        }

        public Criteria andTelHEqualTo(String value) {
            addCriterion("TEL_H =", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHNotEqualTo(String value) {
            addCriterion("TEL_H <>", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHGreaterThan(String value) {
            addCriterion("TEL_H >", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_H >=", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHLessThan(String value) {
            addCriterion("TEL_H <", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHLessThanOrEqualTo(String value) {
            addCriterion("TEL_H <=", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHLike(String value) {
            addCriterion("TEL_H like", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHNotLike(String value) {
            addCriterion("TEL_H not like", value, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHIn(List<String> values) {
            addCriterion("TEL_H in", values, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHNotIn(List<String> values) {
            addCriterion("TEL_H not in", values, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHBetween(String value1, String value2) {
            addCriterion("TEL_H between", value1, value2, "telH");
            return (Criteria) this;
        }

        public Criteria andTelHNotBetween(String value1, String value2) {
            addCriterion("TEL_H not between", value1, value2, "telH");
            return (Criteria) this;
        }

        public Criteria andTelMIsNull() {
            addCriterion("TEL_M is null");
            return (Criteria) this;
        }

        public Criteria andTelMIsNotNull() {
            addCriterion("TEL_M is not null");
            return (Criteria) this;
        }

        public Criteria andTelMEqualTo(String value) {
            addCriterion("TEL_M =", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMNotEqualTo(String value) {
            addCriterion("TEL_M <>", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMGreaterThan(String value) {
            addCriterion("TEL_M >", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMGreaterThanOrEqualTo(String value) {
            addCriterion("TEL_M >=", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMLessThan(String value) {
            addCriterion("TEL_M <", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMLessThanOrEqualTo(String value) {
            addCriterion("TEL_M <=", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMLike(String value) {
            addCriterion("TEL_M like", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMNotLike(String value) {
            addCriterion("TEL_M not like", value, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMIn(List<String> values) {
            addCriterion("TEL_M in", values, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMNotIn(List<String> values) {
            addCriterion("TEL_M not in", values, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMBetween(String value1, String value2) {
            addCriterion("TEL_M between", value1, value2, "telM");
            return (Criteria) this;
        }

        public Criteria andTelMNotBetween(String value1, String value2) {
            addCriterion("TEL_M not between", value1, value2, "telM");
            return (Criteria) this;
        }

        public Criteria andCardIsNull() {
            addCriterion("CARD is null");
            return (Criteria) this;
        }

        public Criteria andCardIsNotNull() {
            addCriterion("CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCardEqualTo(String value) {
            addCriterion("CARD =", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotEqualTo(String value) {
            addCriterion("CARD <>", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThan(String value) {
            addCriterion("CARD >", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardGreaterThanOrEqualTo(String value) {
            addCriterion("CARD >=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThan(String value) {
            addCriterion("CARD <", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLessThanOrEqualTo(String value) {
            addCriterion("CARD <=", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardLike(String value) {
            addCriterion("CARD like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotLike(String value) {
            addCriterion("CARD not like", value, "card");
            return (Criteria) this;
        }

        public Criteria andCardIn(List<String> values) {
            addCriterion("CARD in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotIn(List<String> values) {
            addCriterion("CARD not in", values, "card");
            return (Criteria) this;
        }

        public Criteria andCardBetween(String value1, String value2) {
            addCriterion("CARD between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andCardNotBetween(String value1, String value2) {
            addCriterion("CARD not between", value1, value2, "card");
            return (Criteria) this;
        }

        public Criteria andAddrOIsNull() {
            addCriterion("ADDR_O is null");
            return (Criteria) this;
        }

        public Criteria andAddrOIsNotNull() {
            addCriterion("ADDR_O is not null");
            return (Criteria) this;
        }

        public Criteria andAddrOEqualTo(String value) {
            addCriterion("ADDR_O =", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrONotEqualTo(String value) {
            addCriterion("ADDR_O <>", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOGreaterThan(String value) {
            addCriterion("ADDR_O >", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_O >=", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOLessThan(String value) {
            addCriterion("ADDR_O <", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOLessThanOrEqualTo(String value) {
            addCriterion("ADDR_O <=", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOLike(String value) {
            addCriterion("ADDR_O like", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrONotLike(String value) {
            addCriterion("ADDR_O not like", value, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOIn(List<String> values) {
            addCriterion("ADDR_O in", values, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrONotIn(List<String> values) {
            addCriterion("ADDR_O not in", values, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrOBetween(String value1, String value2) {
            addCriterion("ADDR_O between", value1, value2, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrONotBetween(String value1, String value2) {
            addCriterion("ADDR_O not between", value1, value2, "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrHIsNull() {
            addCriterion("ADDR_H is null");
            return (Criteria) this;
        }

        public Criteria andAddrHIsNotNull() {
            addCriterion("ADDR_H is not null");
            return (Criteria) this;
        }

        public Criteria andAddrHEqualTo(String value) {
            addCriterion("ADDR_H =", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHNotEqualTo(String value) {
            addCriterion("ADDR_H <>", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHGreaterThan(String value) {
            addCriterion("ADDR_H >", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR_H >=", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHLessThan(String value) {
            addCriterion("ADDR_H <", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHLessThanOrEqualTo(String value) {
            addCriterion("ADDR_H <=", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHLike(String value) {
            addCriterion("ADDR_H like", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHNotLike(String value) {
            addCriterion("ADDR_H not like", value, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHIn(List<String> values) {
            addCriterion("ADDR_H in", values, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHNotIn(List<String> values) {
            addCriterion("ADDR_H not in", values, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHBetween(String value1, String value2) {
            addCriterion("ADDR_H between", value1, value2, "addrH");
            return (Criteria) this;
        }

        public Criteria andAddrHNotBetween(String value1, String value2) {
            addCriterion("ADDR_H not between", value1, value2, "addrH");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
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

        public Criteria andIslsyhIsNull() {
            addCriterion("ISLSYH is null");
            return (Criteria) this;
        }

        public Criteria andIslsyhIsNotNull() {
            addCriterion("ISLSYH is not null");
            return (Criteria) this;
        }

        public Criteria andIslsyhEqualTo(Integer value) {
            addCriterion("ISLSYH =", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhNotEqualTo(Integer value) {
            addCriterion("ISLSYH <>", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhGreaterThan(Integer value) {
            addCriterion("ISLSYH >", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISLSYH >=", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhLessThan(Integer value) {
            addCriterion("ISLSYH <", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhLessThanOrEqualTo(Integer value) {
            addCriterion("ISLSYH <=", value, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhIn(List<Integer> values) {
            addCriterion("ISLSYH in", values, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhNotIn(List<Integer> values) {
            addCriterion("ISLSYH not in", values, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhBetween(Integer value1, Integer value2) {
            addCriterion("ISLSYH between", value1, value2, "islsyh");
            return (Criteria) this;
        }

        public Criteria andIslsyhNotBetween(Integer value1, Integer value2) {
            addCriterion("ISLSYH not between", value1, value2, "islsyh");
            return (Criteria) this;
        }

        public Criteria andYxqsrqIsNull() {
            addCriterion("YXQSRQ is null");
            return (Criteria) this;
        }

        public Criteria andYxqsrqIsNotNull() {
            addCriterion("YXQSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYxqsrqEqualTo(Date value) {
            addCriterion("YXQSRQ =", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqNotEqualTo(Date value) {
            addCriterion("YXQSRQ <>", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqGreaterThan(Date value) {
            addCriterion("YXQSRQ >", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqGreaterThanOrEqualTo(Date value) {
            addCriterion("YXQSRQ >=", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqLessThan(Date value) {
            addCriterion("YXQSRQ <", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqLessThanOrEqualTo(Date value) {
            addCriterion("YXQSRQ <=", value, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqIn(List<Date> values) {
            addCriterion("YXQSRQ in", values, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqNotIn(List<Date> values) {
            addCriterion("YXQSRQ not in", values, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqBetween(Date value1, Date value2) {
            addCriterion("YXQSRQ between", value1, value2, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxqsrqNotBetween(Date value1, Date value2) {
            addCriterion("YXQSRQ not between", value1, value2, "yxqsrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqIsNull() {
            addCriterion("YXZZRQ is null");
            return (Criteria) this;
        }

        public Criteria andYxzzrqIsNotNull() {
            addCriterion("YXZZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYxzzrqEqualTo(Date value) {
            addCriterion("YXZZRQ =", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqNotEqualTo(Date value) {
            addCriterion("YXZZRQ <>", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqGreaterThan(Date value) {
            addCriterion("YXZZRQ >", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqGreaterThanOrEqualTo(Date value) {
            addCriterion("YXZZRQ >=", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqLessThan(Date value) {
            addCriterion("YXZZRQ <", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqLessThanOrEqualTo(Date value) {
            addCriterion("YXZZRQ <=", value, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqIn(List<Date> values) {
            addCriterion("YXZZRQ in", values, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqNotIn(List<Date> values) {
            addCriterion("YXZZRQ not in", values, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqBetween(Date value1, Date value2) {
            addCriterion("YXZZRQ between", value1, value2, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andYxzzrqNotBetween(Date value1, Date value2) {
            addCriterion("YXZZRQ not between", value1, value2, "yxzzrq");
            return (Criteria) this;
        }

        public Criteria andMacinfoIsNull() {
            addCriterion("MACINFO is null");
            return (Criteria) this;
        }

        public Criteria andMacinfoIsNotNull() {
            addCriterion("MACINFO is not null");
            return (Criteria) this;
        }

        public Criteria andMacinfoEqualTo(String value) {
            addCriterion("MACINFO =", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoNotEqualTo(String value) {
            addCriterion("MACINFO <>", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoGreaterThan(String value) {
            addCriterion("MACINFO >", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoGreaterThanOrEqualTo(String value) {
            addCriterion("MACINFO >=", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoLessThan(String value) {
            addCriterion("MACINFO <", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoLessThanOrEqualTo(String value) {
            addCriterion("MACINFO <=", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoLike(String value) {
            addCriterion("MACINFO like", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoNotLike(String value) {
            addCriterion("MACINFO not like", value, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoIn(List<String> values) {
            addCriterion("MACINFO in", values, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoNotIn(List<String> values) {
            addCriterion("MACINFO not in", values, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoBetween(String value1, String value2) {
            addCriterion("MACINFO between", value1, value2, "macinfo");
            return (Criteria) this;
        }

        public Criteria andMacinfoNotBetween(String value1, String value2) {
            addCriterion("MACINFO not between", value1, value2, "macinfo");
            return (Criteria) this;
        }

        public Criteria andCheckmacIsNull() {
            addCriterion("CHECKMAC is null");
            return (Criteria) this;
        }

        public Criteria andCheckmacIsNotNull() {
            addCriterion("CHECKMAC is not null");
            return (Criteria) this;
        }

        public Criteria andCheckmacEqualTo(Integer value) {
            addCriterion("CHECKMAC =", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacNotEqualTo(Integer value) {
            addCriterion("CHECKMAC <>", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacGreaterThan(Integer value) {
            addCriterion("CHECKMAC >", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECKMAC >=", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacLessThan(Integer value) {
            addCriterion("CHECKMAC <", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacLessThanOrEqualTo(Integer value) {
            addCriterion("CHECKMAC <=", value, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacIn(List<Integer> values) {
            addCriterion("CHECKMAC in", values, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacNotIn(List<Integer> values) {
            addCriterion("CHECKMAC not in", values, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacBetween(Integer value1, Integer value2) {
            addCriterion("CHECKMAC between", value1, value2, "checkmac");
            return (Criteria) this;
        }

        public Criteria andCheckmacNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECKMAC not between", value1, value2, "checkmac");
            return (Criteria) this;
        }

        public Criteria andIsempowerIsNull() {
            addCriterion("ISEMPOWER is null");
            return (Criteria) this;
        }

        public Criteria andIsempowerIsNotNull() {
            addCriterion("ISEMPOWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsempowerEqualTo(Integer value) {
            addCriterion("ISEMPOWER =", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerNotEqualTo(Integer value) {
            addCriterion("ISEMPOWER <>", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerGreaterThan(Integer value) {
            addCriterion("ISEMPOWER >", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISEMPOWER >=", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerLessThan(Integer value) {
            addCriterion("ISEMPOWER <", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerLessThanOrEqualTo(Integer value) {
            addCriterion("ISEMPOWER <=", value, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerIn(List<Integer> values) {
            addCriterion("ISEMPOWER in", values, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerNotIn(List<Integer> values) {
            addCriterion("ISEMPOWER not in", values, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerBetween(Integer value1, Integer value2) {
            addCriterion("ISEMPOWER between", value1, value2, "isempower");
            return (Criteria) this;
        }

        public Criteria andIsempowerNotBetween(Integer value1, Integer value2) {
            addCriterion("ISEMPOWER not between", value1, value2, "isempower");
            return (Criteria) this;
        }

        public Criteria andFqjsIsNull() {
            addCriterion("FQJS is null");
            return (Criteria) this;
        }

        public Criteria andFqjsIsNotNull() {
            addCriterion("FQJS is not null");
            return (Criteria) this;
        }

        public Criteria andFqjsEqualTo(String value) {
            addCriterion("FQJS =", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsNotEqualTo(String value) {
            addCriterion("FQJS <>", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsGreaterThan(String value) {
            addCriterion("FQJS >", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsGreaterThanOrEqualTo(String value) {
            addCriterion("FQJS >=", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsLessThan(String value) {
            addCriterion("FQJS <", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsLessThanOrEqualTo(String value) {
            addCriterion("FQJS <=", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsLike(String value) {
            addCriterion("FQJS like", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsNotLike(String value) {
            addCriterion("FQJS not like", value, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsIn(List<String> values) {
            addCriterion("FQJS in", values, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsNotIn(List<String> values) {
            addCriterion("FQJS not in", values, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsBetween(String value1, String value2) {
            addCriterion("FQJS between", value1, value2, "fqjs");
            return (Criteria) this;
        }

        public Criteria andFqjsNotBetween(String value1, String value2) {
            addCriterion("FQJS not between", value1, value2, "fqjs");
            return (Criteria) this;
        }

        public Criteria andManagedepIsNull() {
            addCriterion("MANAGEDEP is null");
            return (Criteria) this;
        }

        public Criteria andManagedepIsNotNull() {
            addCriterion("MANAGEDEP is not null");
            return (Criteria) this;
        }

        public Criteria andManagedepEqualTo(String value) {
            addCriterion("MANAGEDEP =", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepNotEqualTo(String value) {
            addCriterion("MANAGEDEP <>", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepGreaterThan(String value) {
            addCriterion("MANAGEDEP >", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGEDEP >=", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepLessThan(String value) {
            addCriterion("MANAGEDEP <", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepLessThanOrEqualTo(String value) {
            addCriterion("MANAGEDEP <=", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepLike(String value) {
            addCriterion("MANAGEDEP like", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepNotLike(String value) {
            addCriterion("MANAGEDEP not like", value, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepIn(List<String> values) {
            addCriterion("MANAGEDEP in", values, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepNotIn(List<String> values) {
            addCriterion("MANAGEDEP not in", values, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepBetween(String value1, String value2) {
            addCriterion("MANAGEDEP between", value1, value2, "managedep");
            return (Criteria) this;
        }

        public Criteria andManagedepNotBetween(String value1, String value2) {
            addCriterion("MANAGEDEP not between", value1, value2, "managedep");
            return (Criteria) this;
        }

        public Criteria andUsercodeLikeInsensitive(String value) {
            addCriterion("upper(USERCODE) like", value.toUpperCase(), "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(USERNAME) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswdLikeInsensitive(String value) {
            addCriterion("upper(PASSWD) like", value.toUpperCase(), "passwd");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andTelOLikeInsensitive(String value) {
            addCriterion("upper(TEL_O) like", value.toUpperCase(), "telO");
            return (Criteria) this;
        }

        public Criteria andTelHLikeInsensitive(String value) {
            addCriterion("upper(TEL_H) like", value.toUpperCase(), "telH");
            return (Criteria) this;
        }

        public Criteria andTelMLikeInsensitive(String value) {
            addCriterion("upper(TEL_M) like", value.toUpperCase(), "telM");
            return (Criteria) this;
        }

        public Criteria andCardLikeInsensitive(String value) {
            addCriterion("upper(CARD) like", value.toUpperCase(), "card");
            return (Criteria) this;
        }

        public Criteria andAddrOLikeInsensitive(String value) {
            addCriterion("upper(ADDR_O) like", value.toUpperCase(), "addrO");
            return (Criteria) this;
        }

        public Criteria andAddrHLikeInsensitive(String value) {
            addCriterion("upper(ADDR_H) like", value.toUpperCase(), "addrH");
            return (Criteria) this;
        }

        public Criteria andQqLikeInsensitive(String value) {
            addCriterion("upper(QQ) like", value.toUpperCase(), "qq");
            return (Criteria) this;
        }

        public Criteria andBzLikeInsensitive(String value) {
            addCriterion("upper(BZ) like", value.toUpperCase(), "bz");
            return (Criteria) this;
        }

        public Criteria andMacinfoLikeInsensitive(String value) {
            addCriterion("upper(MACINFO) like", value.toUpperCase(), "macinfo");
            return (Criteria) this;
        }

        public Criteria andFqjsLikeInsensitive(String value) {
            addCriterion("upper(FQJS) like", value.toUpperCase(), "fqjs");
            return (Criteria) this;
        }

        public Criteria andManagedepLikeInsensitive(String value) {
            addCriterion("upper(MANAGEDEP) like", value.toUpperCase(), "managedep");
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