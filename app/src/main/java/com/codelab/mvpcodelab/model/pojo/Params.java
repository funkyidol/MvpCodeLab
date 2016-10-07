package com.codelab.mvpcodelab.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Params {

    @SerializedName("paras")
    @Expose
    private int paras;
    @SerializedName("type")
    @Expose
    private String type;

    /**
     * @return The paras
     */
    public int getParas() {
        return paras;
    }

    /**
     * @param paras The paras
     */
    public void setParas(int paras) {
        this.paras = paras;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
