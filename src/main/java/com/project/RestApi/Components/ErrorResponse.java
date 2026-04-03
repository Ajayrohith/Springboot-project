package com.project.RestApi.Components;

public class ErrorResponse {

    private int errorcode;
    private String errormsg;
    private long timestamp;
    public int getErrorcode() {
        return errorcode;
    }
    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }
    public String getErrormsg() {
        return errormsg;
    }
    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
    public long getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
    public ErrorResponse(int errorcode, String errormsg, long timestamp) {
        this.errorcode = errorcode;
        this.errormsg = errormsg;
        this.timestamp = timestamp;
    }
    @Override
    public String toString() {
        return "ErrorResponse [errorcode=" + errorcode + ", errormsg=" + errormsg + ", timestamp=" + timestamp + "]";
    }
    

    


}
