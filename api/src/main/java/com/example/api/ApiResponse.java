package com.example.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mrstranger on 16/6/15.
 */
public class ApiResponse<T> {
    @SerializedName("event")
    @Expose
    private String event;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("user")
    @Expose
    private T user;

    /**
     *
     * @return
     * The event
     */
    public String getEvent() {
        return event;
    }

    /**
     *
     * @param event
     * The event
     */
    public void setEvent(String event) {
        this.event = event;
    }

    /**
     *
     * @return
     * The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     *
     * @param msg
     * The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     *
     * @return
     * The user
     */
    public T getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(T user) {
        this.user = user;
    }


}
