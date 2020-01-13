package com.cimc.gsms.app;

import com.cimc.gsms.serialport.ParamConfig;
import com.cimc.gsms.serialport.SerialPortControl;
import com.cimc.gsms.serialport.SerialPortUtils;

public class AppStart {

	public static void main(String[] args) {

        // 创建串口必要参数接收类并赋值，赋值串口号，波特率，校验位，数据位，停止位 
        ParamConfig paramConfig = new ParamConfig("COM1", 9600, 0, 8, 1);
        // 初始化设置,打开串口，开始监听读取串口数据
        SerialPortControl serialPortControl=SerialPortControl.getInstance(paramConfig);
        // 调用串口操作类的sendComm方法发送数据到串口
        serialPortControl.sendComm("3C01310102A4673E");
        // 关闭串口
        //serialPort.closeSerialPort();
        /*while (true) {
			try {
				serialPort.sendComm("3C01310102A4673E");
				Thread.sleep(6000);					
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}*/
    
	}
}
