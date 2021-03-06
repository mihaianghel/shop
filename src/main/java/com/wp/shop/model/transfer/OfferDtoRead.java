package com.wp.shop.model.transfer;

import com.wp.shop.util.Status;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode(exclude = "id")
public class OfferDtoRead {

    private Long id;
    private Long productId;
    private String description;
    private Integer price;
    private String currency;
    private Date startDate;
    private Date endDate;
    private Status status;

    @Override
    public String toString() {
        return "OfferDtoRead {" +
                "id=" + id +
                ", productId=" + productId +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status=" + status +
                '}';
    }
}
