package com.gson;

import com.gson.bean.InMessage;
import com.gson.bean.OutMessage;
import com.gson.bean.TextOutMessage;
import com.gson.inf.MessageProcessingHandler;

public class MessageProcessingHandlerImpl implements MessageProcessingHandler{

	@Override
	public void allType(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void textTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		TextOutMessage out = new TextOutMessage();
		out.setContent("您的消息已经收到！");
		setOutMessage(out);
	}

	@Override
	public void locationTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imageTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void videoTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void linkTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void voiceTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eventTypeMsg(InMessage msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterProcess(InMessage inMsg, OutMessage outMsg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setOutMessage(OutMessage outMessage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OutMessage getOutMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
