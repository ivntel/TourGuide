package com.example.ivnte.tourguide;

/**
 * Created by ivnte on 2016-09-29.
 */
public class SiteDetails {
    private String siteName;
    private String siteAddress;
    private int siteIcon;

    public SiteDetails(){
        super();
    }

    public SiteDetails(String siteName, String siteAddress, int siteIcon) {
        super();
        this.siteName = siteName;
        this.siteAddress = siteAddress;
        this.siteIcon= siteIcon;
    }

    public String getSiteName(){ return this.siteName; }

    public String getSiteAddress(){
        return this.siteAddress;
    }

    public int getSiteIcon(){
        return this.siteIcon;
    }

    @Override
    public String toString(){
        return siteName+" "+siteAddress+" "+siteIcon;
    }
}
