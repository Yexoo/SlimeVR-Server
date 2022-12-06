package dev.slimevr.config;


public class OSCRouterConfig {

	// Are the OSC receiver and sender enabled?
	private boolean enabled = false;

	// Port to receive OSC messages from
	private int portIn = 9000;

	// Port to send out OSC messages at
	private int portOut = 9002;

	// Address to send out OSC messages at
	private String address = "127.0.0.1";

	public OSCRouterConfig() {
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean value) {
		enabled = value;
	}

	public int getPortIn() {
		return portIn;
	}

	public void setPortIn(int portIn) {
		this.portIn = portIn;
	}

	public int getPortOut() {
		return portOut;
	}

	public void setPortOut(int portOut) {
		this.portOut = portOut;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}