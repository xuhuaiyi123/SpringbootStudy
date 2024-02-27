package com.example.demo1.utils;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {

    private static long expire = 604800;
    private static String secret = "123456";
    public static String createToken(String username) {

        Date now=new Date();
        Date expireDate=new Date(now.getTime() + expire * 1000);
        return Jwts.builder()
                .setHeaderParam("type", "JWT")
                .setSubject(username)
                .setIssuedAt(now)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512, secret)
                .compact();
            }
            public static Claims getClaimsByToken(String token) {
                return Jwts.parser()
                        .setSigningKey(secret)
                        .parseClaimsJws(token)
                        .getBody();
            }
}
