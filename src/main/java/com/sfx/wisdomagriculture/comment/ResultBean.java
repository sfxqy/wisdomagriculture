package com.sfx.wisdomagriculture.comment;

public class ResultBean {

    private static final boolean SUCCESS=true;

    private static final boolean FAIL=false;

    private boolean state;

    private Integer code;

    private String msg;

    private Object data;



    public ResultBean() {
        this.state=SUCCESS;
        this.msg="操作成功";
    }

    public ResultBean(boolean state, String msg) {
        this.state = state;
        this.msg = msg;
    }



    public ResultBean(String msg, Object data) {
        this.state = SUCCESS;
        this.msg = msg;
        this.data = data;
    }


    public ResultBean(Object data) {
        this.state = SUCCESS;
        this.msg = "操作成功";
        this.data = data;
    }

    public ResultBean(boolean state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }


    public ResultBean(Throwable e) {
        this.msg = e.toString();
        this.state = FAIL;
    }


}
