package com.smile.sz.adc.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 用户个人中心 基本信息
 * Created by Administrator on 2016.5.11 011.
 */
public class UserBaseDto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int id;
    /**
     * 用户真实名
     */
    private String name;

    /**
     * 姓
     */
    private String firstName;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 是否实名
     */
    private Boolean areVerified;

    /**
     * 是否绑手机
     */
    private Boolean isMobileBind;

    /**
     * 是否绑银行卡
     */
    private Boolean isBankBind;

    /**
     * 安全等级
     */
    private Integer securityLevel;

    /**
     * 账户可用余额
     */
    private BigDecimal availableBalance;

    /**
     * 红包卡券数量
     */
    private Integer redCouponCount;

    /**
     * 新手投资机会
     */
    private Integer newbieInvestmentOpportunities;
    /**
     * 修改手机号码的时间 
     * modify by 王露婷 2016-12-27 因为需要变更：接口服务化第一期，需求单号：ID：1005671  
     */
    private Date timeForPhone;
    
    /**
     * 当日修改手机号码的次数
     * modify by 王露婷 2016-12-27 因为需要变更：接口服务化第一期，需求单号：ID：1005671  
     */
    private Integer countForPhone;

    public Date getTimeForPhone() {
		return timeForPhone;
	}

	public void setTimeForPhone(Date timeForPhone) {
		this.timeForPhone = timeForPhone;
	}

	public Integer getCountForPhone() {
		return countForPhone;
	}

	public void setCountForPhone(Integer countForPhone) {
		this.countForPhone = countForPhone;
	}

	public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getAreVerified() {
        return areVerified;
    }

    public void setAreVerified(Boolean areVerified) {
        this.areVerified = areVerified;
    }

    public Boolean getMobileBind() {
        return isMobileBind;
    }

    public void setMobileBind(Boolean mobileBind) {
        isMobileBind = mobileBind;
    }

    public Boolean getBankBind() {
        return isBankBind;
    }

    public void setBankBind(Boolean bankBind) {
        isBankBind = bankBind;
    }

    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }

    public Integer getRedCouponCount() {
        return redCouponCount;
    }

    public void setRedCouponCount(Integer redCouponCount) {
        this.redCouponCount = redCouponCount;
    }

    public Integer getNewbieInvestmentOpportunities() {
        return newbieInvestmentOpportunities;
    }

    public void setNewbieInvestmentOpportunities(Integer newbieInvestmentOpportunities) {
        this.newbieInvestmentOpportunities = newbieInvestmentOpportunities;
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }
    
    @Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}











