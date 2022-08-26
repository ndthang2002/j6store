package com.thang.entity;

import java.io.Serializable;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The persistent class for the sanpham database table.
 * 
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="sanpham")
@NamedQuery(name="Sanpham.findAll", query="SELECT s FROM Sanpham s")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int masp;

	private int soluong;

	private String tensp;



}