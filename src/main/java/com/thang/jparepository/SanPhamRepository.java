package com.thang.jparepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thang.entity.Sanpham;

public interface SanPhamRepository extends JpaRepository<Sanpham, Integer>{

}
