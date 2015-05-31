package me.mos.ti.packet;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 * 聊天通讯消息报文定义.
 * 
 * @author 刘飞 E-mail:liufei_it@126.com
 * 
 * @version 1.0.0
 * @since 2015年5月30日 下午9:46:53
 */
@XStreamAlias(PacketAlias.MESSAGE_NAME)
public class InMessage extends AbstractPacket {
	
	/** 消息到达方的用户的唯一ID */
	@XStreamAlias("tid")
	@XStreamAsAttribute
	private long tid;

	/** 消息内容体 */
	@XStreamAlias("body")
	private String body;

	/** 消息发送时间 */
	@XStreamAlias("gmt-created")
	@XStreamAsAttribute
	private long gmt_created;

	public long getTid() {
		return tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public long getGmt_created() {
		return gmt_created;
	}

	public void setGmt_created(long gmt_created) {
		this.gmt_created = gmt_created;
	}
}