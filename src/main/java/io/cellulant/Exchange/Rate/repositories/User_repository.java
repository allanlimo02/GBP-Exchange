package io.cellulant.Exchange.Rate.repositories;

import io.cellulant.Exchange.Rate.dto.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_repository extends JpaRepository<UserDetails,Integer> {
}
