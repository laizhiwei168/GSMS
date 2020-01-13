package com.cimc.gsms.codec.decode;

import com.cimc.gsms.codec.common.MSConsts;
import com.cimc.gsms.codec.data.PackageData;
import com.cimc.gsms.utils.Utilty;

public class MsgDecoder {
	private Utilty utilty=new Utilty();
	public PackageData bytes2PackageData(byte[] data) {
		PackageData packageData=null;
	   	try{
	   		packageData=new PackageData();
			packageData.setIdentifier(utilty.bytes2Int(data, 0, 1));
			packageData.setElement(utilty.bytes2Int(data, 1, 1));
			packageData.setProtocol(utilty.bytes2Int(data, 2, 1));
			packageData.setMsgBodyLength(utilty.bytes2Int(data, 3, 1));			
			byte[] tmp = new byte[packageData.getMsgBodyLength()];
			System.arraycopy(data, 4, tmp, 0, tmp.length);
			packageData.setMsgBodyBytes(tmp);
			if(tmp.length>0) {
			packageData.setType(tmp[tmp.length-1]);
			}			
	   	} catch(Exception e){
	   		System.out.println(" == == 无法识别设备的设备号位数  或 设备内容长度有误  == == "+e);
	   	}
		return packageData;				
	}

}
