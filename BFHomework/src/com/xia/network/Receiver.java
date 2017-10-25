package com.xia.network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Receiver.java
 *
 * @author gxia002
 */

public class Receiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket ds = null;
		try {
			ds = new DatagramSocket(8888);
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, 0, buf.length);
			ds.receive(dp);
			String recStr = new String(buf, 0, buf.length);
			System.out.println("Receive Data:" + recStr);
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
