package me.mos.ti.packet;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 用户上线消息报文定义.
 * 
 * @author 刘飞 E-mail:liufei_it@126.com
 * 
 * @version 1.0.0
 * @since 2015年5月31日 上午1:11:50
 */
@XStreamAlias(PacketAlias.PRESENCE_NAME)
public class InPresence extends AbstractPacket {
	
	/** 用户密码 */
	@XStreamAlias("passwd")
	@XStreamAsAttribute
	private String passwd;

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
}