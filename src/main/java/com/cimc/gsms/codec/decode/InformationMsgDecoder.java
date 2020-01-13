package com.cimc.gsms.codec.decode;

import java.text.DecimalFormat;

import com.cimc.gsms.codec.data.InformationPackageData;
import com.cimc.gsms.codec.data.PackageData;
import com.cimc.gsms.utils.Utilty;

public class InformationMsgDecoder {
	 Utilty utilty=new Utilty();
	public InformationPackageData toInformationfoUploadMsg(PackageData packageData) {
		InformationPackageData data=new InformationPackageData(packageData);
		byte[] body_bt=packageData.getMsgBodyBytes();
		
		data.setDataType(utilty.bytes2Int(body_bt, 0, 1));
		data.setDataIndex(utilty.bytes2Int(body_bt, 1, 4));;
		data.setGasCard(utilty.toStringByte(body_bt, 5, 8));;//加气卡卡号 
		data.setBuckleCardType(utilty.bytes2Int(body_bt, 9, 1));;//扣卡方式
		data.setCar(utilty.toStringByte(body_bt, 10, 16));;//车号 
		data.setDealType(utilty.bytes2Int(body_bt, 17, 1));;// 交易类型
		data.setGas(toDouble(body_bt, 18, 4));;//气量 
		data.setMoney(toDouble(body_bt, 22, 4));;//金额
		data.setPrice(toDouble(body_bt, 26, 2));;//单价
		data.setUnit(utilty.bytes2Int(body_bt, 28, 1));;//单位
		data.setStartDateTime(utilty.toStringByte(body_bt, 29, 34));;
		data.setEndDateTime(utilty.toStringByte(body_bt, 35, 40));;
		data.setClassCode(utilty.bytes2Int(body_bt, 41, 2));;//班号
		
		data.setBuckleCardMoney(todouble(utilty.bytes2IntTurn(body_bt, 43, 4),100));//扣后卡余额
		data.setConsumptionMoney(todouble(utilty.bytes2Int(body_bt, 47, 4),100));; //消费金额
		data.setCumulativeGas(todouble(utilty.bytes2Int(body_bt, 51, 4),100));;//累计加气重量
		
		//data.setBeiyong(utilty.bytes2Int(body_bt, 55, 4));;//备用
		data.setStaffCard(toDouble(body_bt, 59, 4));;// 员工卡号
		return data;
		
	}
	
	public double todouble(int a,int b) {
   	 DecimalFormat df=new DecimalFormat("0.00");//设置保留位数    	 
	    return Double.valueOf(df.format((float)a/b));
   }
	
	public double toDouble(byte[] b, int start, int length) {		
		int i=utilty.bytes2IntTurn(b, start+1, length-1);
		int i1=b[start];
		Double d=new Double(i+"."+i1);
		return d;
	}

}
