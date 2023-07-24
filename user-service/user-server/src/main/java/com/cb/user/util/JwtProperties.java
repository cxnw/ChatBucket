package com.cb.user.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author durance
 */
@Configuration
@ConfigurationProperties(prefix = "security.jwt")
public class JwtProperties {

	/**
	 * jwt密钥
	 */
	public static String key;

	/**
	 * 签发者
	 */
	public static String issuer;

	/**
	 * 过期时间，单位：豪秒
	 */
	public static Long expiration;

	/**
	 * 免鉴权的接口
	 */
	public static String[] matchers;

	public void setKey(String key) {
		JwtProperties.key = key;
	}

	public void setIssuer(String issuer) {
		JwtProperties.issuer = issuer;
	}

	public void setExpiration(Long expiration) {
		JwtProperties.expiration = expiration;
	}

	public void setMatchers(String[] matchers) {
		JwtProperties.matchers = matchers;
	}

}
