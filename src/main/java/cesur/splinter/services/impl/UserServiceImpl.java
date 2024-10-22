package cesur.splinter.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cesur.splinter.models.User;
import cesur.splinter.models.dto.UserDTO;
import cesur.splinter.models.utils.mappers.UserMapper;
import cesur.splinter.repositry.UserRepository;
import cesur.splinter.services.UserService;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.getUserByEmail(email).get();
        // UserDTO response = new UserDTO();
        //response.setActive(user.isActive());
        //response.setEmail(user.getEmail());
        //response.setId(user.getId());
        //response.setLastConnection(user.getLastconnection());
        //response.setName(user.getName());
        //response.setRol(user.getRol());

        return UserMapper.instance.userTouUserDTO(user);
    }

    @Override
    public void updateUser(UserDTO user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
        
    }

    @Override
    public void deleteUser(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void storeUser(UserDTO userFromControl) {
        User userToDb = UserMapper.instance.userDTOToUserDB(userFromControl);
        userRepository.save(userToDb);

        // User newUser = new User();
        // newUser.setActive(user.getActive());
        // newUser.setEmail(user.getEmail());
        // newUser.setPassword(user.getPassword());
        // newUser.setName(user.getName());
        // newUser.setRol(user.getRol());
        // userRepository.save(newUser);
    }

}
