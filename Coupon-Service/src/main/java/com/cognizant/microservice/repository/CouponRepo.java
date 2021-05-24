package com.cognizant.microservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.microservice.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	@Query(value="select * from coupon where coupon_code=?1",nativeQuery=true)
	public Coupon findByName(String couponId);

}
