package com.test.Repsitory;

import com.test.dto.BookDto;
import com.test.dto.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<BookDto, Long> {

}
