package com.cimc.gsms.protocol.center;

import com.cimc.gsms.codec.common.MSConsts;
import com.cimc.gsms.codec.data.InformationPackageData;
import com.cimc.gsms.codec.data.InformationRealTimePackageData;
import com.cimc.gsms.codec.data.PackageData;
import com.cimc.gsms.codec.decode.InformationMsgDecoder;
import com.cimc.gsms.codec.decode.InformationRealTimeMsgDecoder;
import com.cimc.gsms.codec.decode.MsgDecoder;

public class ProtocolContralCenter {

	public void dealWithData(final byte[] bt) {
		byte[] re_bs=null;
		if(0x3c!=bt[0] || 0x3e!=bt[bt.length-1]){
			/**处理设备上报的码流*/
			//LogManager.getInstance().PrintGainDeviceLog("deivce",bt);//打印log
			return ;
		}
		// 解析消息头
		MsgDecoder msgDecoder=new MsgDecoder();
		PackageData packageData=msgDecoder.bytes2PackageData(bt);
		int protocol=packageData.getProtocol();//协议标识
		if (MSConsts.msg_id_terminal_gas_info == packageData.getProtocol()) {
			if(packageData.getType()==8) {
				// 处理实时信息
				InformationRealTimePackageData data=new InformationRealTimeMsgDecoder().toInformationfoUploadMsg(packageData);
				System.out.println(data.toString());	
				
			}else {
				// 处理加气信息
				InformationPackageData data=new InformationMsgDecoder().toInformationfoUploadMsg(packageData);
				System.out.println(data.toString());
			}
			
		}else if (MSConsts.msg_id_terminal_gas_index_info == packageData.getProtocol()) {
			
		}else if (MSConsts.msg_id_terminal_set_date == packageData.getProtocol()) {
			
		}else if (MSConsts.msg_id_terminal_gas_blacklist == packageData.getProtocol()) {
			
		}
	}
}
