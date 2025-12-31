package com.example.HotelBooking.dtos;


import com.example.HotelBooking.entities.User;
import com.example.HotelBooking.enums.PaymentGateway;
import com.example.HotelBooking.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)


public class PaymentDTO {

    private Long id;
    private BookingDTO booking;


    private String transationId;


    private BigDecimal amount;

    private PaymentGateway paymentMethod;  //e,g Paypa  .Strip , flutterwave , paystack

    private LocalDateTime paymentDate;


    private PaymentStatus paymentStatus;  //failed , e.t.c

    private String bookingReference;
    private String failureReason;

   private User user;


   private String approvalLink;  //paypal payment approval UEL








}
