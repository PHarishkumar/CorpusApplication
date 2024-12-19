package com.corpus.models;

import java.io.Serializable;


public class MainContent implements Serializable {
    public int id;
    public String title;
    public String stbCarouselImage;
    public String otherDeviceCarouselImage;
    public String mobileCarouselImage;
    public String description;
    public String shareUrl;
    public String kind;
    public String contentType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStbCarouselImage() {
        return stbCarouselImage;
    }

    public void setStbCarouselImage(String stbCarouselImage) {
        this.stbCarouselImage = stbCarouselImage;
    }

    public String getOtherDeviceCarouselImage() {
        return otherDeviceCarouselImage;
    }

    public void setOtherDeviceCarouselImage(String otherDeviceCarouselImage) {
        this.otherDeviceCarouselImage = otherDeviceCarouselImage;
    }

    public String getMobileCarouselImage() {
        return mobileCarouselImage;
    }

    public void setMobileCarouselImage(String mobileCarouselImage) {
        this.mobileCarouselImage = mobileCarouselImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShareUrl() {
        return shareUrl;
    }

    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getOnScreenAction() {
        return onScreenAction;
    }

    public void setOnScreenAction(String onScreenAction) {
        this.onScreenAction = onScreenAction;
    }

    public String getExternalLink() {
        return externalLink;
    }

    public void setExternalLink(String externalLink) {
        this.externalLink = externalLink;
    }

    public int getFranchiseId() {
        return franchiseId;
    }

    public void setFranchiseId(int franchiseId) {
        this.franchiseId = franchiseId;
    }

    public String content;
    public String onScreenAction;
    public String externalLink;
    public int franchiseId;
}
