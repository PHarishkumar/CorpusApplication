package com.corpus.models;

import java.io.Serializable;
import java.util.ArrayList;

public class ContentModel implements Serializable {
    public String title;
    public String command;
    public ArrayList<MainContent> content;
    public String contentType;
    public String bigBannerAdValue;
    public boolean isBigBannerAdEnabled;
    public boolean isSubscriberSpecific;
    public boolean displayNumberSeries;
    public String adImageType;
    public int displayOrder;
    public String iconType;
    public int id;
    public String stbCarouselImage;
    public String otherDeviceCarouselImage;
    public String mobileCarouselImage;
    public String description;
    public String shareUrl;
    public String kind;
    public String onScreenAction;
    public String externalLink;
    public int franchiseId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public ArrayList<MainContent> getContent() {
        return content;
    }

    public void setContent(ArrayList<MainContent> content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getBigBannerAdValue() {
        return bigBannerAdValue;
    }

    public void setBigBannerAdValue(String bigBannerAdValue) {
        this.bigBannerAdValue = bigBannerAdValue;
    }

    public boolean isBigBannerAdEnabled() {
        return isBigBannerAdEnabled;
    }

    public void setBigBannerAdEnabled(boolean bigBannerAdEnabled) {
        isBigBannerAdEnabled = bigBannerAdEnabled;
    }

    public boolean isSubscriberSpecific() {
        return isSubscriberSpecific;
    }

    public void setSubscriberSpecific(boolean subscriberSpecific) {
        isSubscriberSpecific = subscriberSpecific;
    }

    public boolean isDisplayNumberSeries() {
        return displayNumberSeries;
    }

    public void setDisplayNumberSeries(boolean displayNumberSeries) {
        this.displayNumberSeries = displayNumberSeries;
    }

    public String getAdImageType() {
        return adImageType;
    }

    public void setAdImageType(String adImageType) {
        this.adImageType = adImageType;
    }

    public int getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(int displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getIconType() {
        return iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
