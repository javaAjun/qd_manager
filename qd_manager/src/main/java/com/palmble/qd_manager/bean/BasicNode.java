package com.palmble.qd_manager.bean;

public class BasicNode extends Node{
	private String Main;//基本交易节点
	private String TransID;//交易流水号
	private String OrderID;//订单号
	private String TransType;//交易类型
	private String TransDate;//出保日期YYYYMMDD
	private String TransTime;//出保时间HHMMSS
	private String PosCode;//POS机编号
	private String SourceID;//出单来源
	private String SurgeryName;//手术名称
	private String SellFormType;//险种类型
	private String ProductCode;//产品代码
	private String EffectDate;//生效日期YYYYMMDD
	private String EffectTime;//生效时间HHMMSS
	private String ExpiryDate;//失效日期YYYYMMDD
	private String ExpiryTime;//失效时间HHMMSS
	private String RelationApp;//投保人与被保人关系
	private String RelationBen;//受益人与被保人关系
	private String SmsStyle;//短信模板
	private String NeedSMS;//是否发送短信
	private String RiskCheckResult;//风险校验超值返回结果
	private String DownLoadLink;//电子保单下载链接
	private String Email;//邮箱地址
	private String TicketNo;//票号 火车票/航班号等
	private String DepartureCity;//出发城市
	private String DepartureDate;//出发日期YYYYMMDD
	private String DepartureTime;//出发时间HHMMSS
	private String ArrivalCity;//到达城市
	private String ArrivalDate;//到达日期
	private String ArrivalTime;//到达时间
	private String OpeartorName;
	private String SalesCode;
	private String SalesName;
	private String MultiYearFlag;
	private String YearType;
	private String MultiYears;
	private String BankCode;
	private String AccName;
	private String BankAccNo;
	private String TransSignature;
	public String getMain() {
		return Main;
	}
	public void setMain(String main) {
		Main = main;
	}
	public String getTransID() {
		return TransID;
	}
	public void setTransID(String transID) {
		TransID = transID;
	}
	public String getOrderID() {
		return OrderID;
	}
	public void setOrderID(String orderID) {
		OrderID = orderID;
	}
	public String getTransType() {
		return TransType;
	}
	public void setTransType(String transType) {
		TransType = transType;
	}
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	public String getPosCode() {
		return PosCode;
	}
	public void setPosCode(String posCode) {
		PosCode = posCode;
	}
	public String getSourceID() {
		return SourceID;
	}
	public void setSourceID(String sourceID) {
		SourceID = sourceID;
	}
	public String getSurgeryName() {
		return SurgeryName;
	}
	public void setSurgeryName(String surgeryName) {
		SurgeryName = surgeryName;
	}
	public String getSellFormType() {
		return SellFormType;
	}
	public void setSellFormType(String sellFormType) {
		SellFormType = sellFormType;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public String getEffectDate() {
		return EffectDate;
	}
	public void setEffectDate(String effectDate) {
		EffectDate = effectDate;
	}
	public String getEffectTime() {
		return EffectTime;
	}
	public void setEffectTime(String effectTime) {
		EffectTime = effectTime;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getExpiryTime() {
		return ExpiryTime;
	}
	public void setExpiryTime(String expiryTime) {
		ExpiryTime = expiryTime;
	}
	public String getRelationApp() {
		return RelationApp;
	}
	public void setRelationApp(String relationApp) {
		RelationApp = relationApp;
	}
	public String getRelationBen() {
		return RelationBen;
	}
	public void setRelationBen(String relationBen) {
		RelationBen = relationBen;
	}
	public String getSmsStyle() {
		return SmsStyle;
	}
	public void setSmsStyle(String smsStyle) {
		SmsStyle = smsStyle;
	}
	public String getNeedSMS() {
		return NeedSMS;
	}
	public void setNeedSMS(String needSMS) {
		NeedSMS = needSMS;
	}
	public String getRiskCheckResult() {
		return RiskCheckResult;
	}
	public void setRiskCheckResult(String riskCheckResult) {
		RiskCheckResult = riskCheckResult;
	}
	public String getDownLoadLink() {
		return DownLoadLink;
	}
	public void setDownLoadLink(String downLoadLink) {
		DownLoadLink = downLoadLink;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getTicketNo() {
		return TicketNo;
	}
	public void setTicketNo(String ticketNo) {
		TicketNo = ticketNo;
	}
	public String getDepartureCity() {
		return DepartureCity;
	}
	public void setDepartureCity(String departureCity) {
		DepartureCity = departureCity;
	}
	public String getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(String departureDate) {
		DepartureDate = departureDate;
	}
	public String getDepartureTime() {
		return DepartureTime;
	}
	public void setDepartureTime(String departureTime) {
		DepartureTime = departureTime;
	}
	public String getArrivalCity() {
		return ArrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		ArrivalCity = arrivalCity;
	}
	public String getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public String getArrivalTime() {
		return ArrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		ArrivalTime = arrivalTime;
	}
	public String getOpeartorName() {
		return OpeartorName;
	}
	public void setOpeartorName(String opeartorName) {
		OpeartorName = opeartorName;
	}
	public String getSalesCode() {
		return SalesCode;
	}
	public void setSalesCode(String salesCode) {
		SalesCode = salesCode;
	}
	public String getSalesName() {
		return SalesName;
	}
	public void setSalesName(String salesName) {
		SalesName = salesName;
	}
	public String getMultiYearFlag() {
		return MultiYearFlag;
	}
	public void setMultiYearFlag(String multiYearFlag) {
		MultiYearFlag = multiYearFlag;
	}
	public String getYearType() {
		return YearType;
	}
	public void setYearType(String yearType) {
		YearType = yearType;
	}
	public String getMultiYears() {
		return MultiYears;
	}
	public void setMultiYears(String multiYears) {
		MultiYears = multiYears;
	}
	public String getBankCode() {
		return BankCode;
	}
	public void setBankCode(String bankCode) {
		BankCode = bankCode;
	}
	public String getAccName() {
		return AccName;
	}
	public void setAccName(String accName) {
		AccName = accName;
	}
	public String getBankAccNo() {
		return BankAccNo;
	}
	public void setBankAccNo(String bankAccNo) {
		BankAccNo = bankAccNo;
	}
	public String getTransSignature() {
		return TransSignature;
	}
	public void setTransSignature(String transSignature) {
		TransSignature = transSignature;
	}
	
}
