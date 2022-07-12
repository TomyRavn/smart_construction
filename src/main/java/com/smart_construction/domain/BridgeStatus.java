package com.smart_construction.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tb_m_bridge_sttus")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BridgeStatus {

    @Id @GeneratedValue
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

}
