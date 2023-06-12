package com.click.pro.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.click.pro.domain.MacClick2;

public interface MacRepository extends CrudRepository<MacClick2, Long> {
	Optional<MacClick2> findByCheckname(String searchKeyword);
}
