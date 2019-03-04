package com.lnu.entity;

import java.util.Date;

/**
 * 订单实体
 * @Author：ccl
 * @Date：19-3-4
 */
public class TbOrder {

    private Long itemId;

    private Date created;

    private Date updated;

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "TbOrder{" +
                "itemId=" + itemId +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
