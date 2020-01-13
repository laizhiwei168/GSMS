package com.cimc.gsms.codec.data;

public class PackageData {

	protected int identifier;//标识
	protected int element;// 单元标识符
	protected int protocol;//协议标识
	protected int msgBodyLength;//内容长度	
	protected byte[] msgBodyBytes;//内容
	protected int checkSum;//校验	
	protected int type;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getIdentifier() {
		return identifier;
	}
	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}
	public int getElement() {
		return element;
	}
	public void setElement(int element) {
		this.element = element;
	}
	public int getProtocol() {
		return protocol;
	}
	public void setProtocol(int protocol) {
		this.protocol = protocol;
	}
	public int getMsgBodyLength() {
		return msgBodyLength;
	}
	public void setMsgBodyLength(int msgBodyLength) {
		this.msgBodyLength = msgBodyLength;
	}
	public byte[] getMsgBodyBytes() {
		return msgBodyBytes;
	}
	public void setMsgBodyBytes(byte[] msgBodyBytes) {
		this.msgBodyBytes = msgBodyBytes;
	}
	public int getCheckSum() {
		return checkSum;
	}
	public void setCheckSum(int checkSum) {
		this.checkSum = checkSum;
	}
	
}
