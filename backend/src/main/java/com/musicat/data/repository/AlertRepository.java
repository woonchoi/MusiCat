package com.musicat.data.repository;

import com.musicat.data.entity.Alert;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alert, Long> {

    // userSeq를 기준으로 모든 알림 조회
    public Optional<List<Alert>> findAllByUserSeq(long userSeq);

    // alertTitle을 기준으로 모든 알림 조회
    public Optional<List<Alert>> findAllByUserSeqAndAlertTitleContaining(long userSeq, String alertTitle);

    // alertContent를 기준으로 모든 알림 조회
    public Optional<List<Alert>> findAllByUserSeqAndAlertContentContaining(long userSeq, String alertContent);

    // alertTitle + alertContetnt 기준으로 모든 알림 조회
    public Optional<List<Alert>> findAllByUserSeqAndAlertTitleContainingOrAlertContentContaining(long userSeq, String alertTitle, String alertContent);

}
