package com.cimc.gsms.serialport;

public class SerialPortControl {
	
	private static SerialPortUtils serialPort;

	private SerialPortControl() {}
	public static SerialPortControl getInstance(ParamConfig paramConfig) {		
		serialPort=new SerialPortUtils();
		// 初始化设置,打开串口，开始监听读取串口数据
		serialPort.init(paramConfig);
		return new SerialPortControl();
	}
	
	public static void sendComm(String data) {
		serialPort.sendComm(data);
	}
	
}
