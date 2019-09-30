package com.example.m8.domain.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
import java.util.Date;

/**
 * API設定テーブルモデルクラス。
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Entity
public class ApiSetting extends Base {

    /**
     * 初期移行API有効フラグ。
     */
    private Boolean enableInitApiFlg = false;

    /**
     * API有効フラグ。
     */
    private Boolean enableApiFlg = false;

    /**
     * アクセストークン。
     */
    private String accessToken;

    /**
     * アクセストークン有効期限。
     */
    private Date accessTokenExpired;

    /**
     * リフレッシュトークン。
     */
    private String refreshToken;

    /**
     * ＠PropertyAPI用のアクセストークン。
     */
    private String propertyAccessToken;

    /**
     * IPアドレス制限フラグ。
     */
    private Boolean ipAddressRestrictFlg = false;
}
