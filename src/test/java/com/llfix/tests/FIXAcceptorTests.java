package com.llfix.tests;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

import com.llfix.api.FIXAcceptor;

public class FIXAcceptorTests {

	@Test
	public void connectionTest() throws IOException{
		FIXAcceptor server = FIXAcceptor.Builder(5555).withDebugStatus(true).build();
		server.startListening();
		
		final Map<String,String> msg = new LinkedHashMap<String,String>();
		//test request or some other msg
		server.sendMsg("SENDER", msg);
		
		System.in.read();
	}
}
