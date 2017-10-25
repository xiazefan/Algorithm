package com.xia.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Sender.java
 *
 * @author gxia002
 */

public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(6666);
			String str = "Hello world";
			byte[] buf = str.getBytes();
			DatagramPacket dp = new DatagramPacket(buf, 0, buf.length, InetAddress.getByName("172.31.161.250"), 8888);
			ds.send(dp);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (ds != null) {
				ds.close();
			}
		}

	}

}
