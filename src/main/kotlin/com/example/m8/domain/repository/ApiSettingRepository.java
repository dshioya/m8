package com.example.m8.domain.repository;

import com.example.m8.domain.model.entity.ApiSetting;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * API設定テーブルモデルのリポジトリインターフェイス。
 */
public interface ApiSettingRepository extends JpaRepository<ApiSetting, Long>, JpaSpecificationExecutor<ApiSetting> {



}
