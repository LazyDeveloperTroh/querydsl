package study.querydsl.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import study.querydsl.entity.Member;

@Data
public class MemberDto {
    private String username;
    private int age;

    public MemberDto() {}

    /**
     * DTO도 Q파일로 생성이 된다..
     * @param username
     * @param age
     */
    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
