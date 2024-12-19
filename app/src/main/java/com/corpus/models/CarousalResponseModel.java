package com.corpus.models;

import java.io.Serializable;
import java.util.ArrayList;


public class CarousalResponseModel implements Serializable {
    public ResponseStatus responseStatus;
    public ArrayList<ContentModel> content;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public ArrayList<ContentModel> getContent() {
        return content;
    }

    public void setContent(ArrayList<ContentModel> content) {
        this.content = content;
    }
}
