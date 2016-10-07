package com.codelab.mvpcodelab.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class HipsterModel {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("params")
    @Expose
    private Params params;

    /**
     * @return The text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return The params
     */
    public Params getParams() {
        return params;
    }

    /**
     * @param params The params
     */
    public void setParams(Params params) {
        this.params = params;
    }

}
