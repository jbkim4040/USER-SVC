package com.abacus.usersvc.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserEntity findUser(String id) throws Exception{
        /** 아이디 null 체크 */
        if(id == null) throw new IllegalArgumentException("아이디는 필수 항목입니다.\n아이디를 입력해주시기 바랍니다.");

        /** 유저 조회 */
        UserEntity userEntity = userRepository.findById(id).orElse(new UserEntity());

        /** 없을경우 에러발생 */
        if(userEntity.getId() == null) throw new Exception("존재하지 않는 고객입니다.");

        return userEntity;
    }

    public void saveUser(UserEntity userEntity) throws Exception{
        /** 아이디 null 체크 */
        if(userEntity == null) throw new IllegalArgumentException("고객정보는 필수 항목입니다.\n고객정보를 입력해주시기 바랍니다.");

        try{
            /** 고객정보 저장 */
            userRepository.save(userEntity);
        }catch (Exception e) {
            /** 고객정보 저장중에 문제 발생하면 에러 발생 */
            throw new IllegalStateException("고객정보 저장중에 에러가 발생했습니다.\n다시 시도해주시기 바랍니다.");
        }
    }
}
