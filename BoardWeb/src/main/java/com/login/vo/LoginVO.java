package com.login.vo;

import javax.websocket.Session;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginVO {
	String id;
	String pw;
}
