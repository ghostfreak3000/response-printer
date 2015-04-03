package com.terasoft.terautils.response_printer;

public class Resp {

    private final String svs;
    private final String status;
    private final String msg;
    
	public Resp(String svs, String status) {
		super();
		this.svs = svs;
		this.status = status;
		this.msg = "";
	}

	public Resp(String svs, String status, String msg) {
		super();
		this.svs = svs;
		this.status = status;
		this.msg = msg;
	}

	public String getSvs() {
		return svs;
	}

	public String getStatus() {
		return status;
	}

	public String getMsg() {
		return msg;
	}
    
}
