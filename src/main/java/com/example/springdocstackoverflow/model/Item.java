package com.example.springdocstackoverflow.model;

import java.util.UUID;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString(callSuper = true)
@Accessors(chain = true)
@JsonIgnoreProperties("handler")
@Schema(name = "Item", description = "I.t.e.m")
@TableName(value = "item", autoResultMap = true)
public class Item extends Model<Item> {
	
	private static final long serialVersionUID = 1L;

	@Schema(name="id")
	@TableId
	private UUID id;


	@Schema(name="name")
	@TableField
	private String name;

	public Item(String name) {
		this.name = name;
	}
}
