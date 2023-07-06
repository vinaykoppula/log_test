package in.vinayit.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import in.vinayit.util.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}