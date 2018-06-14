package com.palmble.qd_manager.model;

/**
 * 
* <p>Title: 保单信息实体</p>  
* <p>Description:pamable </p>  
* @author WangYanke  
* @date 2018年6月13日 
* @version 1.0
 */
public class PolicyInfo {
    private Long id;//自增编号
    
    private String transId;//流水号

    private String transDate;//交易日期YYYYMMDD

    private String transTime;//交易时间HHMMSS

    private Integer transType;//如果有且传值01:试算，否则为出单

    private String sourceId;//来源编号

    private String orderId;//订单编号

    private String posCode;//pos机编号

    private String sellFormType;//单证类型

    private String productCode;//产品编号

    private String effectDate;//生效日期

    private String effectTime;//生效时间

    private String expiryDate;//截止日期

    private String expiryTime;//截止时间

    private String needSms;//是否发送短信

    private String ticketNo;//票号(高铁/航班等)

    private String departureCity;//出发地点

    private String departureDate;//出发日期

    private String departureTime;//出发时间

    private String arrivalCity;//到达地点

    private String arrivalDate;//到达日期

    private String arrivalTime;//到达时间

    private String relationApp;//投保人与被保人关系

    private String applicantName;//投保人姓名

    private String applicantType;//投保人证件类型 0--身份证;1--护照;2--军官证;3--驾照;4--出生证明;5--户口簿; 9--数据转换证件;b--港澳台居民内地通行证

    private String applicantNum;//投保人证件号码

    private Integer applicantSex;//投保人性别  0:男1:女

    private String appBirthDate;//投保人生日

    private String applicantAddress;//投保人住址

    private String applicantPhone;//投保人电话

    private String insuredName;//被保人姓名

    private String insuredType;//被保人证件类型  0--身份证;1--护照;2--军官证;3--驾照;4--出生证明;5--户口簿; 9--数据转换证件;b--港澳台居民内地通行证

    private String insuredNum;//被保人证件号码

    private Integer insuredSex;//被保人性别 0:男1:女

    private String insuredBirthDate;//被保人生日

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate == null ? null : transDate.trim();
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime == null ? null : transTime.trim();
    }

    public Integer getTransType() {
        return transType;
    }

    public void setTransType(Integer transType) {
        this.transType = transType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId == null ? null : sourceId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode == null ? null : posCode.trim();
    }

    public String getSellFormType() {
        return sellFormType;
    }

    public void setSellFormType(String sellFormType) {
        this.sellFormType = sellFormType == null ? null : sellFormType.trim();
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getEffectDate() {
        return effectDate;
    }

    public void setEffectDate(String effectDate) {
        this.effectDate = effectDate == null ? null : effectDate.trim();
    }

    public String getEffectTime() {
        return effectTime;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime == null ? null : effectTime.trim();
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate == null ? null : expiryDate.trim();
    }

    public String getExpiryTime() {
        return expiryTime;
    }

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime == null ? null : expiryTime.trim();
    }

    public String getNeedSms() {
        return needSms;
    }

    public void setNeedSms(String needSms) {
        this.needSms = needSms == null ? null : needSms.trim();
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo == null ? null : ticketNo.trim();
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity == null ? null : departureCity.trim();
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate == null ? null : departureDate.trim();
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime == null ? null : departureTime.trim();
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity == null ? null : arrivalCity.trim();
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate == null ? null : arrivalDate.trim();
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime == null ? null : arrivalTime.trim();
    }

    public String getRelationApp() {
        return relationApp;
    }

    public void setRelationApp(String relationApp) {
        this.relationApp = relationApp == null ? null : relationApp.trim();
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName == null ? null : applicantName.trim();
    }

    public String getApplicantType() {
        return applicantType;
    }

    public void setApplicantType(String applicantType) {
        this.applicantType = applicantType == null ? null : applicantType.trim();
    }

    public String getApplicantNum() {
        return applicantNum;
    }

    public void setApplicantNum(String applicantNum) {
        this.applicantNum = applicantNum == null ? null : applicantNum.trim();
    }

    public Integer getApplicantSex() {
        return applicantSex;
    }

    public void setApplicantSex(Integer applicantSex) {
        this.applicantSex = applicantSex;
    }

    public String getAppBirthDate() {
        return appBirthDate;
    }

    public void setAppBirthDate(String appBirthDate) {
        this.appBirthDate = appBirthDate == null ? null : appBirthDate.trim();
    }

    public String getApplicantAddress() {
        return applicantAddress;
    }

    public void setApplicantAddress(String applicantAddress) {
        this.applicantAddress = applicantAddress == null ? null : applicantAddress.trim();
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone == null ? null : applicantPhone.trim();
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName == null ? null : insuredName.trim();
    }

    public String getInsuredType() {
        return insuredType;
    }

    public void setInsuredType(String insuredType) {
        this.insuredType = insuredType == null ? null : insuredType.trim();
    }

    public String getInsuredNum() {
        return insuredNum;
    }

    public void setInsuredNum(String insuredNum) {
        this.insuredNum = insuredNum == null ? null : insuredNum.trim();
    }

    public Integer getInsuredSex() {
        return insuredSex;
    }

    public void setInsuredSex(Integer insuredSex) {
        this.insuredSex = insuredSex;
    }

    public String getInsuredBirthDate() {
        return insuredBirthDate;
    }

    public void setInsuredBirthDate(String insuredBirthDate) {
        this.insuredBirthDate = insuredBirthDate == null ? null : insuredBirthDate.trim();
    }
}