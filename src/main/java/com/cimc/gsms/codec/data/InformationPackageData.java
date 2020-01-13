package com.cimc.gsms.codec.data;


public class InformationPackageData extends PackageData{
	public InformationPackageData(PackageData packageData){
		this.identifier=packageData.getIdentifier();//标识
		this.element=packageData.getElement();// 单元标识符
		this.protocol=packageData.getProtocol();//协议标识
		this.msgBodyLength=packageData.getMsgBodyLength();//内容长度
		this.msgBodyBytes=packageData.getMsgBodyBytes();//内容
		this.checkSum=packageData.getCheckSum();//校验
	}
	private Integer dataType;
	private Integer dataIndex;
	private String gasCard;//加气卡卡号 
	private Integer buckleCardType;//扣卡方式
	private String car;//车号 
	private Integer dealType;// 交易类型
	private Double gas;//气量 
	private Double money;//金额
	private Double price;//单价
	private Integer unit;//单位
	private String startDateTime;
	private String endDateTime;
	private Integer classCode ;//班号
	private Double  buckleCardMoney;//扣后卡余额
	private Double consumptionMoney; //消费金额
	private Double cumulativeGas;//累计加气重量
	private Double beiyong;//备用
	private Double staffCard;// 员工卡号
	
	
	
	@Override
	public String toString() {
		return "InformationPackageData [dataType=" + dataType + ", dataIndex=" + dataIndex + ", gasCard=" + gasCard
				+ ", buckleCardType=" + buckleCardType + ", car=" + car + ", dealType=" + dealType + ", gas=" + gas
				+ ", money=" + money + ", price=" + price + ", unit=" + unit + ", startDateTime=" + startDateTime
				+ ", endDateTime=" + endDateTime + ", classCode=" + classCode + ", buckleCardMoney=" + buckleCardMoney
				+ ", consumptionMoney=" + consumptionMoney + ", cumulativeGas=" + cumulativeGas + ", beiyong=" + beiyong
				+ ", staffCard=" + staffCard + "]";
	}
	public Integer getDataType() {
		return dataType;
	}
	public void setDataType(Integer dataType) {
		this.dataType = dataType;
	}
	public Integer getDataIndex() {
		return dataIndex;
	}
	public void setDataIndex(Integer dataIndex) {
		this.dataIndex = dataIndex;
	}
	public String getGasCard() {
		return gasCard;
	}
	public void setGasCard(String gasCard) {
		this.gasCard = gasCard;
	}
	public Integer getBuckleCardType() {
		return buckleCardType;
	}
	public void setBuckleCardType(Integer buckleCardType) {
		this.buckleCardType = buckleCardType;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String car) {
		this.car = car;
	}
	public Integer getDealType() {
		return dealType;
	}
	public void setDealType(Integer dealType) {
		this.dealType = dealType;
	}
	public Double getGas() {
		return gas;
	}
	public void setGas(Double gas) {
		this.gas = gas;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getUnit() {
		return unit;
	}
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	public String getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(String startDateTime) {
		this.startDateTime = startDateTime;
	}
	public String getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(String endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Integer getClassCode() {
		return classCode;
	}
	public void setClassCode(Integer classCode) {
		this.classCode = classCode;
	}
	public Double getBuckleCardMoney() {
		return buckleCardMoney;
	}
	public void setBuckleCardMoney(Double buckleCardMoney) {
		this.buckleCardMoney = buckleCardMoney;
	}
	public Double getConsumptionMoney() {
		return consumptionMoney;
	}
	public void setConsumptionMoney(Double consumptionMoney) {
		this.consumptionMoney = consumptionMoney;
	}
	public Double getCumulativeGas() {
		return cumulativeGas;
	}
	public void setCumulativeGas(Double cumulativeGas) {
		this.cumulativeGas = cumulativeGas;
	}
	public Double getBeiyong() {
		return beiyong;
	}
	public void setBeiyong(Double beiyong) {
		this.beiyong = beiyong;
	}
	public Double getStaffCard() {
		return staffCard;
	}
	public void setStaffCard(Double staffCard) {
		this.staffCard = staffCard;
	}
	
}
