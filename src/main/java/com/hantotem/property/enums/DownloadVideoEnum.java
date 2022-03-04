package com.hantotem.property.enums;

public enum DownloadVideoEnum {
    T1(1, "下载视频"),
    T2(2, "异常视频"),
    T3(3, "多画面下载视频"),
    T4(4, "多画面异常视频");

    private Integer cllxdm;
    private String cllxmc;

    DownloadVideoEnum(Integer cllxdm, String cllxmc) {
        this.cllxdm = cllxdm;
        this.cllxmc = cllxmc;
    }

    public Integer getCllxdm() {
        return cllxdm;
    }

    public void setCllxdm(Integer cllxdm) {
        this.cllxdm = cllxdm;
    }

    public String getCllxmc() {
        return cllxmc;
    }

    public void setCllxmc(String cllxmc) {
        this.cllxmc = cllxmc;
    }
}
