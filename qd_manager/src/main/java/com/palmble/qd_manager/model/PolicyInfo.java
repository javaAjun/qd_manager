package com.palmble.qd_manager.model;

/**
 * 
 * <p>
 * Title: 保单信息实体
 * </p>
 * <p>
 * Description:pamable
 * </p>
 * 
 * @author WangYanke
 * @date 2018年6月25日
 * @version 1.0
 */
public class PolicyInfo {
	private Long id;// 编号

	private String transId;

	private String transDate;

	private String transTime;

	private Integer transType;

	private String sourceId;

	private String orderId;

	private String posCode;

	private String sellFormType;

	private String productCode;

	private String insuranceNo;

	private String effectDate;

	private String effectTime;

	private String expiryDate;

	private String expiryTime;

	private Double amount;

	private Double premium;

	private Double totalPremium;

	private String needSms;

	private String ticketNo;

	private String departureCity;

	private String departureDate;

	private String departureTime;

	private String arrivalCity;

	private String arrivalDate;

	private String arrivalTime;

	private String relationApp;

	private String relationBen;

	private String applicantName;

	private String applicantType;

	private String applicantNum;

	private Integer applicantSex;

	private String appBirthDate;

	private String applicantAddress;

	private String applicantPhone;

	private String insuredName;

	private String insuredType;

	private String insuredNum;

	private Integer insuredSex;

	private String insuredBirthDate;

	private String transSignaTure;
	
	private String createTime;
	
	private String updateTime;
	
	private Integer policyStatus;
	
	private Integer payStatus;
	
	private Long userId;
	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getPolicyStatus() {
		return policyStatus;
	}

	public void setPolicyStatus(Integer policyStatus) {
		this.policyStatus = policyStatus;
	}

	public Integer getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

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

	public String getInsuranceNo() {
		return insuranceNo;
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo == null ? null : insuranceNo.trim();
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

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getPremium() {
		return premium;
	}

	public void setPremium(Double premium) {
		this.premium = premium;
	}

	public Double getTotalPremium() {
		return totalPremium;
	}

	public void setTotalPremium(Double totalPremium) {
		this.totalPremium = totalPremium;
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

	public String getRelationBen() {
		return relationBen;
	}

	public void setRelationBen(String relationBen) {
		this.relationBen = relationBen == null ? null : relationBen.trim();
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

	public String getTransSignaTure() {
		return transSignaTure;
	}

	public void setTransSignaTure(String transSignaTure) {
		this.transSignaTure = transSignaTure == null ? null : transSignaTure.trim();
	}
}