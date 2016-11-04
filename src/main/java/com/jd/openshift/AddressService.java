package com.jd.openshift;

import java.net.InetAddress;

import org.springframework.stereotype.Service;

@Service
public class AddressService {

	public String getServerAddress() throws Exception {

		final String serverAddress = InetAddress.getLocalHost().getHostAddress();

		return serverAddress;
	}
}
