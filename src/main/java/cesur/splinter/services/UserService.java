package cesur.splinter.services;

import cesur.splinter.models.dto.UserDTO;

public interface UserService {
    UserDTO getUserByEmail(String email);
    void updateUser(UserDTO user);
    void deleteUser(Long id);
    void storeUser(UserDTO user);

}
