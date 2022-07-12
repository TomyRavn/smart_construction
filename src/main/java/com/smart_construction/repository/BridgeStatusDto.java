package com.smart_construction.repository;

import com.smart_construction.domain.BridgeStatus;
import lombok.Getter;

@Getter
public class BridgeStatusDto {

    private Long id;
    private String roadKnd;
    private String routeNm;
    private String fcltyNm;
    private String ctprvn;
    private String signgu;
    private String emd;
    private String li;
    private Double totLt;
    private Double totBt;
    private Double validBt;
    private Double hg;
    private Integer spanCo;
    private Double mxmmSpanLong;
    private String strctSuprr;
    private String strctLwprt;
    private String dsgnLd;
    private Integer vmtc;
    private String insttSe1;
    private String insttSe2;
    private String insttSe3;
    private Integer competYear;

    public BridgeStatusDto(BridgeStatus b) {
        id = b.getId();
        roadKnd = b.getRoadKnd();
        routeNm = b.getRouteNm();
        fcltyNm = b.getFcltyNm();
        ctprvn = b.getCtprvn();
        signgu = b.getSigngu();
        emd = b.getEmd();
        li = b.getLi();
        totLt = b.getTotLt();
        totBt = b.getTotBt();
        validBt = b.getValidBt();
        hg = b.getHg();
        spanCo = b.getSpanCo();
        mxmmSpanLong = b.getMxmmSpanLong();
        strctSuprr = b.getStrctSuprr();
        strctLwprt = b.getStrctLwprt();
        dsgnLd = b.getDsgnLd();
        vmtc = b.getVmtc();
        insttSe1 = b.getInsttSe1();
        insttSe2 = b.getInsttSe2();
        insttSe3 = b.getInsttSe3();
        competYear = b.getCompetYear();
    }

}
