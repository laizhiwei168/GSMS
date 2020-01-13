package com.cimc.gsms.codec.common;

public class MSConsts {
	
	// 标识位
    public static final int pkg_identifier = 0x3c;
    public static final int pkg_identifier2 = 0x3e;
    
    // 查询加气记录
    public static final int msg_id_terminal_gas_info = 0x81;
    
 // 查询指定索引加气记录
    public static final int msg_id_terminal_gas_index_info = 0x89;
    
 // 设置日期和时间
    public static final int msg_id_terminal_set_date = 0x83;
    
 // 黑名单
    public static final int msg_id_terminal_gas_blacklist = 0x86;

}
