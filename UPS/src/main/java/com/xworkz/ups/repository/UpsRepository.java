package com.xworkz.ups.repository;

import com.xworkz.ups.entity.UpsEntity;

import java.util.List;

public interface UpsRepository {
    String saveData(UpsEntity ups);

    List<UpsEntity> getUpsAllData();
}
