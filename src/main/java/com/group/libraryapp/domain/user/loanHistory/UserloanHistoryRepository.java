package com.group.libraryapp.domain.user.loanHistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserloanHistoryRepository extends JpaRepository<UserLoanHistory, Long> {

    boolean existsByBookNameAndIsReturn(String name, boolean isReturn);

    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);
}
