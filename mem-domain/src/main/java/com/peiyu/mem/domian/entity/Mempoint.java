package com.peiyu.mem.domian.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2016/11/23.
 * 会员积分记录
 */
public class Mempoint implements Serializable {
    /**
     *记录编号<br/>
     **/
    private Long id;

    /**
     *商家ID<br/>
     **/
    private Long vendorId;

    /**
     *机构编码<br/>
     **/
    private String organCode;

    /**
     *机构名称<br/>
     **/
    private String organName;

    /**
     *门店编码<br/>
     **/
    private String storeCode;

    /**
     *门店名称<br/>
     **/
    private String storeName;

    /**
     *终端编号<br/>
     **/
    private String posCode;

    /**
     *会员号<br/>
     **/
    private String memNo;

    /**
     *会员名称<br/>
     **/
    private String memName;

    /**
     *会员类别<br/>
     **/
    private String memCatCode;

    /**
     *销售单号<br/>
     **/
    private String orderNo;

    /**
     *本次积分值<br/>
     **/
    private Double point;

    /**
     *类型 0积分冲减(销售单或者退货单) 1积分兑换(礼品兑换)  2积分调整(可以增加或者减少积分) 3积分零(退卡,或者积分清零操作)<br/>
     **/
    private Integer ptype;

    /**
     *积分来源(0表示pos端  1后台   2微店)<br/>
     **/
    private Integer psrc;

    /**
     *是否已删除1删除 0正常<br/>
     **/
    private Integer df;

    /**
     *备注<br/>
     **/
    private String memo;

    /**
     *创建日期<br/>
     **/
    private Date createDate;

    /**
     *修改日期<br/>
     **/
    private Date modifyDate;

    /**
     *创建人<br/>
     **/
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table mempoint
     *
     * @mbggenerated Tue Jun 23 16:01:56 GMT+08:00 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * 会员-积分综合统计-开始日期
     */
    private Date startDate;
    /**
     * 会员-积分综合统计-结束日期
     */
    private Date endDate;

    /**
     *会员类别名称，只是为了列表显示用，数据库中并没有此字段<br/>
     **/
    private String memCatName;

    public String getMemCatName() {
        return memCatName;
    }

    public void setMemCatName(String memCatName) {
        this.memCatName = memCatName;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVendorId() {
        return vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }
    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode == null ? null : posCode.trim();
    }
    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }
    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName == null ? null : memName.trim();
    }
    public String getMemCatCode() {
        return memCatCode;
    }

    public void setMemCatCode(String memCatCode) {
        this.memCatCode = memCatCode == null ? null : memCatCode.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Integer getPtype() {
        return ptype;
    }

    public void setPtype(Integer ptype) {
        this.ptype = ptype;
    }

    public Integer getPsrc() {
        return psrc;
    }

    public void setPsrc(Integer psrc) {
        this.psrc = psrc;
    }
    public Integer getDf() {
        return df;
    }

    public void setDf(Integer df) {
        this.df = df;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getCreator() {
        return creator;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }
}
